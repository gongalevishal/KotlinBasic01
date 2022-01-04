package com.ceinsys.kotlinbasic

fun main() {

    val numberList = arrayOf(1, 5, 8, 9, 10, 7, 15)
//    print(numberList.sorted())
//    print(numberList.first())

    val dayValue = mapOf(1 to "mon", 2 to "tue", 3 to "wed")

    val arralyList = arrayListOf(10.0, 20.0, 30.0, 40.0, 50.0)

    var total = 0.0

    for (list in arralyList) {
        total += list
    }

    val avg = total / arralyList.size

    print(avg)


}

data class Fruit(val name: String, val price: Double)