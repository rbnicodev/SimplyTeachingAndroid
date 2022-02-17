package com.rbnico.simplyteachingandroid.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rbnico.simplyteachingandroid.model.DataProvider
import com.rbnico.simplyteachingandroid.model.Note
import com.rbnico.simplyteachingandroid.model.StudentsProvider
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
@Composable
fun NoteView(
    saveNoteClick: () -> Unit
) {

    val sdf = SimpleDateFormat("ddMMyyyy")
    val cDate = sdf.format(Date())
    val currentDate = Integer.parseInt(cDate.toString())


    val note: Note = if (DataProvider.newNote) Note(currentDate, "") else DataProvider.currentNote

    val Day: String = (note.date / 1000000).toString()
    val Month: String = ((note.date / 10000) % 100).toString()
    val Year: String = ((note.date) % 10000).toString()

    val intDay = Integer.parseInt(Day) * 1000000
    val intMonth = Integer.parseInt(Month) * 10000
    val intYear = Integer.parseInt(Year)

    val intDate = intDay + intMonth + intYear

    var noteString by remember { mutableStateOf(note.note) }


    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = saveNoteClick,
                backgroundColor = MaterialTheme.colors.primary) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "back"
                )
            }
        },
        floatingActionButtonPosition = FabPosition.End
    ) {
        Card(
            elevation = 20.dp,
            modifier = Modifier
                .padding(all = 20.dp)
                .fillMaxWidth()
                .wrapContentHeight()

        ) {
            Column(
                modifier = Modifier
                    .padding(all = 20.dp)
                    .fillMaxWidth()
                    .fillMaxHeight(0.9f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 15.dp),
                    text = Day + " / " + Month + " / " + Year,
                    fontWeight = FontWeight.Bold
                )
                TextField(
                    value = noteString,
                    onValueChange = { noteString = it },
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.8f)
                )
                Button(
                    {
                        saveNote(Note(intDate, noteString))
                        saveNoteClick()
                    },
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .fillMaxWidth(0.8f)

                ) {
                    Text(
                        text = "Guardar Nota",
                        modifier = Modifier
                            .padding(8.dp, 2.dp),
                        style = MaterialTheme.typography.button,
                        fontSize = 15.sp
                    )
                }

            }
        }
    }


}

fun saveNote(note: Note) {
    if(DataProvider.newNote) {
        StudentsProvider.currentStudent.notes = StudentsProvider.currentStudent.notes?.plus(listOf(note))
    } else {
        for(n in StudentsProvider.currentStudent.notes!!) {
            if(note.date == n.date)
                n.note = note.note
        }
    }

}



