package com.example.questnavigastugas_097.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas_097.R

@Composable
fun TampilData(
    nama: String,
    jenis: String,
    status: String,
    alamat: String,
    onBerandaClick: () -> Unit,
    onFormulirClick: () -> Unit
)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEDE7F6))
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF9C27B0))
                .padding(vertical = 30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id= R.string.list),
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        // Nama Lengkap
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text(stringResource(id= R.string.nama), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text(nama, fontStyle = FontStyle.Italic, fontSize = 16.sp, fontFamily = FontFamily.Cursive)
            }
        }

        // Jenis Kelamin
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text(stringResource(id= R.string.jenis_kel), fontWeight = FontWeight.Bold, fontSize = 14.sp,)
                Text(jenis, fontStyle = FontStyle.Italic, fontSize = 16.sp,  fontFamily = FontFamily.Cursive)
            }
        }

        // Status Perkawinan
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text(stringResource(id= R.string.status), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text(status, fontStyle = FontStyle.Italic, fontSize = 16.sp, fontFamily = FontFamily.Cursive)
            }
        }

        // Alamat
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text(stringResource(id= R.string.alamat), fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text(alamat, fontStyle = FontStyle.Italic, fontSize = 16.sp,  fontFamily = FontFamily.Cursive)
            }
        }


    }
}