package com.example.haweatherapp.ui.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.haweatherapp.R

@Composable
fun WeeklyWeatherCard() {
    Card(
        modifier = Modifier
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.errorContainer),
        shape = RoundedCornerShape(36.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(20.dp)
        ) {
            DailyForecastCard()
            HorizontalDivider(modifier = Modifier
                .padding(vertical = 5.dp),
                thickness = 2.dp)
            DailyForecastCard()
            HorizontalDivider(modifier = Modifier
                .padding(vertical = 5.dp),
                thickness = 2.dp)
            DailyForecastCard()
            HorizontalDivider(modifier = Modifier
                .padding(vertical = 5.dp),
                thickness = 2.dp)
            DailyForecastCard()
            HorizontalDivider(modifier = Modifier
                .padding(vertical = 5.dp),
                thickness = 2.dp)
            DailyForecastCard()
            HorizontalDivider(modifier = Modifier
                .padding(vertical = 5.dp),
                thickness = 2.dp)
            DailyForecastCard()
        }
    }
}

@Composable
fun DailyForecastCard() {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Text("Monday")
        Spacer(modifier = Modifier.width(8.dp))
        Text("Rainy")
        Spacer(modifier = Modifier.width(8.dp))
        Image(painter = painterResource(id = R.drawable.sun_vector),
            contentDescription = "Sunny day",
            contentScale = ContentScale.Fit,
            modifier = Modifier.size(30.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text("25\u00B0C")
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text("25\u00B0C")
            HorizontalDivider(modifier = Modifier.width(30.dp),
                color = Color.DarkGray,
                thickness = 2.dp)
            Text("25\u00B0C")
        }

    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun WeeklyWeatherCardPreview() {
    WeeklyWeatherCard()
}