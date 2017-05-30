package me.deceptions.codingkotlin

import java.util.*

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
    day() // Tell the day
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

// Start of random code.

// Use of when method.
fun day() {
    val cal: Calendar = Calendar.getInstance()
    val day = cal.get(Calendar.DAY_OF_WEEK)
    when (day) {
        Calendar.SUNDAY -> {
            println("It is Sunday!")
        }
        Calendar.MONDAY -> {
            println("It is Monday!")
        }
        Calendar.TUESDAY -> {
            println("It is Tuesday!")
        }
        Calendar.WEDNESDAY -> {
            println("It is Wednesday!")
        }
        Calendar.THURSDAY -> {
            println("It is Thursday!")
        }
        Calendar.FRIDAY -> {
            println("It is Friday!")
        }
        Calendar.SATURDAY -> {
            println("It is Saturday!")
        }
    }
}

// Use of <x> method. TODO