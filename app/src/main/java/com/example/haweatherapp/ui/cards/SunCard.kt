package com.example.haweatherapp.ui.cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.haweatherapp.R

@Composable
fun SunCard(
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxSize()
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.errorContainer),
        shape = RoundedCornerShape(36.dp)
    ) {
        Column(
            modifier = Modifier
                .padding(24.dp)  // Increased internal padding
        ) {
            Row {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.sunrise),
                    contentDescription = null,
                    modifier = Modifier
                        .size(54.dp)
                )
                Text(
                    text = "  SunRise \n  4:40am",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.padding(top = 16.dp))
            Row {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.sunset),
                    contentDescription = null,
                    modifier = Modifier
                        .size(54.dp)
                )
                Text(
                    text = "  SunSet \n  6:40pm",
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.Gray
                )
            }

        }
    }
}

@Preview
@Composable
fun SunCardPreview() {
    SunCard()
}