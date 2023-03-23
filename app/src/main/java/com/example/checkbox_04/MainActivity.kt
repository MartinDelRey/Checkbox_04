package com.example.checkbox_04

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var txt:EditText
    lateinit var chkCursiva:CheckBox
    lateinit var chkNegrita:CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chkCursiva = findViewById(R.id.chkCursiva)
        chkNegrita = findViewById(R.id.chkNegrita)
        txt = findViewById(R.id.edNombre)
    }
    fun clickCheck(view: View){
        txt.typeface = Typeface.DEFAULT
        val checkPresionado: CheckBox = view as CheckBox

        if (chkNegrita.isChecked && chkCursiva.isChecked)
            txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD_ITALIC)

        else if(chkNegrita.isChecked)
                txt.typeface = Typeface.defaultFromStyle(Typeface.BOLD)

        else if(chkCursiva.isChecked){
            txt.typeface = Typeface.defaultFromStyle(Typeface.ITALIC)}

        }
    }
