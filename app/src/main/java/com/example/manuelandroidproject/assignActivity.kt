package com.example.manuelandroidproject

import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.manuelandroidproject.ui.theme.ManuelAndroidProjectTheme

class assignActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            assign()
        }
    }
}

@Composable
fun assign(){
    Column(modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.index), contentDescription = "pizza")
        Text(text = "Homemade veg pizza",
        fontSize = 40.sp,
        fontStyle = androidx.compose.ui.text.font.FontStyle.Italic,

        )

    }
}
@Preview(showBackground = true)
@Composable
fun assignPreview(){
    assign()
}