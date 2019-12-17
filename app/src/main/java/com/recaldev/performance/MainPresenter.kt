package com.recaldev.performance

class MainPresenter {

    private lateinit var view: View

    interface View {
        fun loadData(globers: List<Glober>)
    }

    fun init(view: View) {
        this.view = view
        this.view.loadData(getMockedData())
    }

    private fun getMockedData(): List<Glober> {
        val glober1 = Glober(
            "Diego Recalde",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon1
        )

        val glober2 = Glober(
            "Gerardo Suarez",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon2
        )

        val glober3 = Glober(
            "Alfredo Koch",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        val glober4 = Glober(
            "Nathaly Mesa",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon3
        )

        val glober5 = Glober(
            "Santiago Carmona",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        val glober6 = Glober(
            "Daniel Juarez",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon4
        )

        val glober7 = Glober(
            "Claudia Arcila",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon5
        )

        val glober8 = Glober(
            "Jorge Morales",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            R.drawable.icon1
        )

        val glober9 = Glober(
            "Gina Cerón",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.",
            NO_AVATAR
        )

        return listOf(
            glober1, glober2, glober3, glober4, glober5, glober6, glober7, glober8, glober9,
            glober1, glober2, glober3, glober4, glober5, glober6, glober7, glober8, glober9
        )
    }
}