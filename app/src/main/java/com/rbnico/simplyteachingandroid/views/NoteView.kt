package com.rbnico.simplyteachingandroid.views

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.rbnico.simplyteachingandroid.DataProvider
import com.rbnico.simplyteachingandroid.Note

@Composable
fun NoteView(
) {
    val note: Note = DataProvider.currentNote
    Text(note.note)
}