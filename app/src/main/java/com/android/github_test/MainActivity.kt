package com.android.github_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click.setOnClickListener {
            Toast.makeText(this, "You are doing this in the right order!", Toast.LENGTH_LONG).show();

        }
    }
}
