package com.example.codesignalpreparation.arcade.thejourneybegins

/**
 * Given an array of integers, find the pair of adjacent elements that has the largest product and return that product.

Example

For inputArray = [3, 6, -2, -5, 7, 3], the output should be
solution(inputArray) = 21.

7 and 3 produce the largest product.

Input/Output

[execution time limit] 3 seconds (kt)

[input] array.integer inputArray

An array of integers containing at least two elements.

Guaranteed constraints:
2 ≤ inputArray.length ≤ 10,
-1000 ≤ inputArray[i] ≤ 1000.

[output] integer

The largest product of adjacent elements.

[Kotlin] Syntax Tips

// Prints help message to the console
// Returns a string
fun helloWorld(name: String): String {
print("This prints to the console when you Run Tests");
return "Hello, " + name;
}
 */

fun main() {
    println(soluction(mutableListOf(3, 6, -2, -5, 7, 3)))
}

fun soluction(inputArray: MutableList<Int>): Int {
    var product = Int.MIN_VALUE
    (0 until inputArray.size).forEach {

        if (it + 1 < inputArray.size) {
            val first = inputArray[it]
            val second = inputArray[it + 1]
            if ((first * second) > product) {
                product = first * second
            }
        }
    }

    return product
}