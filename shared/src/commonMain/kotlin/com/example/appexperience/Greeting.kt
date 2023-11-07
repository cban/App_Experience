package com.example.appexperience

import kotlin.random.Random

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        val firstWord = if (Random.nextBoolean()) "Hi!" else "Hello!"
        return "${firstWord}, [$num]\\nGuess what it is! ${platform.name}!"
    }
}