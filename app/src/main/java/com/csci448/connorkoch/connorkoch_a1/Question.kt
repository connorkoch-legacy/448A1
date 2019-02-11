package com.csci448.connorkoch.connorkoch_a1

data class Question(val textResId: Int, val isAnswerTrue: Boolean = false, val mcCorrectChoice: Int = -1, val frCorrectChoice: String = "")