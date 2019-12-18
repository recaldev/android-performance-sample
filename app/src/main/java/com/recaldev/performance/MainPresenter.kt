package com.recaldev.performance

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable


class MainPresenter(
    private val repository: Repository,
    private val view: View
) {

    interface View {
        fun showNumberOfUsersMessage(numberOfUsers: Int)
    }

    private var compositeDisposable = CompositeDisposable()


    fun getUser(numberOfUsers: Int) {
        view.showNumberOfUsersMessage(repository.getUsers(numberOfUsers).size)
    }



    /*
    fun getUser(numberOfUsers: Int) {
        compositeDisposable.add(
            repository.getUsers(numberOfUsers)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ view.showNumberOfUsersMessage(it.size) },
                {})
        )
    }

     */
}