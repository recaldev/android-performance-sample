package com.recaldev.performance

class Repository {

    fun getUsers(): List<User> {
        val list = mutableListOf<User>()
        for (x in 1..NUMBER_OF_USERS) {
            list.add(User("gerard"))
        }
        return list
    }

    /*

    fun getUsers(): Single<MutableList<User>> {
        return Single.fromCallable {
            val list = mutableListOf<User>()
            for (x in 1..NUMBER_OF_USERS) {
                list.add(User("gerard"))
            }
            list
        }.subscribeOn(Schedulers.computation())
    }

     */

    companion object {
        private const val NUMBER_OF_USERS = 10
        //private const val NUMBER_OF_USERS = 10000000
    }
}


data class User(val username: String)