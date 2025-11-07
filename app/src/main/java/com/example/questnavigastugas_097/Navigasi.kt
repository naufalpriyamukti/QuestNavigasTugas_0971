package com.example.questnavigastugas_097

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
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
        NavHost(
            navController = navController,
            startDestination = com.example.prak6.Navigasi.HomeDepan.name,
            modifier = Modifier.padding(innerPadding)
        )
    }

}