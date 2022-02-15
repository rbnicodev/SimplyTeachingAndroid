package com.rbnico.simplyteachingandroid.views

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import com.rbnico.simplyteachingandroid.DataProvider
import com.rbnico.simplyteachingandroid.Note

@Composable
fun NoteView(
) {
    val note: Note = DataProvider.currentNote
    var noteString by remember { mutableStateOf(DataProvider.currentNote.note)}
    Column() {
        TextField(
            value = noteString,
            onValueChange = { noteString = it}
        )
        Text(note.note)
    }

}