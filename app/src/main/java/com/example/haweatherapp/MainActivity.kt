package com.example.haweatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.haweatherapp.ui.cards.ClockCard
import com.example.haweatherapp.ui.cards.SunCard
import com.example.haweatherapp.ui.cards.WeatherCard
import com.example.haweatherapp.ui.theme.HAWeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HAWeatherAppTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    MainCardHolder(innerPadding)
                }
            }
        }
    }

}

@Composable
private fun MainCardHolder(innerPadding: PaddingValues) {
    Row(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
    ) {
        Column(modifier = Modifier.weight(1.5f)) {
            ClockCard(modifier = Modifier
                .weight(0.6f)
                .fillMaxWidth()
            )
            WeatherCard(modifier = Modifier.weight(2f))
        }
            Column(modifier = Modifier.weight(1f)) {
                WeatherCard(modifier = Modifier.weight(2.75f))
                SunCard(modifier = Modifier.weight(1f))
            }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_TABLET)
@Composable
fun WeatherCardPreview() {
    HAWeatherAppTheme {
        MainCardHolder(PaddingValues(16.dp))
    }
}