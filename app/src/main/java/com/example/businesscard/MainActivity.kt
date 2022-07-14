package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
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
                    BusinessCard()
                }
            }
        }
    }
}

// my custom font
val myFont = FontFamily(
    Font(R.font.lexend_thin, FontWeight.Thin),
    Font(R.font.lexend_regular, FontWeight.Normal),
    Font(R.font.lexend_bold, FontWeight.Bold)
)

@Composable
fun BusinessCard() {
    Column(
        Modifier
            .background(Color.Black)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        // column image, name and job title
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 55.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = stringResource(R.string.android_image),
                Modifier.size(185.dp)
            )
            Text(
                text = stringResource(R.string.kelvin),
                fontSize = 80.sp,
                color = Color.White,
                fontFamily = myFont,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.developer),
                fontSize = 22.sp,
                color = colorResource(R.color.teal_700),
                fontFamily = myFont,
                fontWeight = FontWeight.Bold
            )
        }

        // column contacts and icons
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Icon(
                    imageVector = Icons.Outlined.Call,
                    contentDescription = stringResource(R.string.call_icon),
                    Modifier
                        .size(40.dp)
                        .weight(1f),
                    tint = colorResource(R.color.android_green)
                )
                Text(
                    text = stringResource(R.string.number),
                    Modifier.weight(3f),
                    Color.White,
                    fontSize = 23.sp,
                    fontFamily = myFont
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Icon(
                    imageVector = Icons.Outlined.Person,
                    contentDescription = stringResource(R.string.alias_icon),
                    Modifier
                        .size(40.dp)
                        .weight(1f),
                    tint = colorResource(R.color.android_green)
                )
                Text(
                    text = stringResource(R.string.alias),
                    Modifier.weight(3f),
                    Color.White,
                    fontSize = 23.sp,
                    fontFamily = myFont
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = stringResource(R.string.email_icon),
                    Modifier
                        .size(40.dp)
                        .weight(1f),
                    tint = colorResource(R.color.android_green)
                )
                Text(
                    text = stringResource(R.string.email),
                    Modifier.weight(3f),
                    Color.White,
                    fontSize = 23.sp,
                    fontFamily = myFont
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}