package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.unit.dp


class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting2()
                }
            }
        }
    }
}

@Composable
fun Greeting2() {
    var name by remember {
        mutableStateOf("")
    }
    var nameList by remember {
        mutableStateOf(listOf<String>())
    }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(10.dp)) {
        Row(modifier = Modifier.fillMaxWidth()) {
                OutlinedTextField(value = name,modifier = Modifier.weight(1f),onValueChange = {
                        text -> name = text
                }
            )
            Spacer(modifier = Modifier.width(14.dp))
            Button(onClick = {
                if(name.isNotBlank()){
                    nameList = nameList + name
                    name = ""
                }
            }) {
                Text(text = "Add")
            }
        }
        LazyColumn{
            items(nameList){
                currentName -> Text(text = currentName)
                Divider()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    JetpackComposeTheme {
        Greeting2()
    }
}