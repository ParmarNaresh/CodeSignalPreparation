package com.example.codesignalpreparation.arcade.edgeoftheocean

fun main()
{
    println(soluction(3))
}

fun soluction(n:Int): Int{
    if(n==1)
    {
        return 1
    }else
    {
        return (n * n) + ((n-1) * (n-1) )
    }


}