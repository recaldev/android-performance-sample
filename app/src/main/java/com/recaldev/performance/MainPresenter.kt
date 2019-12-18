package com.recaldev.performance

class MainPresenter(val repository: Repository) {

    interface View {
        // TODO
    }

    fun getUser(): List<User> {
        // TODO
        return repository.getUser()
    }
}