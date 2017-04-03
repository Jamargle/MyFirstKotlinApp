package com.jmlb0003.training1.myfirstkotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTextButton.setOnClickListener {
            val textToShow = inputEditText.text
            Toast.makeText(this, textToShow, Toast.LENGTH_SHORT).show()
        }
    }

}
