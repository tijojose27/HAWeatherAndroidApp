package com.example.haweatherapp.ui.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.haweatherapp.R

@Composable
fun WeatherCard(
    temperature: Float = 70f,
    condition: String = "Sunny",
    pressure: Int = 800,
    visibility: Float = 3f,
    humidity: Int = 87,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.errorContainer),
        shape = RoundedCornerShape(36.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)  // Increased internal padding
        ) {

            Column(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,

            ) {
                Image(painter = painterResource(id = R.drawable.sun),
                    contentDescription = "Sunny day",
                    modifier = Modifier.size(150.dp)  )
                Text(
                    text = "${temperature.toInt()}°F",
                    style = MaterialTheme.typography.displayLarge,
                    color = Color.Gray
                )
                Text(
                    text = condition,
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color.Gray
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                MetricCard(
                    title = "Pressure",
                    value = "${pressure}mb",
                    modifier = Modifier.weight(1f),
                    containerColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.85f),
                    contentColor = Color.White
                )
                MetricCard(
                    title = "Visibility",
                    value = "${visibility}miles",
                    modifier = Modifier.weight(1f),
                    containerColor = Color(0xFF86EFAC).copy(alpha = 0.85f),
                    contentColor = Color.Gray
                )
                MetricCard(
                    title = "Humidity",
                    value = "$humidity%",
                    modifier = Modifier.weight(1f),
                    containerColor = Color.White.copy(alpha = 0.86f),
                    contentColor = Color.Gray
                )
            }
        }
    }
}

@Composable
private fun MetricCard(
    title: String,
    value: String,
    modifier: Modifier = Modifier,
    containerColor: Color,
    contentColor: Color
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = containerColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.labelSmall,
                color = contentColor
            )
            Text(
                text = value,
                style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                color = contentColor
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun WeatherCardPreview() {
    WeatherCard()
}