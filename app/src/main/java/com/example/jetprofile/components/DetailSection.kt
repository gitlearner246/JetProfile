package com.example.jetprofile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetailSection() {
    Column(
        modifier = Modifier
            .background(Color.LightGray.copy(alpha = 0.3f))
            .clip(RoundedCornerShape(10.dp))
            .padding(horizontal = 10.dp, vertical = 20.dp)
            .fillMaxSize()
    ){
        Label(icon = Icons.Default.Favorite,
            text = "趣味: Talking",
            color = Color.Gray)
        Spacer(modifier = Modifier.height(10.dp))
        Label(icon = Icons.Default.LocationOn,
            text = "居住地：東京都大田区",
            color = Color.Gray)

    }
}