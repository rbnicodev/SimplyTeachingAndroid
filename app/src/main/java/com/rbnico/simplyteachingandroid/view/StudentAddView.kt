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

@Composable
fun StudentAddView(
    saveClick: () -> Unit
) {
    val student: Student = Student("","",0,0, listOf(),"")
    var name by remember{ mutableStateOf(student.name)}
    var lastName by remember{ mutableStateOf(student.lastName)}
    var age by remember{ mutableStateOf("")}
    var course by remember{ mutableStateOf("")}


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
                TextField(value = lastName, onValueChange = {lastName = it})
                Text("Edad")
                TextField(value = age, onValueChange = {age = it})
                Text("Curso")
                TextField(value = course, onValueChange = {course = it})
            }
        }
        Button(
            {
                DataProvider.newStudent = false
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