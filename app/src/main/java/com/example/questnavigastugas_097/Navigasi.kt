package com.example.questnavigastugas_097

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

enum class Navigasi {
    HomeDepan,
    Formulir,
    TampilData
}
@Composable
fun Prak6App(
    navController: NavHostController = rememberNavController()
)
{
    Scaffold { innerPadding ->

    }

}