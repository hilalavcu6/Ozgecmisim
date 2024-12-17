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
fun ProjeDetay(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Proje Detay")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Yaptığımız proje, birden fazla sayfa arasında geçiş yapmayı sağlayan bir Jetpack Compose uygulamasıdır. Bu proje, kullanıcı dostu bir arayüzle birlikte kişisel bilgileri, projeleri ve iletişim bilgilerini organize bir şekilde sunmayı amaçlar.")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack("anasayfa", inclusive = false) }) {
            Text(text = "Anasayfaya Dön",)// "Anasayfaya Dönülecek")
        }
    }
}
