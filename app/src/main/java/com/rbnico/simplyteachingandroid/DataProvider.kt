package com.rbnico.simplyteachingandroid

import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.lifecycle.LiveData
import kotlin.properties.Delegates


object DataProvider {
    private var _studentsList = listOf(
        Student(
            "Jacinto",
            "Núñez",
            12,
            2
        )
    )

    private var _currentStudent: Student = Student("Nombre","Apellidos",12,1)
    val currentStudent: Student by mutableStateOf(_currentStudent)
}

