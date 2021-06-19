package com.meuprimeiroapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("lifecycle", "onCreat")



    }

    override fun onResume() {
        super.onResume()

        Log.i("lifecycle", "onResume")
    }

    override fun onStart() {
        super.onStart()

        Log.i("lifecycle", "onStart")
    }

    override fun onPause() {
        super.onPause()

        Log.i("lifecycle", "onPouse")
    }

    override fun onStop() {
        super.onStop()

        Log.i("lifecycle", "onStop")
    }
}