package com.jcjunior.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jcjunior.devhub.ui.theme.CustomBlue
import com.jcjunior.devhub.ui.theme.DevHubTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DevHubTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DeveloperInfoScreen()
                }
            }
        }
    }
}

@Composable
fun DeveloperInfoScreen() {
    Box (modifier = Modifier.fillMaxSize()){
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            shape = RoundedCornerShape(
                bottomEndPercent = 25,
                bottomStartPercent = 25
            ),
            color = CustomBlue
        ) {}

        Column(
            modifier = Modifier
                .padding(top = 60.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape),
                painter = painterResource(id = R.drawable.avatar_sample),
                contentDescription = null,
            )
            Column (horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Fulano da Silva", fontSize = 24.sp)
                Text(text = "fulanosilva-dev", fontWeight = FontWeight.Bold)
            }
            Text(text = "Desenvolvedor apaixonado por tecnologia e programação.", fontSize = 14.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DeveloperInfoPreview() {
    DevHubTheme {
        DeveloperInfoScreen()
    }
}
