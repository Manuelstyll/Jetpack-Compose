package com.example.manuelandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.manuelandroidproject.ui.theme.ManuelAndroidProjectTheme

class LayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mytext()
        }
    }
}

@Composable
fun mytext(){
    Column(modifier = Modifier.fillMaxSize()){
        Text(text = "Hello There", fontSize = 40.sp, fontStyle = FontStyle.Normal)
        Text(text = "Android", fontSize = 40.sp, fontStyle = FontStyle.Italic)

        Row(modifier = Modifier.fillMaxWidth()) {
            Text(text = "Yes")
            Text(text = "No")

        }


    }

}

@Preview(showBackground = true)
@Composable
fun mytextpreview(){
    mytext()
}
