package com.rbnico.simplyteachingandroid.views

import android.app.Application
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.rbnico.simplyteachingandroid.ui.theme.SimplyTeachingAndroidTheme
@Composable
fun LoginView(
    loginOnClick : () -> Unit
) {
    val onBackground = MaterialTheme.colors.onBackground

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = rememberImagePainter("https://ibb.co/MgCHGgc"),
            contentDescription = "Foto perro",
            modifier = Modifier
                .size(150.dp),
            contentScale = ContentScale.Crop,
        )
        Button(loginOnClick) {
            Text(text = "Login")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SimplyTeachingAndroidTheme {
        Surface() {
            LoginView({})
        }
    }
}