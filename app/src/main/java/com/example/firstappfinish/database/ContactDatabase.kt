package com.example.firstappfinish.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contact::class], version = 1, exportSchema = false)
abstract class ContactDatabase : RoomDatabase(){
    abstract val databaseDao: DatabaseDAO
    companion object{
        @Volatile
        private var INSTANCE: com.example.firstappfinish.database.ContactDatabase? = null
        fun getInstance(context: Context): com.example.firstappfinish.database.ContactDatabase {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        ContactDatabase::class.java,
                        "database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}