package com.example.mytask.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Teacher (

    @PrimaryKey(autoGenerate = false)
    val teacherName: String,

    @ColumnInfo
    val teacherPhone: String,

    @ColumnInfo
    val teacherAge: Int
)