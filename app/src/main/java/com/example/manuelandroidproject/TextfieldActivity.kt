package com.example.manuelandroidproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextfieldActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           form()
        }
    }
}




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun form(){

    val mContext= LocalContext.current
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "PERSONAL DETAILS", fontSize = 40.sp, color = Color.Black, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold)

        //Firstname
        var text by remember{ mutableStateOf("")}
        TextField(
            value = text,
            onValueChange ={text=it},
            label = { Text(text = "Firstname")},
            placeholder = { Text(text = "Enter firstname")},


            )

        //Middlename
        var mname by remember{ mutableStateOf("")}
        TextField(
            value = mname,
            onValueChange ={mname=it},
            label = { Text(text = "Middlename")},
            placeholder = { Text(text = "Enter middlename")},



        )

        //Surname
        var sname by remember{ mutableStateOf("")}
        TextField(
            value = sname,
            onValueChange ={sname=it},
            label = { Text(text = "Surname")},
            placeholder = { Text(text = "Enter Surname")},
        )

        //Email
        var myemail by remember{ mutableStateOf("")}
        TextField(
            value = myemail,
            onValueChange ={myemail=it},
            label = { Text(text = "Email")},
            placeholder = { Text(text = "Enter Enter")},

        )

        //Password
        var pass by remember{ mutableStateOf("")}
        TextField(
            value = pass,
            onValueChange ={pass=it},
            label = { Text(text = "Password")},
            placeholder = { Text(text = "Type your password")},
            modifier = Modifier
                .padding(20.dp)
                .background(color = Color.Gray),
            textStyle = TextStyle(color = Color.Red, fontStyle = FontStyle.Italic, fontWeight = FontWeight.Bold),



        )

        //Phone Number
       var phone by remember { mutableStateOf("") }
        TextField(
            value = phone,
            onValueChange ={phone=it},
            label = { Text(text = "Contact")},
            placeholder = { Text(text = "Enter phone number")},



        )

    }
}


@Preview(showBackground = true)
@Composable
fun formPreview(){
    form()
}