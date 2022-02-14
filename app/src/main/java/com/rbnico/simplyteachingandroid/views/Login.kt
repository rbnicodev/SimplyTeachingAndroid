package com.rbnico.simplyteachingandroid.views

import android.app.Application
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.rbnico.simplyteachingandroid.ui.theme.SimplyTeachingAndroidTheme
@ExperimentalCoilApi
@Composable
fun LoginView(
    loginOnClick : () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
//            colorFilter = ColorFilter.colo,
            painter = rememberImagePainter("https://i.ibb.co/cyr9Cy6/Logo-Aplicacion.png"),
            contentDescription = "LogoApp",
            modifier = Modifier
                .size(150.dp)
                .background(Color(0xFF0000)),
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