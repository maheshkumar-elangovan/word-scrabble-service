package com.game.repository

import com.game.model.ScrabbleEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ScrabbleRepository: JpaRepository<ScrabbleEntity, Long> {
    fun findTop10ByOrderByScoreDesc(): List<ScrabbleEntity>
}