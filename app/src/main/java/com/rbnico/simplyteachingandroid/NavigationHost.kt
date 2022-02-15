package com.rbnico.simplyteachingandroid

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.rbnico.simplyteachingandroid.views.LoginView
import com.rbnico.simplyteachingandroid.views.NoteView
import com.rbnico.simplyteachingandroid.views.StudentView
import com.rbnico.simplyteachingandroid.views.StudentsList


@ExperimentalCoilApi
@Composable
fun NavigationHost() {
    val navController = rememberNavController()
    val textFieldNote = remember{ mutableStateOf(DataProvider.currentNote.note)}

    NavHost(navController = navController, startDestination = Destinations.LoginView.route){
        composable(Destinations.LoginView.route) {
            LoginView() {
                navController.navigate(Destinations.StudentsList.route)
            }
        }
        composable(Destinations.StudentsList.route) {
            StudentsList() {
                navController.navigate(Destinations.StudentView.route)
            }
        }
        composable(Destinations.StudentView.route) {
            StudentView() {
                navController.navigate(Destinations.NoteView.route)
            }
        }
        composable(Destinations.NoteView.route) {
            NoteView()
        }
    }
}