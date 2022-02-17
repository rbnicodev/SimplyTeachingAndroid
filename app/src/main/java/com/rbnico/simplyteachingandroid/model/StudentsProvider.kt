package com.rbnico.simplyteachingandroid.model

import android.widget.Toast
import androidx.room.Room
import com.rbnico.simplyteachingandroid.MainActivity
import com.rbnico.simplyteachingandroid.dao.StudentsRepository
import java.lang.Exception

object StudentsProvider {
    val repository:StudentsRepository = StudentsRepository()
    var studentsList: List<Student> = listOf(
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
        Student(name = "Eladio", "", 9, 2, listOf(), "")
    )




    fun getAll(): List<Student> {
        return studentsList
    }


    lateinit var currentStudent: Student

    var newStudent: Boolean = true

}