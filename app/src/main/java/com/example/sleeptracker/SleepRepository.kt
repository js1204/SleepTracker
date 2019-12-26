package com.example.sleeptracker

import androidx.lifecycle.LiveData

class SleepRepository (private val sleepDao: SleepDao){

     val sleepList : LiveData<List<sleep>> = sleepDao.getSleep()

    suspend fun  insertSleep(sleep:sleep){
        sleepDao.insertSleep(sleep)
    }

}