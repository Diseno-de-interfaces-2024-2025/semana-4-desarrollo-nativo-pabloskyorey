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
    var borderStroke by remember { mutableStateOf(BorderStroke(1.dp, Color.Black)) }
    var colorClick by remember { mutableStateOf(Color.White) }
    var containerColorClick by remember { mutableStateOf(Color.DarkGray) }
    var shapeClick by remember { mutableStateOf(RoundedCornerShape(20.dp)) }

    Column(modifier) {
        Button(
            onClick = {
                mostrarBoton = "Ha cambiado el texto"
                borderStroke = BorderStroke(3.dp, Color.Black)
                colorClick = Color.Black
                containerColorClick = color
                shapeClick = RoundedCornerShape(4.dp)
            },
            border = borderStroke,
            colors = ButtonDefaults.buttonColors(
                containerColor = containerColorClick,
                contentColor = colorClick
            ),
            shape = shapeClick
        ) {
            Text(mostrarBoton)
        }
    }
}
