package com.example.yourappname.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun MyScreen(modifier: Modifier = Modifier) {
    var mostrarBoton by remember { mutableStateOf("Pulsa aquí") }
    Column(modifier) {
        Button(onClick = { mostrarBoton = "Botón pulsado" }) {
            Text(mostrarBoton)
        }
    }
}
