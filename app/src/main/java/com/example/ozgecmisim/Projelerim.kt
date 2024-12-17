package com.example.ozgecmisim
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Projelerim(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Projelerim")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Jetpack Compose Projesi")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("projeDetay") }) {
            Text(text = "Proje Detay")
        }
    }
}
