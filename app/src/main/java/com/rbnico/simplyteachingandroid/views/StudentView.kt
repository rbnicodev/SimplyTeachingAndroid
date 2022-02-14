package com.rbnico.simplyteachingandroid.views

import androidx.compose.runtime.Composable
import com.rbnico.simplyteachingandroid.DataProvider
import com.rbnico.simplyteachingandroid.Student

@Composable
fun StudentView(){
    val student: Student = DataProvider._currentStudent
}