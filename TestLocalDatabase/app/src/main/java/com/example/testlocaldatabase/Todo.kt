package com.example.testlocaldatabase

import androidx.room.Dao
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
class Todo (
    @PrimaryKey(autoGenerate = true)
        val id:Int,
        val title:String = "",
        val created_at: Date = Date()
)
