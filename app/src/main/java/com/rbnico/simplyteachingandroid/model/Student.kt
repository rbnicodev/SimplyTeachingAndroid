package com.rbnico.simplyteachingandroid.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Student (
    @PrimaryKey val uid: Int,
    val name: String,
    val lastName: String?,
    val age: Int?,
    val course: Int?,
    val notes: List<Note>?,
    val photo: String?
)
