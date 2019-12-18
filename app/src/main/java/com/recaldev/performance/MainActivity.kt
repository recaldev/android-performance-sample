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
        button.setOnClickListener {
            textViewNumberOfUsers.text = "Number of users: ????"
            val numberOfUsers = editTextNumberOfUsers.text.toString()
            if (numberOfUsers.isNotEmpty()) {
                presenter.getUser(editTextNumberOfUsers.text.toString().toInt())
            }
        }
    }

    override fun onPause() {
        super.onPause()
        textViewNumberOfUsers.text = "Number of users: ????"
    }

    override fun showNumberOfUsersMessage(numberOfUsers: Int) {
        textViewNumberOfUsers.text = "Number of users: $numberOfUsers"
    }
}
