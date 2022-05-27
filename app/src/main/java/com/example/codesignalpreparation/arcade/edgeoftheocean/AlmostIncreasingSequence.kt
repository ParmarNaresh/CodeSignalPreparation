package com.example.codesignalpreparation.arcade.edgeoftheocean
class AlmostIncreasingSequence{


    fun soluction(sequence: MutableList<Int>): Boolean
    {
        val tempList: MutableList<Int> = mutableListOf()
        tempList.addAll(sequence)
        var removed=false
        //loop for removing same element
        for(index in 0 until sequence.size-1)
        {
            if(sequence[index+1]<=sequence[index])
            {
                if(!removed)
                {
                    removed=true
                    if(index<sequence.size-2)
                    {
                        if(sequence[index]<sequence[index+2])
                        {
                            tempList.removeAt(index+1)
                        }
                        else
                        {
                            tempList.removeAt(index)
                        }
                    }else{
                        tempList.removeAt(index+1)
                    }
                    break
                }
            }
        }
        var isDataInSequence=true
        for(index in 0 until tempList.size-1)
        {
            if(tempList[index+1]<=tempList[index])
            {
                isDataInSequence=false
            }
        }

        return isDataInSequence
    }
}
fun main()
{
    val almostIncreasingSequence=AlmostIncreasingSequence()
    //println(almostIncreasingSequence.soluction(mutableListOf(1, 3, 2, 1)))
    println(almostIncreasingSequence.soluction(mutableListOf(1, 3, 2)))
}