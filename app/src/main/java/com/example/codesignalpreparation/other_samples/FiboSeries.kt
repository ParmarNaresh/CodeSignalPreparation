package com.example.codesignalpreparation.other_samples

class FiboSeries {

    fun soluction(n:Int,memo:MutableMap<Int,Int> = mutableMapOf()):Int {
       if(memo.containsKey(n))
       {
           return memo[n]?:0
       }

         if(n<=2) return 1
         else
           memo[n]=  soluction(n-1)+soluction(n-2)
        println(memo)
        return memo[n]?:0
    }
    fun factorialNumber(n: Int):Int{
        println("N $n")
        if(n==1)
        {
             return n
        }
        else
             return (n+factorialNumber(n-1))


    }

}

fun canSum(targetSum:Int,numbers: MutableList<Int>): Boolean{
    println("targetSum $targetSum numbers $numbers")
    if(targetSum==0)
        return true
    if(targetSum<0)
        return false
    for(data in numbers)
    {
        var reminder=targetSum-data
        if(canSum(reminder,numbers))
        {
            return true
        }
    }

    return false
}

fun main()
{
    val fiboSeries=FiboSeries()
    println(fiboSeries.soluction(6))
    println(canSum(7, mutableListOf(5,3,4,7)))
   // println(fiboSeries.factorialNumber(1000))
}