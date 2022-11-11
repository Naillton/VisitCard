package com.example.visitcard

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
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ExperimentalGraphicsApi
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visitcard.ui.theme.VisitCardTheme
import java.util.Objects

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisitCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun ImageLogo() {
    val image = painterResource(R.drawable.android_logo)
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(140.dp)
                .width(140.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "Nailton Junior",
            fontSize = 36.sp,
            textAlign = TextAlign.Center,
            color = Color.White
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.Green
        )
    }
}

@Composable
fun InfoText() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center,
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, Color.White)
                .padding(10.dp)
                ) {
            Icon(
                Icons.Rounded.Phone,
                contentDescription = null,
                tint = Color.Green,
                modifier = Modifier
                    .padding(14.dp)
            )
            Text(
                text = "+55 (99) 99999-9999",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .padding(14.dp)

            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, Color.White,)
                .padding(10.dp)
        ) {
            Icon(
                Icons.Rounded.Share,
                contentDescription = null,
                tint = Color.Green,
                modifier = Modifier
                    .padding(14.dp)
            )
            Text(
                text = "@nailtonjr",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .padding(14.dp)

            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .border(width = 2.dp, Color.White,)
                .padding(10.dp)
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                tint = Color.Green,
                modifier = Modifier
                    .padding(14.dp)
            )
            Text(
                text = "juniorborges.bj@gmail.com",
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = Color.White,
                modifier = Modifier
                    .padding(14.dp)

            )
        }
    }
}

fun drawLine() {
    TODO("Not yet implemented")
}


@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .background(color = Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceAround,
    ){
        ImageLogo()
        InfoText()
    }
}

@Preview(showBackground = false)
@Composable
fun DefaultPreview() {
    VisitCardTheme {
        Greeting()
    }
}