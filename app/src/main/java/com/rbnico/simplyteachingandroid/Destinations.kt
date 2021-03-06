package com.rbnico.simplyteachingandroid

sealed class Destinations (
    val route: String
) {
    object StudentsList: Destinations("studentsList")
    object StudentView: Destinations("studentVew")
    object LoginView: Destinations("loginView")
    object NoteView: Destinations("noteView")
    object StudentAddView: Destinations("studentAddView")
}