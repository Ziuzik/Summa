package com.example.vi4isleine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.slojenie.R
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ravno.setOnClickListener {
            Result.text = (vvod1.text.toString().toInt() + vvod2.text.toString().toInt()).toString()

        }

    }



}
