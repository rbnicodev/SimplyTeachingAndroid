package com.rbnico.simplyteachingandroid.model


data class Student (
    var name: String,
    var lastName: String?,
    var age: Int?,
    var course: Int?,
    var notes: List<Note>?,
    var photo: String?
)
