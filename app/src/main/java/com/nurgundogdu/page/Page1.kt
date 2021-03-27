package com.nurgundogdu.page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page1.*

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)


        button4.setOnClickListener {
            val intent= Intent(this@Page1,PageB::class.java)
            startActivity(intent)
            finish()
        }
    }




}