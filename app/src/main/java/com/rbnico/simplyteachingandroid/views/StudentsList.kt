package com.rbnico.simplyteachingandroid.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.rbnico.simplyteachingandroid.DataProvider
import com.rbnico.simplyteachingandroid.Student
import com.rbnico.simplyteachingandroid.StudentItem
import com.rbnico.simplyteachingandroid.User

@Composable
fun StudentsList(
    click: (Student) -> Unit
){
    val user: User = DataProvider._currentUser
    val students: List<Student> = DataProvider.studentsList

    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(students) {
            student -> StudentItem(student, click)
        }
    }
}