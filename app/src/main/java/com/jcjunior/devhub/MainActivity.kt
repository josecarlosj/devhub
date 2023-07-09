package com.jcjunior.devhub

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
                    DeveloperInfo()
                }
            }
        }
    }
}

@Composable
fun DeveloperInfo() {
    Column {
        Image(modifier = Modifier.size(200.dp) , painter = painterResource(
            id = R.drawable.avatar_sample),
            contentDescription = null
        )
        Text(text = "Fulano da Silva")
        Text(text = "fulanosilva-dev")
        Text(text = "Desenvolvedor apaixonado por tecnologia e programação.")
    }
}

@Preview(showBackground = true)
@Composable
fun DeveloperInfoPreview() {
    DevHubTheme {
        DeveloperInfo()
    }
}