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
import coil.annotation.ExperimentalCoilApi
import com.rbnico.simplyteachingandroid.StudentItem
import com.rbnico.simplyteachingandroid.*
import com.rbnico.simplyteachingandroid.model.DataProvider
import com.rbnico.simplyteachingandroid.model.Note
import com.rbnico.simplyteachingandroid.model.Student
import com.rbnico.simplyteachingandroid.model.StudentsProvider

@ExperimentalCoilApi
@Composable
fun StudentView(
    noteClick: () -> Unit,
    studentClick: () -> Unit,
    backClick: () -> Unit
){
    val student: Student = StudentsProvider.currentStudent
    val notes: List<Note> = student.notes!!

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        StudentItem(student) {
            StudentsProvider.newStudent = false
            studentClick()
        }
        Box(
            modifier = Modifier.padding(bottom = 10.dp)
        ) {
            Button(
                {
                    DataProvider.newNote = true
                    DataProvider.currentNote = Note(0, "")
                    noteClick()
                },
                modifier = Modifier
                    .padding(top = 20.dp)
                    .fillMaxWidth(0.8f)

            ) {
                Text(
                    text = "Añadir nota",
                    modifier = Modifier
                        .padding(8.dp, 2.dp),
                    style = MaterialTheme.typography.button,
                    fontSize = 15.sp
                )
            }
        }
        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
            reverseLayout = true,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(notes) {
                    note -> NoteItem(note) {
                        DataProvider.currentNote = note
                        DataProvider.newNote = false
                        noteClick()
                    }
            }
        }

    }
}