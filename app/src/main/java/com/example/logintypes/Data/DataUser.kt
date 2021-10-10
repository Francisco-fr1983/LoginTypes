package com.example.logintypes.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class DataUser (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
        var email: String = "",
        var password: String = "",

)
/*Onde ficaram os dados que estaram presente nos fragment, ou activitys, geralmente os dados serão iguais em todos.*/