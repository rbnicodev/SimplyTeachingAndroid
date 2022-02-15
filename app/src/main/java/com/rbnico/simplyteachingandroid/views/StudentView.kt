package com.rbnico.simplyteachingandroid.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
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
import com.rbnico.simplyteachingandroid.*

@Composable
fun StudentView(
    noteClick: () -> Unit
){
    val student: Student = DataProvider.currentStudent
    val notes: List<Note> = student.notes

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        StudentItem(student) {}
        LazyColumn( contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)) {
            items(notes) {
                    note -> NoteItem(note) {noteClick() }
            }
        }
        Button(
            {
//                DataProvider.currentNote = Note(0, "")
                noteClick()
            },
            modifier = Modifier
                .padding(35.dp)

        ) {
            Text(
                text = "Añadir nota",
                modifier = Modifier
                    .padding(15.dp, 5.dp),
                style = MaterialTheme.typography.button,
                fontSize = 20.sp
            )
        }
    }
}