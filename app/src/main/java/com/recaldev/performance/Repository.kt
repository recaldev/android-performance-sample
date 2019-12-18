package com.recaldev.performance

import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

class Repository {

    fun getUsers(numberOfUsers: Int): List<User> {
        val list = mutableListOf<User>()
        for (x in 1..numberOfUsers) {
            list.add(User("gerard"))
        }
        return list
    }



    /*
    fun getUsers(numberOfUsers: Int): Single<MutableList<User>> {
        return Single.fromCallable {
            val list = mutableListOf<User>()
            for (x in 1..numberOfUsers) {
                list.add(User("gerard"))
            }
            list
        }.subscribeOn(Schedulers.computation())
    }
     */
}


data class User(val username: String)