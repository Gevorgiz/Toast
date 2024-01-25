package com.example.toastactivity

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

private lateinit var colorButton: Button
private lateinit var button_second : Button
private lateinit var layout_conteiner: LinearLayout
private var counter: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        colorButton = findViewById(R.id.change_color_button)
        layout_conteiner = findViewById(R.id.layout_conteiner)
        button_second = findViewById(R.id.button_second)


        colorButton.setOnClickListener {
            counter++
            colorButton.text = "Вы нажали $counter раз"
            colorButton.setBackgroundColor(Color.YELLOW)
        }

        button_second.setOnClickListener {
            counter++
            button_second.text = "Вы нажали $counter раз"
            button_second.setBackgroundColor(Color.BLUE)


        }
    }
}