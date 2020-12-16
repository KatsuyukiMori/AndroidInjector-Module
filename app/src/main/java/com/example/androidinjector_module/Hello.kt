package com.example.androidinjector_module

class Hello(private val name: String = "Dagger") {
    fun echo() = println("Hello $name")
}