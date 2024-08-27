package com.aydinkaya.jetpackcomposebootcampmvvm.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.aydinkaya.jetpackcomposebootcampmvvm.view_model.MainScreenViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(mainScreenViewModel: MainScreenViewModel) {

    val tfNumber1 = remember { mutableStateOf("") }
    val tfNumber2 = remember { mutableStateOf("") }
    val sonuc = mainScreenViewModel.sonuc.observeAsState("0")
    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "MVVM") }) }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Text(text = sonuc.value, fontSize = 50.sp)

            TextField(value = tfNumber1.value, onValueChange = { tfNumber1.value = it }, label = {
                Text(
                    text = "Number 1"
                )
            })

            TextField(value = tfNumber2.value, onValueChange = { tfNumber2.value = it }, label = {
                Text(
                    text = "Number 2"
                )
            })



            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {


                Button(onClick = {

                    mainScreenViewModel.add(tfNumber1.value, tfNumber2.value)


                }) {
                    Text(text = "Add")

                }

                Button(onClick = {
                    mainScreenViewModel.multiplication(tfNumber1.value, tfNumber2.value)


                }) {
                    Text(text = "Multiplication")
                }

            }
        }

    }

}