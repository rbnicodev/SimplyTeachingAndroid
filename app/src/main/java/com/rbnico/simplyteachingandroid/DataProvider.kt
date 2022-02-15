package com.rbnico.simplyteachingandroid

import androidx.compose.runtime.*


object DataProvider {
     var studentsList = listOf(
        Student(
            "Jacinto",
            "Núñez",
            12,
            2,
            listOf(Note(0, "")),
            ""
        ),
         Student(
             "Eustaquio",
             "Sáez",
             7,
             1,
             listOf(Note(0, "")),
             ""
         ),
         Student(
             "Eneldo",
             "Anacardo",
             6,
             1,
             listOf(Note(0, "")),
             ""
         ),
         Student(
             "Ovidio",
             "Sánchez",
             16,
             5,
             listOf(Note(0, "")),
             ""
         ),
         Student(
             "Nicasio",
             "Forever",
             12,
             4,
             listOf(Note(0, "")),
             ""
         ),
         Student(
             "Rigodolfo",
             "Langostino",
             11,
             2,
             listOf(Note(0, "")),
             ""
         )
    )

    var currentStudent: Student = Student("Nombre","Apellidos",12,1, listOf(Note(0, "")), "")
    val _currentStudent: Student by mutableStateOf(currentStudent)

    var currentUser: User = User("", "")
    val _currentUser: User by mutableStateOf(currentUser)
}

