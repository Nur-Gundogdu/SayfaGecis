package com.nurgundogdu.page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.e("onCreate", "Çalıştı")

        myButton.setOnClickListener {
            //myTextView.text ="Hello"
            val intent = Intent(this@MainActivity,Page1::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            //myTextView.text ="Hello"
            val intent = Intent(this@MainActivity,Pagex::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart", "Çalıştı")
    }
    override fun onResume() {
        super.onResume()
        Log.e("onResume", "Çalıştı")
    }
    override fun onPause() {
        super.onPause()
        Log.e("onPause", "Çalıştı")
    }
    override fun onStop() {
        super.onStop()
        Log.e("onStop", "Çalıştı")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy", "Çalıştı")
    }
    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart", "Çalıştı")
    }
}