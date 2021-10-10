package com.example.logintypes.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [DataUser::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun UserDao(): LoginsDao

    companion object{
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context) : AppDatabase {
            return INSTANCE?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "user_db"
                ).build()
                INSTANCE = instance
                instance

            }

        }
    }
}