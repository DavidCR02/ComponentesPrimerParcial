package com.example.holamundo.compartido

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TarjetaPreview(){
    TarjetaView(Color.Red, Color.Black, "BBVA", "42512 7896122322 ")

}

@Composable
fun TarjetaView(colorText: Color = Color.White, background: Color = Color.Gray){

    Card(
        colors = CardDefaults.cardColors(
            contentColor = colorText,
            containerColor = background

        )
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)) {
            Row() {
                Text(text = "HSBC 4227")
            }
            }

        }
    }
