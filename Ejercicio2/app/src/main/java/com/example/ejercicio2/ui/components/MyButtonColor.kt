package com.example.yourappname.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MyScreen2(name: String, color: Color, modifier: Modifier = Modifier) {
    var mostrarBoton by remember { mutableStateOf("Pulsa aquí") }
    Column(modifier) {
        Button(onClick = { mostrarBoton = "Ha cambiado el texto" },
            border = BorderStroke(3.dp,Color.Black),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Blue,
                color
            ),
            shape = RoundedCornerShape(4.dp)
            ) {
            Text(mostrarBoton)
        }
    }
}
