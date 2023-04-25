package com.app.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun TestingTheme() {
    Column() {
        Row(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(100.dp)
                .background(MaterialTheme.colorScheme.primary)
        ) {}

        Box(modifier = Modifier
            .padding(8.dp)
            .size(100.dp)
            .clip(MaterialTheme.shapes.small)
            .background(MaterialTheme.colorScheme.primary)
        ) {
            //Text(text = "Theming", style = MaterialTheme.typography.h6)
        }
    }
}