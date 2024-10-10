package com.example.ejercicio2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.ejercicio2.ui.theme.Ejercicio2Theme
import com.example.yourappname.components.MyScreen
import com.example.yourappname.components.MyScreen2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Ejercicio2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*MyScreen(
                        modifier = Modifier.padding(innerPadding)
                    )*/
                    MyScreen2(
                        modifier = Modifier.padding(innerPadding),
                        color = Color.Black,
                        name = ""
                    )
                }
            }
        }
    }
}

