package com.example.compose_udemy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    Surface(
        color = Color.DarkGray,
        modifier = Modifier.fillMaxSize()
    ) {
        Row {
            HorizontalColoredBar(color = Color.White)
            HorizontalColoredBar(color = Color.Yellow)
            HorizontalColoredBar(color = Color.Magenta)
            HorizontalColoredBar(color = Color.Cyan)
            HorizontalColoredBar(color = Color.Blue)
            HorizontalColoredBar(color = Color.Red)
        }
    }
}

@Composable
fun HorizontalColoredBar(color: Color) {
    Surface(
        color = color,
        modifier = Modifier
            .height(600.dp)
            .width(60.dp)
    ) {
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MainScreen()
}

