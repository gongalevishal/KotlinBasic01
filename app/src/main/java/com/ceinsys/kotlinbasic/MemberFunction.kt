package com.ceinsys.kotlinbasic

fun main() {

    //create instance of class
    var person = Person("Vishal", "Bhai", 31)
    person.age = 33
    println("Person age is ${person.age}")
    person.hobby = "gaming"
    person.stateHobby()
//    val firstName = Person(lastName = "Vicky")

}

class Person(firstName: String = "Vikas", lastName: String = "Pawan") {

    var age: Int? = null
    var hobby: String = "Waching netflix"
    var myName : String? = null

    //    Initiliser box
    init {
        this.myName = firstName
        print("Initinlize new Person $firstName and $lastName ")
    }

//    member secondary contructor

    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
        print("Initinlize new Person $firstName and $lastName and age iss $age")
    }

    //    member function - mehtod
    fun stateHobby() {
        print("$myName hobby is $hobby")
    }
}