package com.rbnico.simplyteachingandroid.model

import androidx.compose.runtime.*


object DataProvider {
     var studentsList = listOf(
        Student(
            "Jacinto",
            "Núñez",
            12,
            2,
            listOf(
                Note(1112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(2112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(3112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(4112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(5112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(6112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(7112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(8112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(9112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(10112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(11112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(12112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(13112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(14112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(15112021, "Este es el contenido de una nota de ejemplo para un alumno"),
                Note(16112021, "Este es el contenido de una nota de ejemplo para un alumno")
            ),
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
