package com.game.service

import builder.TestDataBuilder
import com.game.repository.ScrabbleRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import kotlin.test.Test
import org.junit.jupiter.api.Assertions.assertEquals

class ScrabbleServiceTest {

    private val mockScrabbleRepository = mockk<ScrabbleRepository>()
    private val scrabbleService = ScrabbleService(mockScrabbleRepository)

    @Test
    fun testGetTopScores() {
        every { mockScrabbleRepository.findTop10ByOrderByScoreDesc() } returns listOf(
            TestDataBuilder.createScrabbleEntity(
                "Hello",
                10
            )
        )
        val actual = scrabbleService.getTopScores();
        assertEquals(actual, listOf(TestDataBuilder.createScrabbleResource("Hello", 10)))
    }

    @Test
    fun testSaveScore() {
        val entity = TestDataBuilder.createScrabbleEntity("Hello",10)
        every { mockScrabbleRepository.save(any()) } returns entity
        val result = scrabbleService.saveScore(TestDataBuilder.createScrabbleResource("Hello", 10));
        verify { mockScrabbleRepository.save(match { it.score == 10 }) }
       assertEquals(TestDataBuilder.createScrabbleResource("Hello", 10),result)
    }

}