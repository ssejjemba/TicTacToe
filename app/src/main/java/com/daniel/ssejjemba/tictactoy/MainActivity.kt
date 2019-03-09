package com.daniel.ssejjemba.tictactoy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun buClick(view:View){
        val btnPressed = view as Button

        when(btnPressed.id){
            R.id.bu1 -> {
                Log.d("ButtonPress", "Button 1 pressed")
            }
            R.id.bu2 -> {
                Log.d("ButtonPress", "Button 2 pressed")
            }
            R.id.bu3 -> {
                Log.d("ButtonPress", "Button 3 pressed")
            }
            R.id.bu4 -> {
                Log.d("ButtonPress", "Button 4 pressed")
            }
            R.id.bu5 -> {
                Log.d("ButtonPress", "Button 5 pressed")
            }
            R.id.bu6 -> {
                Log.d("ButtonPress", "Button 6 pressed")
            }
            R.id.bu7 -> {
                Log.d("ButtonPress", "Button 7 pressed")
            }
            R.id.bu8 -> {
                Log.d("ButtonPress", "Button 8 pressed")
            }
            R.id.bu9 -> {
                Log.d("ButtonPress", "Button 9 pressed")
            }
        }
    }
}
