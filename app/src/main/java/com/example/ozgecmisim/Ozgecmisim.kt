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
fun Ozgecmisim(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Özgeçmişim")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Ben Hilal Avcu, 2000 doğumluyum ve İzmir Karabağlar’da yaşıyorum. Öğrenmeye açık, disiplinli ve ekip çalışmasına uyumlu bir yapıya sahibim. Yeni projeler ve oluşumlar içinde yer almak, katkı sağlamak ve kendimi geliştirmek benim için büyük bir motivasyon kaynağı. \n" +
                "\n" +
                "Frontend alanında kendimi geliştirmek için çalışıyorum. Javascript, HTML, CSS gibi teknolojilerle projeler yaptım ve Angular framework’ünde deneyim kazandım. Bunun yanı sıra Python ve SQL gibi dilleri de kullanarak farklı projeler geliştirdim.\n" +
                "\n" +
                "Eğitim hayatım boyunca öğrendiklerimi iş hayatında uygulama fırsatı buldum ve özellikle takım çalışması, proje yönetimi ve analiz süreçlerinde tecrübe kazandım. Şu anda kariyerime odaklanarak daha fazla bilgi edinmek, kendimi geliştirmek ve başarılı projeler üretmek istiyorum.")
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("iletisim") }) {
            Text(text = "İletişim")
        }
    }
}



