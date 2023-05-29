package com.example.manuelandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class assignActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            morty()
        }
    }
}

@Composable
fun morty() {
    var scrollstate = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollstate),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Barbie
        Card(modifier = Modifier.fillMaxSize()) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.img_10),
                    contentDescription = "Barbie",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column {
                    androidx.compose.material3.Text(
                        text = "Barbie",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif,
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        //Morty
        Card(modifier = Modifier.fillMaxSize()) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.img_15),
                    contentDescription = "Morty",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column {
                    androidx.compose.material3.Text(
                        text = "Morty",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif,
                    )


                }
            }
        }


        Spacer(modifier = Modifier.height(10.dp))

        //Attila Starwar
        Card(modifier = Modifier.fillMaxSize()) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.img_11),
                    contentDescription = "Attila Starwar",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column {
                    androidx.compose.material3.Text(
                        text = "Attila starwar",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif,
                    )


                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        //Baby Legs
        Card(modifier = Modifier.fillMaxSize()) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.img_12),
                    contentDescription = "Baby legs",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column {
                    androidx.compose.material3.Text(
                        text = "Baby legs",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif,
                    )


                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        //Baby poopybutthole
        Card(modifier = Modifier.fillMaxSize()) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.img_13),
                    contentDescription = "Baby poopybutthole",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column {
                    androidx.compose.material3.Text(
                        text = "Baby poopybutthole",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif,
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))
        //Baby Wizard
        Card(modifier = Modifier.fillMaxSize()) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.img_14),
                    contentDescription = "Baby Wizard",
                    modifier = Modifier
                        .size(width = 150.dp, height = 150.dp)
                        .padding(top = 4.dp, bottom = 4.dp)
                )
                Column {
                    androidx.compose.material3.Text(
                        text = "Baby Wizard",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Human",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                    )
                    androidx.compose.material3.Text(
                        text = "Alive",
                        color = Color.Black,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Light,
                        fontFamily = FontFamily.SansSerif,
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun MortyPreview(){
    morty()
}