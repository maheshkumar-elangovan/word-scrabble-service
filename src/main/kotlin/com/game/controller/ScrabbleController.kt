package com.game.controller

import com.game.model.ScrabbleResource
import com.game.service.ScrabbleService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.PostMapping


@CrossOrigin
@RestController
@RequestMapping("api")
class ScrabbleController(private val service: ScrabbleService) {

    @GetMapping("/topscores")
    fun getTopScores(): ResponseEntity<List<ScrabbleResource>> {
        try {
            val scores = service.getTopScores()
            return ResponseEntity.ok(scores)
        } catch (e: Exception) {
            e.printStackTrace()
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
        }
    }

    @PostMapping("/savescore")
    fun createTask(@RequestBody scrabbleResource: ScrabbleResource): ResponseEntity<ScrabbleResource> {
        try {
            val resource = service.saveScore(scrabbleResource)
            return ResponseEntity.ok(resource)
        } catch (e: Exception) {
            e.printStackTrace()
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build()
        }
    }
}