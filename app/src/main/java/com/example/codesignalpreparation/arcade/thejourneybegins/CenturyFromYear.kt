package com.example.codesignalpreparation.arcade.thejourneybegins

fun main()
{
    println(soluction(1905))
}

fun soluction(year: Int): Int{
    val modeNumber=year.toDouble()/100
    return Math.ceil(modeNumber).toInt()
}