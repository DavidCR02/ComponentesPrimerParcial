package com.example.holamundo.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.holamundo.compartido.TarjetaView
import com.example.holamundo.compartido.TerminalView

@Preview(showBackground = true)
@Composable
fun ListadoView(){
    Column(modifier = Modifier.fillMaxSize()) {

        TerminalView()
        TerminalView()
        TerminalView()

        TarjetaView()
        TarjetaView(colorText = Color.Blue)
        TarjetaView(colorText = Color.Green)
        TarjetaView(colorText = Color.Cyan,
        background =  Color.Blue)
        TarjetaView(Color.LightGray, Color.Magenta)
    }
}
