package com.rbnico.simplyteachingandroid

import androidx.compose.runtime.*


object DataProvider {
     var studentsList = listOf(
        Student(
            "Jacinto",
            "Núñez",
            12,
            2
        )
    )

    var currentStudent: Student = Student("Nombre","Apellidos",12,1)
    val _currentStudent: Student by mutableStateOf(currentStudent)

    var currentUser: User = User("", "")
    val _currentUser: User by mutableStateOf(currentUser)
}

