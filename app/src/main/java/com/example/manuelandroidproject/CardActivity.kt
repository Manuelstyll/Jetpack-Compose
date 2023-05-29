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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class CardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mycard()
        }
    }
}

@Composable
fun mycard(){
    var scrollState = rememberScrollState()
    Column(modifier = Modifier.fillMaxSize().verticalScroll(scrollState)) {

        //Card 1
        androidx.compose.material3.Text(text = "Breed", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Card(modifier = Modifier
            .padding(20.dp)
            .background(color = Color.Cyan)

        ) {
            androidx.compose.material3.Text(text = "Bulldog", fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.img), contentDescription = "Image",
                modifier = Modifier
                    .size(width = 250.dp, height = 250.dp)
                    .clip(shape = CircleShape)


            )
        }
            //Card 2
        Spacer(modifier = Modifier.height(20.dp))
        androidx.compose.material3.Text(text = "Breed", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Card(modifier = Modifier
            .padding(20.dp)
            .background(color = Color.Cyan)

        ) {
            androidx.compose.material3.Text(text = "Golden Retriever", fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.img_2), contentDescription = "Image",
                modifier = Modifier
                    .size(width = 250.dp, height = 250.dp)
                    .clip(shape = CircleShape)


            )
        }
           //Card 3
        Spacer(modifier = Modifier.height(20.dp))
        androidx.compose.material3.Text(text = "Breed", fontSize = 30.sp, fontWeight = FontWeight.Bold)
        Card(modifier = Modifier
            .padding(20.dp)
            .background(color = Color.Cyan)

        ) {
            androidx.compose.material3.Text(text = "German Shepherd", fontStyle = FontStyle.Italic)
            Image(painter = painterResource(id = R.drawable.img_3), contentDescription = "Image",
                modifier = Modifier
                    .size(width = 250.dp, height = 250.dp)
                    .clip(shape = CircleShape)


            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun mycardPreview(){
    mycard()
}