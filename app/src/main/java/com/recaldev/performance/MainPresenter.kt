package com.recaldev.performance

import io.reactivex.disposables.CompositeDisposable


class MainPresenter(
    private val repository: Repository,
    private val view: View
) {

    interface View {
        fun showNumberOfUsersMessage(numberOfUsers: Int)
    }

    private var compositeDisposable = CompositeDisposable()


    fun getUser() {
        view.showNumberOfUsersMessage(repository.getUsers().size)
    }


    /*
    fun getUser() {
        compositeDisposable.add(
            repository.getUser()
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ view.showNumberOfUsersMessage(it.size) },
                {})
        )
    }
    */
}