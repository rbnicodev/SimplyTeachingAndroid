package com.rbnico.simplyteachingandroid.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.rbnico.simplyteachingandroid.model.DataProvider
import com.rbnico.simplyteachingandroid.model.User
import com.rbnico.simplyteachingandroid.model.UsersProvider
import com.rbnico.simplyteachingandroid.ui.theme.SimplyTeachingAndroidTheme
@ExperimentalCoilApi
@Composable
fun LoginView(
    loginOnClick : () -> Unit
) {
    val _user = remember { mutableStateOf("")}
        val passwordVisibility: MutableState<Boolean> = remember { mutableStateOf(false)}

    val _pass = remember { mutableStateOf("")}
    val logoString = if (isSystemInDarkTheme()) remember{
        mutableStateOf("https://i.ibb.co/V9ZPsFR/Darkt-Logo.png")
    } else remember {
        mutableStateOf("https://i.ibb.co/p0WWqrS/Light-Logo.png")
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Usuario",
            fontSize = 30.sp
        )
        TextField(
            value = _user.value,
            placeholder = { Text("User") },
//            label = { Text("User") },
            onValueChange = {_user.value = it},
            modifier = Modifier
                .padding(vertical = 15.dp)
        )
        Text(
            text = "Contraseña",
            fontSize = 30.sp
        )
        TextField(
            value = _pass.value,
            onValueChange = {_pass.value = it},
//            label = { Text("Password") },
            placeholder = { Text("Password") },
            visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                val image = if (passwordVisibility.value)
                    Icons.Filled.Visibility
                else Icons.Filled.VisibilityOff

                IconButton(onClick = {
                    passwordVisibility.value = !passwordVisibility.value
                }) {
                    Icon(imageVector  = image, "")
                }
            }
                    ,modifier = Modifier
                .padding(vertical = 15.dp)
        )
        Button(
            {
                UsersProvider.currentUser = User(_user.value, _pass.value)
                if(_user.value == "ruben" && _pass.value == "1234")
                    loginOnClick()
            },
            modifier = Modifier
                .padding(35.dp)

        ) {
            Text(
                text = "Iniciar Sesión",
                modifier = Modifier
                    .padding(25.dp, 10.dp),
                style = MaterialTheme.typography.button,
                fontSize = 20.sp
            )
        }
        Image(
            painter = rememberImagePainter(logoString.value),
            contentDescription = "LogoApp",
            modifier = Modifier
                .padding(vertical = 15.dp)
                .size(280.dp),
            contentScale = ContentScale.Fit,
        )
    }
}

