package com.rbnico.simplyteachingandroid.views

import android.app.Application
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    val logoString = if (isSystemInDarkTheme()) remember{
        mutableStateOf("https://i.ibb.co/V9ZPsFR/Darkt-Logo.png")
    } else remember {
        mutableStateOf("https://i.ibb.co/p0WWqrS/Light-Logo.png")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
//            colorFilter = ColorFilter.colo,
            painter = rememberImagePainter(logoString.value),
            contentDescription = "LogoApp",
            modifier = Modifier
                .size(280.dp),
            contentScale = ContentScale.Fit,
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