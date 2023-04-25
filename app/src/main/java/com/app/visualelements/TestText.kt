package com.app.visualelements

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestText() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "A simple hardcoded text.")
        Text(text = stringResource(id = R.string.hello_text))
        Text(
            text = "Formatted Text",
            color = Color.Blue,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )

        val name = remember {
            mutableStateOf(TextFieldValue(""))
        }
        TextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text(text = "Name") },
            placeholder = { Text(text = "Your name") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )

        val surname = remember {
            mutableStateOf(TextFieldValue(""))
        }
        OutlinedTextField(
            value = surname.value,
            onValueChange = { surname.value = it },
            label = { Text(text = "Surname") },
            placeholder = { Text(text = "Write something...") })
    }

}