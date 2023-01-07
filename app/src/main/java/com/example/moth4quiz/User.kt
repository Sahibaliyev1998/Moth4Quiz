package com.example.moth4quiz

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey
    val id : Long,
    val name: String,
    val Surname:String,
    val age : String
)
