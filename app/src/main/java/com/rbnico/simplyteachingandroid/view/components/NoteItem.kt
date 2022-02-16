package com.rbnico.simplyteachingandroid

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rbnico.simplyteachingandroid.model.DataProvider
import com.rbnico.simplyteachingandroid.model.Note

@Composable
fun NoteItem(
    note: Note,
    click: () -> Unit
) {
    val day: String = (note.date/1000000).toString()
    val month: String = ((note.date/10000)%100).toString()
    val year: String = ((note.date)%10000).toString()
    Card(
        elevation = 5.dp,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                DataProvider.currentNote = note
                click()
            }

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(all = 20.dp)
        ) {
            Text(modifier = Modifier.padding(bottom = 15.dp),text = day + " / " + month + " / " + year)
            Text(note.note)
        }

    }
}