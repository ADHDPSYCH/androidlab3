package eu.tutorials.landmarksapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun DetailScreen(
    navController: NavController,
    itemsData: ItemsData
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF081f5c))
                .padding(5.dp),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Go back",
                    tint = Color.White
                )
            }
        }


        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
        ) {
            item {
                Image(
                    painter = painterResource(id = itemsData.image),
                    contentDescription = itemsData.title,
                    modifier = Modifier.fillMaxWidth(),
                    contentScale = ContentScale.FillWidth
                )
            }

            item {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xFFBAD6EB)),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = itemsData.title,
                        fontWeight = FontWeight(700),
                        fontSize = 30.sp
                    )
                }
            }

            item {
                Spacer(modifier = Modifier.padding(1.dp))
                Column {
                    Text(text = itemsData.detailDesc)
                }
            }
        }
    }

}