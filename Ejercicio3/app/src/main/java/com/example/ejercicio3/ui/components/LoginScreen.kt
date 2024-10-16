package com.example.ejercicio3.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun myLoginScreen(modifier: Modifier = Modifier) {
    var textUsuario by remember { mutableStateOf("")}
    var textContraseña by remember { mutableStateOf("")}
    Column { modifier }
        TextField(
            value = textUsuario,
            onValueChange = {textUsuario = it},
            label = { Text("Usuario")}
        )
    Spacer(Modifier.height(20.dp))
    TextField(
        value = textContraseña,
        onValueChange = {textContraseña = it},
        label = { Text("Contraseña")},
        maxLines = 1,
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent
        )
    )
}
