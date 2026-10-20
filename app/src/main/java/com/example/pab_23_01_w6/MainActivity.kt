package com.example.pab_23_01_w6

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.adaptive.navigationsuite.NavigationSuiteScaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pab_23_01_w6.ui.theme.PAB_2301_W6Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAB_2301_W6Theme {
                PAB_2301_W6App()
            }
        }
    }
}

@PreviewScreenSizes
@Composable
fun PAB_2301_W6App() {
    var currentDestination by rememberSaveable { mutableStateOf(AppDestinations.HOME) }

    NavigationSuiteScaffold(
        navigationSuiteItems = {
            AppDestinations.entries.forEach {
                item(
                    icon = {
                        Icon(
                            painterResource(it.icon),
                            contentDescription = it.label
                        )
                    },
                    label = { Text(it.label) },
                    selected = it == currentDestination,
                    onClick = { currentDestination = it }
                )
            }
        }
    ) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp)
            ) {
                when (currentDestination) {
                    AppDestinations.HOME -> {
                        Text(
                            text = "JADWAL KULIAH",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(text = "SELASA", fontWeight = FontWeight.Bold)
                                Text(text = "- 10.30 - 13.30 : Pengembangan Aplikasi Bergerak (Kampus B) (01.001 - ILR)")
                                Text(text = "- 15.30 - 17.30 : Kewirausahaan (Kampus C) (03.003 - DIS)")
                            }
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(text = "RABU", fontWeight = FontWeight.Bold)
                                Text(text = "- 15.30 - 17.30 : Metode Penelitian Ilmiah (Kampus B) (01.001 - AIK)")
                            }
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(text = "KAMIS", fontWeight = FontWeight.Bold)
                                Text(text = "- 07.30 - 10.30 : Pengembangan UI Lanjut (Kampus B) (01.001 - ZIZ)")
                            }
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(text = "JUMAT", fontWeight = FontWeight.Bold)
                                Text(text = "- 06.30 - 09.30 : Pelatihan dan Sertifikasi (Kampus B) (01.001 - SHC)")
                            }
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(text = "SABTU", fontWeight = FontWeight.Bold)
                                Text(text = "- 10.30 - 14.30 : Capstone Design and Project (Online) (03.003 - DET)")
                            }
                        }
                    }

                    AppDestinations.FAVORITES -> {
                        Text(
                            text = "DAFTAR TUGAS",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = "1. Pengembangan Aplikasi Bergerak",
                                    fontWeight = FontWeight.Bold
                                )
                                Text(text = "Modifikasi Template Navigation UI")
                            }
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = "2. Metode Penelitian Ilmiah",
                                    fontWeight = FontWeight.Bold
                                )
                                Text(text = "Cari Topik Jurnal")
                            }
                        }

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(
                                    text = "3. Pengembangan UI Lanjut",
                                    fontWeight = FontWeight.Bold
                                )
                                Text(text = "Latihan Layout")
                            }
                        }
                    }

                    AppDestinations.PROFILE -> {
                        Text(
                            text = "PROFIL MAHASISWA",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 12.dp)
                        )

                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 6.dp)
                        ) {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text(text = "Nama : Faiz Ardhanu", fontWeight = FontWeight.Medium)
                                Text(text = "NIM : 102042300072")
                                Text(text = "Semester : 7")
                            }
                        }
                    }
                }
            }
        }
    }
}

enum class AppDestinations(
    val label: String,
    val icon: Int,
) {
    HOME("Home", R.drawable.ic_home),
    FAVORITES("Favorites", R.drawable.ic_favorite),
    PROFILE("Profile", R.drawable.ic_account_box),
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAB_2301_W6Theme {
        Greeting("Android")
    }
}
