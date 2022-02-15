package com.rbnico.simplyteachingandroid

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.rbnico.simplyteachingandroid.data.DataProvider
import com.rbnico.simplyteachingandroid.views.*


@ExperimentalCoilApi
@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    val textFieldNote = remember{ mutableStateOf(DataProvider.currentNote.note)}

    NavHost(navController = navController, startDestination = Destinations.LoginView.route){
        composable(Destinations.LoginView.route) {
            LoginView(
                loginOnClick = {navController.navigate(Destinations.StudentsList.route)}
            )
        }
        composable(Destinations.StudentsList.route) {
            StudentsList(
                studentClick = {navController.navigate(Destinations.StudentView.route)},
                addStudentClick = {navController.navigate(Destinations.StudentAddView.route)}
            )
        }
        composable(Destinations.StudentView.route) {
            StudentView(
                noteClick = {navController.navigate(Destinations.NoteView.route)},
                studentClick = {navController.navigate(Destinations.StudentAddView.route)},
                backClick = { navController.navigate(Destinations.StudentsList.route)}
            )
        }
        composable(Destinations.NoteView.route) {
            NoteView(
                saveNoteClick = { navController.navigate(Destinations.StudentView.route)}
            )
        }

        composable(Destinations.StudentAddView.route) {
            StudentAddView(
                saveClick = {navController.navigate(Destinations.StudentView.route)}
            )
        }
    }
}