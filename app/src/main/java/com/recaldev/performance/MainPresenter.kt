package com.recaldev.performance

private const val DESCRIPTION = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."

class MainPresenter {

    private lateinit var view: View

    interface View {
        fun loadData(friends: List<Friend>)
    }

    fun init(view: View) {
        this.view = view
        this.view.loadData(getMockedData())
    }

    private fun getMockedData(): List<Friend> {
        val friend1 = Friend("Diego Recalde", DESCRIPTION, R.drawable.icon1)
        val friend2 = Friend("Gerardo Suarez", DESCRIPTION, R.drawable.icon2)
        val friend3 = Friend("Alfredo Koch", DESCRIPTION, NO_AVATAR)
        val friend4 = Friend("Nathaly Mesa", DESCRIPTION, R.drawable.icon3)
        val friend5 = Friend("Santiago Carmona", DESCRIPTION, NO_AVATAR)
        val friend6 = Friend("Daniel Juarez", DESCRIPTION, R.drawable.icon4)
        val friend7 = Friend("Claudia Arcila", DESCRIPTION, R.drawable.icon5)
        val friend8 = Friend("Jorge Morales", DESCRIPTION, R.drawable.icon1)
        val friend9 = Friend("Gina Cerón", DESCRIPTION, NO_AVATAR)

        return listOf(
            friend1, friend2, friend3, friend4, friend5, friend6, friend7, friend8, friend9,
            friend1, friend2, friend3, friend4, friend5, friend6, friend7, friend8, friend9
        )
    }
}