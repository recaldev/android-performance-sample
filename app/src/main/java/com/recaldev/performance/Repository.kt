package com.recaldev.performance

import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class Repository {


    /*fun getUser(): List<User> {
        val list = mutableListOf<User>()
        for (x in 0..90000000) {
            list.add(User("gerard"))
        }
        return list
    }

     */

    fun getUser(): List<User> {
        return Single.fromCallable {
            val list = mutableListOf<User>()
            for (x in 0..90000000) {
                list.add(User("gerard"))
            }
            list
        }.subscribeOn(Schedulers.computation())
            .observeOn(AndroidSchedulers.mainThread())
            .blockingGet()
    }
}

data class User(val username: String)