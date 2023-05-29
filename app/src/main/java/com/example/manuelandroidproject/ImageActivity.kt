package com.example.manuelandroidproject

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.manuelandroidproject.ui.theme.ManuelAndroidProjectTheme

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           image()
        }
    }
}

@Composable
fun image(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
        Text(text = "Breezy", color = androidx.compose.ui.graphics.Color.Red)
        Image(painter = painterResource(id = R.drawable.praise), contentDescription = "breezy")

        Row(modifier = Modifier.fillMaxSize()){
            Text(text = "Cartoon")
            Image(painter = painterResource(id = R.drawable.index), contentDescription = "pillow")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    image()
}