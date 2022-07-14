package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CardLayout()
                }
            }
        }
    }
}

@Composable
fun CardLayout() {
    Column(
        Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {

        Column() {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = null
            )
            Text(
                text = "RocketMan",
                fontSize = 55.sp,
                color = Color.White
            )
            Text(
                text = "Android Developer",
                fontSize = 15.sp,
                color = colorResource(R.color.teal_700)
            )
        }
        Column() {
            Row() {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = "Call Icon",
                    Modifier
                        .size(40.dp)
                        .weight(1f),
                    colorResource(R.color.teal_200)
                )
                Text(
                    text = "+254 712 345 678",
                    Modifier.weight(4f),
                    Color.White,
                    fontSize = 23.sp
                )
            }
            Row() {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = "Call Icon",
                    Modifier
                        .size(40.dp)
                        .weight(1f),
                    colorResource(R.color.teal_200)
                )
                Text(
                    text = "+254 712 345 678",
                    Modifier.weight(4f),
                    Color.White,
                    fontSize = 23.sp
                )
            }
            Row() {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "Call Icon",
                    Modifier
                        .size(40.dp)
                        .weight(1f),
                    colorResource(R.color.teal_200)
                )
                Text(
                    text = "myEmail@gmail.com",
                    Modifier.weight(4f),
                    Color.White,
                    fontSize = 23.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        CardLayout()
    }
}