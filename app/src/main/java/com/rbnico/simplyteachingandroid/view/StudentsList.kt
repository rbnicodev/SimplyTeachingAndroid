package com.rbnico.simplyteachingandroid.view

import StudentsViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.Observer
import coil.annotation.ExperimentalCoilApi
import com.rbnico.simplyteachingandroid.StudentItem
import com.rbnico.simplyteachingandroid.MainActivity
import com.rbnico.simplyteachingandroid.model.*

@ExperimentalCoilApi
@Composable
fun StudentsList(
    studentClick: () -> Unit,
    addStudentClick: () -> Unit
) {
    val viewModel: StudentsViewModel = StudentsViewModel()
    val user: User = UsersProvider.currentUser
    val students: List<Student> = StudentsProvider.studentsList!!
//    val _students by remember{ StudentsProvider.studentsList.g }

//    val students: MutableState<List<Student>> = remember {
//        mutableStateOf(viewModel.listStudents)
//    }

    Scaffold(

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier.padding(bottom = 20.dp),
                contentAlignment = Alignment.TopCenter
            ) {
                Button(
                    {
                        StudentsProvider.newStudent = true
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
                items(students) { student ->
                    StudentItem(student, studentClick)
                }
            }
        }
    }
}





