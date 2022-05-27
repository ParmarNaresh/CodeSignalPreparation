package com.example.codesignalpreparation.arcade.smoothsailing

class AllLongestStrings {

    fun soluction(inputArray: MutableList<String>):MutableList<String>{
        var largestStringLength=0
        for(index in 0 until inputArray.size)
        {
            if(largestStringLength<inputArray[index].length)
            {
                largestStringLength=inputArray[index].length
            }
        }
        var filteredList=inputArray.filter { it.length>=largestStringLength }
        var returnList= mutableListOf<String>()
        returnList.addAll(filteredList)
        return returnList
    }
}

fun main()
{
    val allLongestStrings=AllLongestStrings()
    println(allLongestStrings.soluction(mutableListOf("aba", "aa", "ad", "vcd", "aba")))
}