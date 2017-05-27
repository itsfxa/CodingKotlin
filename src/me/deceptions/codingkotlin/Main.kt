package me.deceptions.codingkotlin

/*
    This is why Kotlin was added to Android by Google.
    because it's so hot.
    Go learn Kotlin :3
    https://kotlinlang.org/docs/
 */

// Declaring vals
val name = "Corey"
val age = 16
val favouritelang = "Kotlin"

fun main(args: Array<String>) {
    introduce() // introduce myself
    hobbies() // tell my hobbies
    contact() // show contact things
}

fun introduce() {
    println("Hi, my name is $name.")
    println("I am $age years old.")
    println()
}

fun hobbies() {
    println("My hobbies are: ")
    println("Programming $favouritelang")
    println("Making stuff")
    println("using git commit -am")
    println()
}

fun contact() {
    println("My twitter is: @itsfxa")
    println("My spigot is: FXA")
    println("My discord is FXA#5868")
}