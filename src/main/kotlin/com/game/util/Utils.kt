package com.game.util

import com.game.model.ScrabbleEntity
import com.game.model.ScrabbleResource

class Utils {

    companion object {
        fun convertToScrabbleResource(entity: ScrabbleEntity): ScrabbleResource {
            return ScrabbleResource(entity.word, entity.score)
        }

        fun convertToEntity(scrabbleResource: ScrabbleResource): ScrabbleEntity {
            val entity = ScrabbleEntity()
            entity.word = scrabbleResource.word
            entity.score = scrabbleResource.score
            return entity
        }
    }
}