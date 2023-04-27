package com.app.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun TestLazyLists() {

    val names = listOf("Igor", "Frederico", "Natália", "Amanda")
//    LazyColumn {
//        item { Text(text = "Header of the list", modifier = Modifier.height(100.dp)) }
//        items(names){ Text(text = "User: $it", modifier = Modifier.height(100.dp))
//        Divider()}
//        items(10){ Text(text = "User: $it", modifier = Modifier.height(100.dp))}
//    }

//    LazyRow{
//        item { Text(text = "Header of the list", modifier = Modifier.height(100.dp)) }
//        items(names){ Text(text = "User: $it", modifier = Modifier.height(100.dp))
//            Divider()}
//        items(10){ Text(text = "User: $it", modifier = Modifier.height(100.dp))}
//    }

    val imgList = listOf(
        R.drawable.rio,
        R.drawable.sp,
        R.drawable.bh)

    val gridImages = arrayListOf<Int>()
    for (i in 0..100){
        gridImages.add(imgList.random())
    }
    
    LazyVerticalGrid(columns = GridCells.Adaptive(100.dp)){
        items(gridImages){
            val painterRes = painterResource(id = it)
            Image(painter = painterRes, contentDescription = null,
            modifier = Modifier.aspectRatio(1f),
            contentScale = ContentScale.Crop)
        }
    }
}