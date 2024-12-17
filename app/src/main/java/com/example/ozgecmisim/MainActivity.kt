package com.example.ozgecmisim

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ozgecmisim.ui.theme.OzgecmisimTheme
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "anasayfa") {
                composable("anasayfa") { Anasayfa(navController) }
                composable("ozgecmisim") { Ozgecmisim(navController) }
                composable("iletisim") { Iletisim(navController) }
                composable("projeDetay") { ProjeDetay(navController) }
                composable("projelerim") { Projelerim(navController) }
            }
        }
    }
}
        @Preview(showBackground = true)
        @Composable
        fun GreetingPreview() {
            OzgecmisimTheme {

            }

        }
