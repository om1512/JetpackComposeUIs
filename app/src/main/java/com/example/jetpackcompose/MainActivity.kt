package com.example.jetpackcompose

import android.content.ClipData.Item
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("om")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {

    Box(
        modifier = Modifier.fillMaxSize(),
     ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.align(Alignment.Center),
            fontSize = 20.sp,
            color = Color.Red
        )
        Text(
            text = "Hello other text!",
            modifier = Modifier.align(Alignment.Center)
        )
    }
//        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = null,
//            modifier = Modifier.fillMaxSize().background(Color.Black))
//        LazyRow(modifier = Modifier.fillMaxSize()) {
//                items(10){ i ->
//                    Icon(imageVector = Icons.Default.Add,
//                        contentDescription = null,
//                        Modifier.size(120.dp))
//                }
//        }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
    }
}