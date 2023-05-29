package com.example.manuelandroidproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()
        }
    }
}

@Composable
fun Text(){
    val mContext= LocalContext.current

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
    Text(text = "Welcome to Android",
        color = Color.Cyan,
        fontStyle = FontStyle.Italic,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.SansSerif,

    )
        //First Button
        Spacer(modifier = Modifier.height(20.dp))
            Button(onClick= {

                mContext.startActivity(Intent(mContext, LayoutActivity::class.java))
            },
                shape = RectangleShape
                ) {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
                Text(text = "layout")
            }
        
        //Second Button
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

            mContext.startActivity(Intent(mContext,ImageActivity::class.java))
        },
            shape = RectangleShape
            ){
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
            Text(text = "Image", color = Color.Blue)
    }

        //Third Button
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

            mContext.startActivity(Intent(mContext,assignActivity::class.java))
        },
            shape = RectangleShape
            ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
           Text(text = "Assignment", color = Color.Blue)
        }

        //Fourth Button
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick= {

            mContext.startActivity(Intent(mContext, TextfieldActivity::class.java))
        },
            shape = RectangleShape
            ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
            Text(text = "textfield")
        }


        //Fifth button
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick= {

            mContext.startActivity(Intent(mContext, ListActivity::class.java))
        },
        shape = RectangleShape
            ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
            Text(text = "ListActivity")
        }
         //Sixth Button
   Spacer(modifier = Modifier.height(20.dp))
        Button(onClick= {

            mContext.startActivity(Intent(mContext, CardActivity::class.java))
        },
            shape = RectangleShape
        ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
            Text(text = "CardActivity")
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick= {

            mContext.startActivity(Intent(mContext, assignActivity2::class.java))
        },
            shape = RectangleShape
        ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
            Text(text = "assignActivity2")
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick= {

            mContext.startActivity(Intent(mContext, assignActivity3::class.java))
        },
            shape = RectangleShape
        ) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "")
            Text(text = "assignActivity3")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Preview(){
    Text()
}
