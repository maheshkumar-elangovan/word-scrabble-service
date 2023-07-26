package builder

import com.game.model.ScrabbleEntity
import com.game.model.ScrabbleResource

class TestDataBuilder {

    companion object {
        fun createScrabbleEntity(word: String,score: Int): ScrabbleEntity{
            val entity = ScrabbleEntity();
            entity.surrId = 0
            entity.word = word
            entity.score = score
            return entity
        }

        fun createScrabbleResource(word: String,score: Int): ScrabbleResource {
            return ScrabbleResource(word, score);
        }

    }
}