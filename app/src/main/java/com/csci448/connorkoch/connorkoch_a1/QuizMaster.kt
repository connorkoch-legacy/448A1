package com.csci448.connorkoch.connorkoch_a1

import android.util.Log

object QuizMaster {
    private val questionBank: MutableList<Question> = mutableListOf()
    var currentScore = 0
    private var currentQuestionIndex = 0

    init {
        questionBank.add(Question(R.string.question1, false))
        questionBank.add(Question(R.string.question2, true))
        questionBank.add(Question(R.string.question3, true))
        questionBank.add(Question(R.string.question4, true))
        questionBank.add(Question(R.string.questionMC, mcCorrectChoice = 2))
        questionBank.add(Question(R.string.questionFR, frCorrectChoice = "pluto"))
        Log.d("TAG", questionBank[1].toString())
    }

    private fun getCurrentQuestion() = questionBank[currentQuestionIndex]
    fun getCurrentQuestionTextId() = getCurrentQuestion().textResId
    fun getCurrentAnswer() = getCurrentQuestion().isAnswerTrue

    fun moveToNextQuestion() {
        if(currentQuestionIndex == 5) currentQuestionIndex = 0
        else currentQuestionIndex++
    }

    fun moveToPreviousQuestion(){
        if(currentQuestionIndex == 0) currentQuestionIndex = 5
        else currentQuestionIndex--
    }

    fun isAnswerCorrect(ans: Boolean): Boolean{
        if(ans == getCurrentAnswer()) currentScore++
        return ans == getCurrentAnswer()
    }

}