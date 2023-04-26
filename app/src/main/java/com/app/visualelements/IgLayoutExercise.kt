package com.app.visualelements

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun IgLayoutExercise() {
    Column {
        val profileImage = painterResource(id = R.drawable.gon)

        val image1 = painterResource(id = R.drawable.rio)
        val image2 = painterResource(id = R.drawable.bh)
        val image3 = painterResource(id = R.drawable.sp)
        val image4 = painterResource(id = R.drawable.rio)
        val image5 = painterResource(id = R.drawable.bh)
        val image6 = painterResource(id = R.drawable.sp)

        //Header
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .height(150.dp)
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = profileImage,
                    contentDescription = "profile image",
                    modifier = Modifier.clip(CircleShape)
                )
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "120", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.posts), fontWeight = FontWeight.Bold)
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "1234", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.followers), fontWeight = FontWeight.Bold)
            }

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "567", fontWeight = FontWeight.Bold)
                Text(text = stringResource(id = R.string.following), fontWeight = FontWeight.Bold)
            }
        }

        //Info
        Column(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(1f)
        ) {
            Text(text = stringResource(id = R.string.user_name), fontWeight = FontWeight.Bold)
            Text(text = stringResource(id = R.string.ig_profile_description))
        }

        //Button
        Row(modifier = Modifier.padding(8.dp)) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.LightGray),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier.fillMaxWidth(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.ig_profile_button),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }

        //Posts
        Column() {
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                Image(
                    painter = image1,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = image2,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = image3,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding( bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Row(modifier = Modifier.fillMaxWidth(1f)) {
                Image(
                    painter = image4,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = image5,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding(end = 1.dp, bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
                Image(
                    painter = image6,
                    contentDescription = null,
                    modifier = Modifier
                        .weight(1f)
                        .aspectRatio(1f)
                        .padding( bottom = 1.dp),
                    contentScale = ContentScale.Crop
                )
            }
        }
    }
}