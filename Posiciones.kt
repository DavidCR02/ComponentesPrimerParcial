package com.example.holamundo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun Posiciones() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        // Top Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .align(Alignment.TopCenter),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Top Start", color = Color.White, textAlign = TextAlign.Center)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Blue),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Top", color = Color.White, textAlign = TextAlign.Center)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Magenta),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Top End", color = Color.White, textAlign = TextAlign.Center)
            }
        }

        // Center Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .align(Alignment.Center),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Center Start", color = Color.Black, textAlign = TextAlign.Center)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Center", color = Color.Black, textAlign = TextAlign.Center)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Black),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Center End", color = Color.White, textAlign = TextAlign.Center)
            }
        }

        // Bottom Row
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Cyan),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Bottom Start", color = Color.Black, textAlign = TextAlign.Center)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.DarkGray),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Bottom Center", color = Color.White, textAlign = TextAlign.Center)
            }

            Box(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(Color.Yellow),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Bottom End", color = Color.Black, textAlign = TextAlign.Center)
            }
        }
    }
}
