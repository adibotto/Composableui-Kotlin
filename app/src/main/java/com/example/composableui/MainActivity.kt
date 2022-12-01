package com.example.composableui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composableui.ui.theme.ComposableuiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposableuiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposableUiApp()
                }
            }
        }
    }
}

@Composable
fun ComposableUiApp() {
    val image = painterResource(R.drawable.android_logo)
    val icon = painterResource(R.drawable.ic_baseline_call_24)
    val icon2 = painterResource(R.drawable.ic_baseline_share_24)
    val icon3 = painterResource(R.drawable.ic_baseline_email_24)
    Box() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF033A4A))
                .fillMaxHeight()
                .padding(50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Spacer(Modifier.weight(2f))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                androidx.compose.foundation.Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp),
                )
                Text(
                    text = stringResource(R.string.full_name),
                    color = Color.White,
                    fontSize = 30.sp
                )
                Text(
                    text = stringResource(R.string.title),
                    color = Color(0xFF3ddc84),
                    fontWeight = FontWeight.Bold
                )
            }
            Spacer(Modifier.weight(2f))
            Column {
                    Row {
                        Icon(painter = icon, contentDescription = null, tint = Color(0xFF3ddc84), modifier = Modifier .padding(start = 20.dp, end = 20.dp, bottom = 5.dp))
                            Text(text = "+6281351482914", color = Color.White)

                    }
                    Row {
                        Icon(painter = icon2, contentDescription = null, tint = Color(0xFF3ddc84), modifier = Modifier .padding(start = 20.dp, end = 20.dp, bottom = 5.dp))
                        Text(text = "@Jayadiaja_", color = Color.White)
                    }
                    Row {
                        Icon(painter = icon3, contentDescription = null, tint = Color(0xFF3ddc84), modifier = Modifier .padding(start = 20.dp, end = 20.dp, bottom = 5.dp))
                        Text(text = "Ahmad.Jayadi.280@gmail.com", color = Color.White)
                    }
                }
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposableuiTheme {
        ComposableUiApp()
    }
}