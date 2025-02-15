package com.example.holamundo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Barras() {
    Column(
        modifier = Modifier
            .padding(0.dp)
            .width(300.dp)
            .height(450.dp)
            .background(Color.LightGray),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Parte superior
        Column(
            modifier = Modifier
                .padding(0.dp)
                .height(215.dp)
                .fillMaxWidth()
                .background(Color.White)
        ) {
            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(color = Color(0xFF121B3B))
            ) {}

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(color = Color(0xFF3CF07C))
            ) {}

            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(60.dp)
                    .background(color = Color(0xFF121B3B))
            ) {}
        }

        // Parte inferior
        Row(
            modifier = Modifier
                .padding(0.dp)
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .width(90.dp)
                    .fillMaxHeight()
                    .background(color = Color(0xFF121B3B))
            ) {}

            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .width(90.dp)
                    .fillMaxHeight()
                    .background(color = Color(0xFF3C6DF0 ))
            ) {}

            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .width(90.dp)
                    .fillMaxHeight()
                    .background(color = Color(0xFF121B3B))
            ) {}
        }
    }
}
