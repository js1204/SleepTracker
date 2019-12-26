package com.example.sleeptracker

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = arrayOf(sleep:: class),version = 1)
 abstract class SleepDatabase: RoomDatabase() {
    //create an instance of the DAO
    abstract fun sleepDao() : SleepDao

    companion object{
        //create an instance of the Room Database
        //singleton prevents multiple instances of the database
        private var INSTANCE: SleepDatabase?=null

        fun getDatabase(context : Context): SleepDatabase{
            val tempDB = INSTANCE
            if (tempDB != null){
                return tempDB
            }

            //create an instance of the database
            synchronized(this){
                val instance  = Room.databaseBuilder(context,SleepDatabase:: class.java, "sleep_db").build()

                INSTANCE = instance

                return instance
            }
        }
    }
}