package com.app.visualelements

import VisualElementsTheme
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisualElementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //TestModifiers()
                    //TestLayout()
                    //BuildLayout()
                    //TestText()
                    //TestingTheme()
                    //TestImages()
                    //TestButtons()
                    //IgLayoutExercise()
                    TestLazyLists()

                    val context = LocalContext.current
                    Toast.makeText(context, "Olá, como vai?", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}


