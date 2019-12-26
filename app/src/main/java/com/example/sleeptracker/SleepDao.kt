package com.example.sleeptracker

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface SleepDao {
    @Insert
   suspend fun insertSleep(Sleep: sleep)

    @Query("SELECT *  FROM Sleep")
    fun getSleep() :LiveData<List<sleep>>

    @Query("SELECT * FROM Sleep WHERE  id = :sleep_id")
    suspend fun getASleep(sleep_id : Int)

    @Update
    suspend fun updateSleep(Sleep: sleep)

    @Delete
    suspend fun deleteSleep(Sleep: sleep)
}