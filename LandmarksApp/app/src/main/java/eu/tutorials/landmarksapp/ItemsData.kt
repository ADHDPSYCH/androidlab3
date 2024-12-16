package eu.tutorials.landmarksapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

data class ItemsData(
    val id: Int,
    val title: String,
    val description: String,
    var image: Int,
    val detailDesc: String,
)