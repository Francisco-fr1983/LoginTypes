package com.example.logintypes.Data

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface LoginsDao {

    @Query("SELECT * FROM DataUser") /*Para Buscar os dados no banco de dados.*/
    fun getAll(): LiveData<List<DataUser>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(dataUser: DataUser)
}