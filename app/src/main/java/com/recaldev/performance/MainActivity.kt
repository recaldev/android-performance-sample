package com.recaldev.performance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(), MainPresenter.View {

    private lateinit var presenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(Repository())

    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "number of users: ${presenter.getUser().size}", Toast.LENGTH_LONG).show()
    }
}
