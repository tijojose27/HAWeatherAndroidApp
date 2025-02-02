package com.example.haweatherapp.ui.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun AQICard(
    airQualityIndex: Int = 390,
    condition: String = "Partly Cloudy",
    pm: Int = 800,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp)
            .wrapContentSize()
            .widthIn(max = 400.dp)
            .heightIn(max = 380.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.errorContainer),
        shape = RoundedCornerShape(36.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)  // Increased internal padding
        ) {
            Text(
                text = "Air Quality",
                style = MaterialTheme.typography.headlineSmall,
                color = Color.Gray
            )

            Text(
                text = "Main Pollution : $pm",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.padding(top = 50.dp))

            Text(
                text = airQualityIndex.toString(),
                style = MaterialTheme.typography.displayLarge,
                color = Color.Gray
            )

        }
    }
}


@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun AQICardPreview() {
    AQICard()
}