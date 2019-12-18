package com.recaldev.performance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainPresenter.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(Repository(), this)
    }

    override fun onResume() {
        super.onResume()
        presenter.getUser()
    }

    override fun showNumberOfUsersMessage(numberOfUsers: Int) {
        textViewNumberOfUsers.text = "Number of users: $numberOfUsers"
    }
}
