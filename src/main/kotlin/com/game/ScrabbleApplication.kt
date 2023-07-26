package com.game

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ScrabbleApplication

    fun main(args: Array<String>){
        runApplication<ScrabbleApplication>(*args)
    }