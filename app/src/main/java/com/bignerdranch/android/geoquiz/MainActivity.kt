package com.bignerdranch.android.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button //lateint is used when we decalre a variable but do not assign it a value.
    private lateinit var falseButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        findViewById is a method that we will be using a lot. the R class that is created on compile, is a a file that adds all the xml tags as objects/methods/classes that we can refer to in the kotlin
         */
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)

        /* the listener is a class that constantly looks for an input event associated with the button object
        This code is written as a lambda function
            lambda functions are unnamed functions
        This lambda function takes the view and associates it with the view of the button object.
         */
        //trueButton.setOnClickListener { view: View -> //we do not need to use the first view. we can replace this with a underscore since this is an anonymous function
        trueButton.setOnClickListener { _: View ->//we can use the underscore here since this is an anonymous function. we can do this because we are creating a new instance of View every time the button is clicked
            Toast.makeText(this,R.string.correct_toast, Toast.LENGTH_SHORT).show()
        }

        falseButton.setOnClickListener { view: View ->// we will leave this one as view:View instead of _: View.
            Toast.makeText(this,R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
        }
    }
}