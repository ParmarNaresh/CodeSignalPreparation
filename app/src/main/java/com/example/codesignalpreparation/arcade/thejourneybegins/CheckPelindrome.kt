package com.example.codesignalpreparation.arcade.thejourneybegins

fun main()
{
    println(soluction("aabaa"))
}

fun soluction(inputString:String): Boolean
{
    val reverseString=inputString.reversed()
    return reverseString==inputString
}