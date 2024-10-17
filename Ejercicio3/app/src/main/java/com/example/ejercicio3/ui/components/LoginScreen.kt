package com.example.ejercicio3.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyLoginScreen(modifier: Modifier = Modifier) {
    var textUsuario by remember { mutableStateOf("") }
    var textContraseña by remember { mutableStateOf("") }
    var mensaje by remember { mutableStateOf("") }
    var colorMensaje by remember { mutableStateOf(Color.Transparent) }

    Column(
        modifier = modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            value = textUsuario,
            onValueChange = { textUsuario = it },
            label = { Text("Usuario") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = textContraseña,
            onValueChange = { textContraseña = it },
            label = { Text("Contraseña") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                if (textUsuario == "admin" && textContraseña == "1234") {
                    mensaje = "Inicio de sesión exitoso"
                    colorMensaje = Color(0xFF4CAF50)
                } else {
                    mensaje = "Usuario o contraseña incorrectos"
                    colorMensaje = Color(0xFFF44336)
                }
            },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Acceder")
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = mensaje,
            color = colorMensaje,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
        )
    }
}
