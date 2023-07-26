package com.game.model

import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Column

@Entity
@Table(name="scrabble")
class ScrabbleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "surr_id")
    var surrId: Long = 0

    @Column(name = "word")
    var word: String = ""

    @Column(name = "score")
    var score: Int = 0


    override fun toString(): String{
        return surrId.toString()+word+score
    }

}