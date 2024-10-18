package com.example.ejercicio4.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun myScreen(modifier: Modifier = Modifier) {
    var nombre by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var direccion by remember { mutableStateOf("")}
    var pais by remember { mutableStateOf("")}
    var mensaje by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color.Blue),
            contentAlignment = Alignment.Center
        ) {
            Text("Screen", color = Color.White)
        }
        Row(Modifier.fillMaxWidth().height(80.dp).background(Color.Green).horizontalScroll(
            rememberScrollState()),horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
        }
        Row(Modifier.fillMaxWidth().height(200.dp).background(Color.Transparent).padding(15.dp)) {
            Box(Modifier.clip(shape = RoundedCornerShape(10.dp)).size(200.dp).weight(1f).background(Color.Blue))
            Text(
                text = "Este es el texto dskbadgfjhgbsdgsdfbghsdjghjkssdnghjdhs" +
                        "jgjsdh dsbgbdf sg f s gf fddsjgkb sg gfs gfd " +
                        " gfd gdf g fd df  dgf gdf gf gdfgdfgdf sdgjbsfughsduuifsigfs" +
                        "fdsgjofhsiguhdfghsdfds sdsd",
                color = Color.Black,
                modifier = Modifier
                    .weight(1f)
                    .padding(16.dp)
            )
        }
        Row(Modifier.fillMaxWidth().height(50.dp).background(Color.Transparent),
            verticalAlignment = Alignment.CenterVertically,horizontalArrangement = Arrangement.Center){
            Text(
                text = "FORMULARIO",
                color = Color.Black,
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                TextField(
                    value = nombre,
                    onValueChange = { nombre = it },
                    label = { Text("Nombre") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = direccion,
                    onValueChange = { direccion = it },
                    label = { Text("Dirección") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = pais,
                    onValueChange = { pais = it },
                    label = { Text("País") },
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            ) {
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "$nombre",
                        color = Color.Black
                    )
                }
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "$email",
                        color = Color.Black
                    )
                }
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "$direccion",
                        color = Color.Black
                    )
                }
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "$pais",
                        color = Color.Black
                    )
                }
            }
        }
        Button(
            onClick = {
                mensaje = " $nombre, $email, $direccion, $pais"
            },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Actualizar")
        }
    }
}