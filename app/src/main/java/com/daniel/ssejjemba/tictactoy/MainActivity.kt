package com.daniel.ssejjemba.tictactoy

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    protected fun buClick(view:View){
        val btnPressed = view as Button

        var cellId:Int = 0
        when(btnPressed.id){
            R.id.bu1 -> {
                cellId = 1
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu2 -> {
                cellId = 2
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu3 -> {
                cellId = 3
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu4 -> {
                cellId = 4
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu5 -> {
                cellId = 5
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu6 -> {
                cellId = 6
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu7 -> {
                cellId = 7
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu8 -> {
                cellId = 8
                Log.d("ButtonPress", "Button $cellId pressed")
            }
            R.id.bu9 -> {
                cellId = 9
                Log.d("ButtonPress", "Button $cellId pressed")
            }

        }

        playGame(cellId, btnPressed)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var activePlayer = 1

    private fun playGame(callId:Int, btnPressed:Button){
        if(activePlayer == 1){
            btnPressed.text = "X"
            btnPressed.setBackgroundResource(R.color.blue)
            player1.add(callId)
            activePlayer = 2
            autoPlay()
        }else{
            btnPressed.text = "O"
            btnPressed.setBackgroundResource(R.color.darkgreen)
            player2.add(callId)
            activePlayer = 1
        }

        btnPressed.isEnabled = false
        checkWinner()


    }

    private fun checkWinner() {
        var winner = -1

        //row 1
        if(player1.contains(1)&&player1.contains(2)&&player1.contains(3)) winner = 1
        if(player2.contains(1)&&player2.contains(2)&&player2.contains(3)) winner = 2

        //row 2
        if(player1.contains(4)&&player1.contains(5)&&player1.contains(6)) winner = 1
        if(player2.contains(4)&&player2.contains(5)&&player2.contains(6)) winner = 2

        //row 3
        if(player1.contains(7)&&player1.contains(8)&&player1.contains(9)) winner = 1
        if(player2.contains(7)&&player2.contains(8)&&player2.contains(9)) winner = 2


        //col 1
        if(player1.contains(1)&&player1.contains(4)&&player1.contains(7)) winner = 1
        if(player2.contains(1)&&player2.contains(4)&&player2.contains(7)) winner = 2

        //col 2
        if(player1.contains(2)&&player1.contains(5)&&player1.contains(8)) winner = 1
        if(player2.contains(2)&&player2.contains(5)&&player2.contains(8)) winner = 2

        //col 3
        if(player1.contains(3)&&player1.contains(6)&&player1.contains(9)) winner = 1
        if(player2.contains(3)&&player2.contains(6)&&player2.contains(9)) winner = 2


        when(winner){
            1 -> {
                Toast.makeText(this, "Player $winner has won", Toast.LENGTH_LONG).show()
            }

            2 -> {
                Toast.makeText(this, "Player $winner has won", Toast.LENGTH_LONG).show()
            }

        }
    }

    private fun autoPlay(){
        val emptyCells = ArrayList<Int>()

        for (cellID in 1..9){
            if(!(player1.contains(cellID)||player2.contains(cellID))){
                emptyCells.add(cellID)
            }
        }

        val r = Random()
        val randomIndex = r.nextInt(emptyCells.size - 0) + 0
        val cellID = emptyCells[randomIndex]

        val buSelect:Button
        buSelect = when(cellID){
            1 -> bu1
            2 -> bu2
            3 -> bu3
            4 -> bu4
            5 -> bu5
            6 -> bu6
            7 -> bu7
            8 -> bu8
            9 -> bu9
            else -> bu9
        }

        playGame(cellID, buSelect)
    }
}
