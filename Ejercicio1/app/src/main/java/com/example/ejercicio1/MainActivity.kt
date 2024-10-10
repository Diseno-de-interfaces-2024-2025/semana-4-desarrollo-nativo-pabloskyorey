package com.example.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme
import com.example.yourappname.components.MyText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyText(
                        text = "Android",
                        modifier = Modifier.padding(innerPadding),
                        fontSize = 40.sp,
                        textColor = androidx.compose.ui.graphics.Color.Blue
                    )
                }
            }
        }
    }
}



