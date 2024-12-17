package com.example.ozgecmisim

import androidx.navigation.NavController
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


@Composable
fun Iletisim(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "İletişim")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text =
                "Adı Soyadı : Hilal Avcu  \n" +
                "E-posta : avcuhilal14@gmail.com  \n" +
                "Telefon : 0544 326 13 04  \n" +
                "Konum : Karabağlar, İzmir  \n"
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("projeDetay") }) {
            Text(text = "Proje Detay")
        }
    }
}
