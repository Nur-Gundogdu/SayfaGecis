package com.nurgundogdu.page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_b.*
import kotlinx.android.synthetic.main.activity_pagex.*

class Pagex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagex)

        button5.setOnClickListener {
            //myTextView.text ="Hello"
            val intent = Intent(this@Pagex,PageY::class.java)
            startActivity(intent)
            finish()
        }
    }
}