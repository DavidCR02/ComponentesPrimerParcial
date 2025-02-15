package com.example.holamundo.compartido

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TerminalView(){
    Text(text = "Este texto a repetir :D",
        modifier = Modifier.background(Color.Black)
            .border(width = 1.dp, color = Color.LightGray)
    ,
        color = Color.White)
}