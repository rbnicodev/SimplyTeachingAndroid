package com.rbnico.simplyteachingandroid.data

import androidx.compose.runtime.*


object DataProvider {
     var studentsList = listOf(
        Student(
            "Jacinto",
            "Núñez",
            12,
            2,
            listOf(Note(13112021, "Se ha portado muy mal y no sabe cómo hacer la tarea")),
            ""
        ),
         Student(
             "Eustaquio",
             "Sáez",
             7,
             1,
             listOf(),
             ""
         ),
         Student(
             "Eneldo",
             "Anacardo",
             6,
             1,
             listOf(),
             ""
         ),
         Student(
             "Ovidio",
             "Sánchez",
             16,
             5,
             listOf(),
             ""
         ),
         Student(
             "Nicasio",
             "Forever",
             12,
             4,
             listOf(),
             ""
         ),
         Student(
             "Rigodolfo",
             "Langostino",
             11,
             2,
             listOf(),
             ""
         )
    )

    var currentStudent: Student = Student("Nombre","Apellidos",12,1, listOf(Note(0, "")), "")

    var currentUser: User = User("", "")
    val _currentUser: User by mutableStateOf(currentUser)

    var currentNote: Note = Note(0, "")

    var newNote: Boolean = true
    var newStudent: Boolean = true
}

