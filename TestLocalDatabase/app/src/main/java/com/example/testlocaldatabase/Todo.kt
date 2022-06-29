package com.example.testlocaldatabase

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity(tableName = "todos")
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val title: String,
    val created_at: Date = Date()
)