package com.app.visualelements

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun TestLayout() {

//    Column(
//        verticalArrangement = Arrangement.SpaceEvenly,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
////        Text(text = "Hello Android")
////        Text(text = "How's it going")
//        Row(modifier = Modifier
//            .background(Color.Red)
//            .width(80.dp)
//            .height(30.dp)) {
//
//        }
//        Row(modifier = Modifier
//            .background(Color.Red)
//            .width(80.dp)
//            .height(30.dp)) {
//
//        }
//        Row(modifier = Modifier
//            .background(Color.Red)
//            .width(80.dp)
//            .height(30.dp)) {
//
//        }


    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize(1f).background(Color(0x3300ff00))
    ) {
        Text(text = "A bunch of text\non multiple lines\ndata loading")
        CircularProgressIndicator()
    }


}

