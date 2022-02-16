package com.rbnico.simplyteachingandroid.view

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rbnico.simplyteachingandroid.model.DataProvider
import com.rbnico.simplyteachingandroid.model.Student
import com.rbnico.simplyteachingandroid.model.StudentsProvider

@Composable
fun StudentAddView(
    saveClick: () -> Unit
) {
    val student: Student = if(StudentsProvider.newStudent) Student(100,"","",0,0, listOf(),"") else StudentsProvider.currentStudent
    var name by remember{ mutableStateOf(student.name)}
    var lastName by remember{ mutableStateOf(student.lastName)}
    val age: MutableState<String>
    var sAge = ""
    var sCourse = ""
    val course: MutableState<String>
    if(StudentsProvider.newStudent) {
        age = remember { mutableStateOf("")}
        course = remember { mutableStateOf("")}
    } else {
        sAge = student.age.toString()
        sCourse = student.course.toString()
        age = remember { mutableStateOf(sAge)}
        course = remember {mutableStateOf(sCourse)}
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(top = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Bold,
            text = "Nuevo Alumno"
        )
        Card(
            elevation = 20.dp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .padding(top = 20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.6f)
                    .padding(10.dp)
                    .padding(bottom = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Text("Nombre")
                TextField(value = name, onValueChange = {name = it})
                Text("Apellidos")
                lastName?.let { TextField(value = it, onValueChange = {lastName = it}) }
                Text("Edad")
                TextField(value = age.value, onValueChange = {age.value = it})
                Text("Curso")
                TextField(value = course.value, onValueChange = {course.value = it})
            }
        }
        Button(
            {
                StudentsProvider.newStudent = false
                saveClick()
            },
            modifier = Modifier
                .padding(top = 50.dp)
                .fillMaxWidth(0.8f)

        ) {
            Text(
                text = "Guardar Alumno",
                modifier = Modifier
                    .padding(8.dp, 2.dp),
                style = MaterialTheme.typography.button,
                fontSize = 15.sp
            )
        }
    }
}