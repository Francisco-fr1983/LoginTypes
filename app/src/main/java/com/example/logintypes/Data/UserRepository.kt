package com.example.logintypes.Data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class UserRepository(private val dao: LoginsDao)  {
    //Criar a função UserRepository para instanciar a classe.


    fun insert(dataUser: DataUser) = runBlocking {
        launch(Dispatchers.IO) {
            dao.insert(dataUser)

        }

    }
    fun getAll() = dao.getAll()
}