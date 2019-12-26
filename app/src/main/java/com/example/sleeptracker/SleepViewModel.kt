package com.example.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class SleepViewModel (application: Application) : AndroidViewModel(application){

    private val sleepRepository:SleepRepository

    val sleepList : LiveData<List<sleep>>

    init {
        val sleepDao :SleepDao = SleepDatabase.getDatabase(application).sleepDao()
        sleepRepository = SleepRepository(sleepDao)
        sleepList = sleepRepository.sleepList
    }

}