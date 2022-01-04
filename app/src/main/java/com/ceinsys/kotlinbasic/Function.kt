package com.ceinsys.kotlinbasic

fun main() {

 var name : String? = "Vishal"
//    name = null

    //elvis oprator
    val myName = name ?: "Bhai"
    print("My name is $myName")

    myName!!.toLowerCase()
}
