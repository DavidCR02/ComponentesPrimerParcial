package com.example.holamundo

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class MiObjeto(
    var esGrande: Boolean,
    val saludo: String,
    val redColorText: Color,
    val fontSizeText: TextUnit,
    val limite: Int
)

@Preview(showBackground = true)
@Composable
fun HolaMundoView() {
    val miObjeto = MiObjeto(
        esGrande = false,
        saludo = "Adiós Mundo",
        redColorText = Color.Red,
        fontSizeText = 32.sp,
        limite = 2
    )

    val saludo: String = miObjeto.saludo
    val redColorText: Color = miObjeto.redColorText
    val fontSizeText: TextUnit = miObjeto.fontSizeText
    val limite: Int = miObjeto.limite
    val esGrande: Boolean = miObjeto.esGrande

    Text(
        text = saludo,
        color = redColorText,
        fontSize = fontSizeText,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.ExtraBold,
        fontFamily = FontFamily.SansSerif,
        maxLines = if (esGrande) limite else 1,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .background(color = Color.Cyan)
            .padding(16.dp)
            .background(color = Color.Black)
            .padding(horizontal = 8.dp)
            .background(color = Color.Gray)
            .padding(top = 6.dp)
            .background(color = Color(0xA6AD6E6E)) // Color con transparencia
            .border(width = 3.dp, color = Color.Magenta)
            .fillMaxSize() // Ocupa todo el ancho y alto
            .blur(3.dp) // Difuminado
    )
}
