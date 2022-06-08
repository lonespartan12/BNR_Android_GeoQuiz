package com.bignerdranch.android.geoquiz

import androidx.annotation.StringRes // Q: What is all this and why am I importing it?
/*
this import statement allows us to use the @StringsRes annotation tool
 */
data class Question (@StringRes val textResId: Int, val answer: Boolean) // Q: I don't know what this line does. What is all this stuff?
// the data keyword is used to create the model classes that contain information that the UI will display.
// Question class holds a resource ID that is used for the question text, and and the question answer (true or false)
/*
@StringRes is not required but it can aid the code inspector(lint) verify at compile time that constructor calls provide a valid string resource ID.
    This helps to prevent runtime crashes.
The annotations also make the code more readable.
 */