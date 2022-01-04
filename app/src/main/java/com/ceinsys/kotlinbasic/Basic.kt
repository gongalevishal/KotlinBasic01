package com.ceinsys.kotlinbasic

fun main() {

    val myName = "Vishal"
    var myAge = 20
    var isEmply = true
    var latterchr = 'q'

    val firstCharInString = myName[0]
    val lasychart = myName[myName.length - 1]

//    print("Hello chear $lasychart")

//    Arithmatic operators (+,-,*,/,%)

    var result = 5 + 3
    val a = 5.3
    val b = 3

    var resultDouble: Double = a / b
    result = 15 % 3
//    print("Addition $resultDouble")

//    Assignment operators (+=,-=,*=,/=,%=)
    var myNum = 5
//    myNum %= 3
//    print("MyNum is $myNum")
//    increment and decrement (++,--)
//    myNum--
//    print("MyNum is $myNum")

//    val seasion = 6
//    when (seasion) {
//        1 -> print("its one")
//        2 -> print("its two")
//        3 -> print("its three")
//        4 -> {
//            print("failed")
//        }
//        else -> print("Vishal")
//    }

//    val month = 3
//    when(month){
//        in  3..5 -> print("winter")
//        in 6..9 -> print("rainyy")
//        else -> print("invalid")
//    }

//    val age = 33
//    when(age){
//        in 10..17 -> print("you are yonger")
//        in 18..22 -> print("you can voter")
//        in 23..150 -> print("you can do everyting")
//        33,34 -> print("you got marige")
//        else -> print("invalide")
//    }

//    while loop
//    var x = 1
//    while (x <= 10) {
//        print("$x")
//        x++
//    }
//    println("\n Loop done")

////    do while
//    var x = 15
//
//    do {
//        print("$x")
//        x++
//    }while (x<= 10)
//    println("\ndo while done")
//
//    var roomtemp = "cold"
//    var temp = 10
//
//    while (roomtemp == "cold"){
//        temp++
//        print("$temp")
//        if(temp >= 20){
//            roomtemp = "so cold"
//            print("its so cold now")
//        }
//    }

//    forloop
//    for (numm in 1..10){
//        print("$numm")
//    }
//
//    for (i in 10 downTo 1 step 2){
//        println("$i")
//    }

    for (i in 1 until 20) {
        // 10/5 = 5
        // 11/5 = 5.5 whitch is 5 in term in Int.

        if (i / 2 == 5) {
            continue
        }
        println("$i")
    }
    print("done loop")
}