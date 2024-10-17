package com.example.ejercicio4.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
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
fun myScreen(modifier: Modifier = Modifier) {
    var nombre by remember { mutableStateOf("")}
    var email by remember { mutableStateOf("")}
    var direccion by remember { mutableStateOf("")}
    var pais by remember { mutableStateOf("")}

    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Box(Modifier.fillMaxWidth().height(100.dp).background(Color.Blue)){
            Text("Screen")
        }
        Row(Modifier.fillMaxWidth().height(80.dp).background(Color.Green).horizontalScroll(
            rememberScrollState())  ) {
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Spacer(modifier = Modifier.width(20.dp))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Spacer(modifier = Modifier.width(20.dp))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Spacer(modifier = Modifier.width(20.dp))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Spacer(modifier = Modifier.width(20.dp))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
            Spacer(modifier = Modifier.width(20.dp))
            Box(Modifier.height(50.dp).width(50.dp).background(Color.LightGray))
        }
    }

}