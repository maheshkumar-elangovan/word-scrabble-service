package com.game.util

import builder.TestDataBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class UtilsTest {

    @Test
    fun testConvertToScrabbleResource_WhenScrabbleEntity_ThenReturnScrabbleResource(){
        val scrabbleResource = Utils.convertToScrabbleResource(TestDataBuilder.createScrabbleEntity("Hello",10))
        assertEquals(TestDataBuilder.createScrabbleResource("Hello",10), scrabbleResource)
    }

    @Test
    fun testConvertToEntity_WhenScrabbleResource_ThenReturnScrabbleEntity(){
        val scrabbleEntity = Utils.convertToEntity(TestDataBuilder.createScrabbleResource("Hello",10))
        val expected = TestDataBuilder.createScrabbleEntity("Hello",10);
        assertEquals(expected.word, scrabbleEntity.word)
        assertEquals(expected.score, scrabbleEntity.score)
    }
}