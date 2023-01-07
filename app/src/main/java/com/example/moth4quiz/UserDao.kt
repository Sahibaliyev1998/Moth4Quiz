package com.example.moth4quiz

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("Select * from user")
    fun getAll():List<User>

    @Insert
    fun insert(vararg user: User)
}