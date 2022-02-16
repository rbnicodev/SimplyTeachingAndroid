package com.rbnico.simplyteachingandroid.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.annotation.ExperimentalCoilApi
import com.rbnico.simplyteachingandroid.model.DataProvider
import com.rbnico.simplyteachingandroid.model.Student
import com.rbnico.simplyteachingandroid.StudentItem
import com.rbnico.simplyteachingandroid.model.User
import com.rbnico.simplyteachingandroid.vewmodel.StudentsViewModel

@ExperimentalCoilApi
@Composable
fun StudentsList(
    studentClick: () -> Unit,
    addStudentClick: () -> Unit
){
    val studentsViewModel: StudentsViewModel = StudentsViewModel()
    val user: User = DataProvider._currentUser
//    val students: List<Student> = studentsViewModel.studentsLiveData.value!!
    var students = DataProvider.studentsList

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(modifier = Modifier.padding(bottom = 20.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Button(
                {
                    DataProvider.newStudent = true
                    addStudentClick()
                },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(0.8f)

            ) {
                Text(
                    text = "Añadir alumno",
                    modifier = Modifier
                        .padding(8.dp, 2.dp),
                    style = MaterialTheme.typography.button,
                    fontSize = 15.sp
                )

            }
        }
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(students) {
                    student -> StudentItem(student, studentClick)
            }
        }
    }

}