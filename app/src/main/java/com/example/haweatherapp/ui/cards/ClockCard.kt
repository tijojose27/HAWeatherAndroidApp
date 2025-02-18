package com.example.haweatherapp.ui.cards

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.haweatherapp.R
import java.time.LocalTime
import java.time.format.DateTimeFormatter
import java.util.Locale

private val dotoFamily = FontFamily(
    Font(R.font.doto_light, FontWeight.Light),
    Font(R.font.doto_regular, FontWeight.Normal),
    Font(R.font.doto_medium, FontWeight.Medium),
    Font(R.font.doto_bold, FontWeight.Bold)
)

private val icelandFamily = FontFamily(
    Font(R.font.iceland_regular, FontWeight.Normal),
)

private val currentTime = LocalTime.now()

@Composable
fun ClockCard(
    modifier: Modifier = Modifier,
) {
    val formatter = remember {
        DateTimeFormatter
            .ofPattern("hh:mm a", Locale.US)
    }

    val formattedTime = remember(currentTime) {
        currentTime.format(formatter)
    }

    Text(
        text = formattedTime,
        fontSize = 190.sp,
        fontFamily = icelandFamily,
        fontWeight = FontWeight.Bold,
        color = Color.DarkGray,
        modifier = modifier.fillMaxWidth(),
        textAlign = TextAlign.Center,
    )
}

@Composable
@Preview
fun ClockCardDemo() {
    ClockCard()
}