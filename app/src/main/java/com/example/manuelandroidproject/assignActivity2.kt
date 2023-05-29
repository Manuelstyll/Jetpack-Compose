package com.example.manuelandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class assignActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            myfood()
        }
    }
}

@Composable
fun myfood() {
    var scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {

        //Card 1
        Card(
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.LightGray)

        ) {
            Image(
                painter = painterResource(id = R.drawable.img_4), contentDescription = "img",
                modifier = Modifier
                    .size(width = 400.dp, height = 400.dp)

            )
        }
        //Card 2
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.LightGray)

        ) {
            Image(
                painter = painterResource(id = R.drawable.img_5), contentDescription = "img",
                modifier = Modifier
                    .size(width = 400.dp, height = 400.dp)

            )
        }

        //Card 3
        Spacer(modifier = Modifier.height(20.dp))
        Card(
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.LightGray)

        ) {
            Image(
                painter = painterResource(id = R.drawable.img_6), contentDescription = "img",
                modifier = Modifier
                    .size(width = 400.dp, height = 400.dp)
            
            )
        }
    }


}
    @Preview(showBackground = true)
@Composable
fun myfoodPreview(){
myfood()
}
