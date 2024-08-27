package com.aydinkaya.jetpackcomposebootcampmvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.material3.Surface
import com.aydinkaya.jetpackcomposebootcampmvvm.ui.theme.JetpackComposeBootcampMVVMTheme
import com.aydinkaya.jetpackcomposebootcampmvvm.view.MainScreen
import com.aydinkaya.jetpackcomposebootcampmvvm.view_model.MainScreenViewModel

class MainActivity : ComponentActivity() {
    private val mainScreenViewModel : MainScreenViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeBootcampMVVMTheme {
               Surface() {
                   MainScreen(mainScreenViewModel)
               }
            }
        }
    }
}

