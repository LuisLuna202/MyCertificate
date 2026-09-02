package com.example.mycertifictate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mycertifictate.ui.theme.MyCertifictateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyCertifictateTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Luis Antonio Gonzalez Luna  ",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val number = 40
    val course= "Introducción a Jetpack Composed"
    val empresaFicticia = "Departamento de Android"

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Image(
            painter = painterResource(R.drawable.images),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.2F
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Image(
                    painter = painterResource(R.drawable.escudo1),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp, 50.dp)
                )
                Text(
                    text = empresaFicticia,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Image(
                    painter = painterResource(R.drawable.escudo2),
                    contentDescription = null,
                    modifier = Modifier.size(50.dp, 50.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))


            Text("This certificate is presented to")

            Spacer(modifier = Modifier.height(10.dp))


            Box(contentAlignment = Alignment.Center) {
                Image(
                    painter = painterResource(R.drawable.images),
                    contentDescription = null,
                    modifier = Modifier.fillMaxWidth().height(90.dp)
                )

                Text(
                    "$name",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth().padding(vertical = 10.dp)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))


            Text(
                "has completed a $number hours course on"
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = course,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(40.dp))


            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("_____________")
                    Text("Director de Curso")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("____________")
                    Text("Supervisor General")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyCertifictateTheme {
        Greeting("Luis Luna")
    }
}