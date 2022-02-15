package com.rbnico.simplyteachingandroid

data class Student (
    val name: String,
    val lastName: String,
    val age: Int,
    val course: Int,
    val notes: List<Note>,
    val photo: String
)
