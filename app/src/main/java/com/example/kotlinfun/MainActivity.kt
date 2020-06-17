package com.example.kotlinfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var count = 0

    fun reset(view: View) {
        count = 0
        textView.setText(count.toString())



    }

    fun plusOne (view: View) {
        count++
        textView.setText(count.toString())

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
    }
}
