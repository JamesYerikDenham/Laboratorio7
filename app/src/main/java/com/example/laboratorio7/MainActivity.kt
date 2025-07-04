package com.example.laboratorio7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Laboratorio7 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCardScreen()
                }
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen del bot
        Image(
            painter = painterResource(id = R.drawable.bot_avatar),
            contentDescription = "Avatar",
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.LightGray)
        )



        Spacer(modifier = Modifier.height(8.dp))

        Text("James Denham", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text("Estudiante de Ingeniería en Software", fontSize = 16.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(20.dp))

        ContactSection()
        Spacer(modifier = Modifier.height(20.dp))

        SkillsSection()
    }
}

@Composable
fun ContactSection() {

    Spacer(modifier = Modifier.height(16.dp))

    // Título centrado
    Text(
        text = "Información Personal",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text("Correo: yerik2814@gmail.com")
        Text("Numero Télefonico: +507 6738-7627")
        Text("Linkedin: linkedin.com/in/james-denham-4a040b2b2")
        Text("Github: https://github.com/JamesYerikDenham")
    }
}

@Composable
fun SkillsSection() {
    Column(horizontalAlignment = Alignment.Start) {
        Text("Habilidades:", fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SkillChip("Python")
            SkillChip("Kotlin")
            SkillChip("CSS")
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SkillChip("Android")
            SkillChip("IA")
            SkillChip("Packet Tracer")
        }
    }
}

@Composable
fun SkillChip(skill: String) {
    Surface(
        color = Color(0xFFBBDEFB),
        shape = RoundedCornerShape(12.dp),
        elevation = 2.dp
    ) {
        Text(
            text = skill,
            modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp),
            fontSize = 14.sp
        )
    }
}
