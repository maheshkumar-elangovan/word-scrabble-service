package com.game.service

import com.game.model.ScrabbleEntity
import com.game.model.ScrabbleResource
import com.game.repository.ScrabbleRepository
import com.game.util.Utils
import org.springframework.stereotype.Service


@Service
class ScrabbleService(private val repository: ScrabbleRepository)  {

    fun getTopScores(): List<ScrabbleResource> {
        val entities: List<ScrabbleEntity> = repository.findTop10ByOrderByScoreDesc()
        return entities.map { entity -> Utils.convertToScrabbleResource(entity) }
    }

    fun saveScore(resource: ScrabbleResource): ScrabbleResource{
        val entity: ScrabbleEntity = Utils.convertToEntity(resource)
        return Utils.convertToScrabbleResource(repository.save(entity))
    }

}