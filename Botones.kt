package com.example.holamundo.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holamundo.R

@Preview
@Composable
fun BotonesView() {


    var texto by remember {
        mutableStateOf("Que hay")
    }
    var cambio by remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.neymar),
            contentDescription = "fondo",
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .align(Alignment.TopEnd),
            contentScale = ContentScale.Crop,
            alpha = 0.8f
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .height(100.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Divider(modifier = Modifier)
            Text(text = texto,
                color = Color.Black,
                textAlign = TextAlign.Center)
            Divider(modifier = Modifier)


            Button(onClick = {
                if(!cambio) {
                    texto = "Hola a todos"
                }
                else {
                    texto = "Hola amigo"
                }
                cambio = cambio

                if(cambio == true)
                    cambio = false

                if(cambio == false)
                    cambio = true


            },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Green
                )
            ){
                Text(text = "Cambiar Texto", textAlign = TextAlign.Center)
            }

        }

        Box(
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .background(Color.Black)
                .fillMaxWidth()
                .height(60.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Abajo", color = Color.White)
        }

        Icon(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "icono",
            modifier = Modifier
                .align(Alignment.Center)
                .offset(x = -50.dp, y = -40.dp)
                .size(100.dp)
        )
    }
}
