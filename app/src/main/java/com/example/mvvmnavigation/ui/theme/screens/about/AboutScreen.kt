package com.example.mvvmnavigation.ui.theme.screens.about

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun AboutScreen(navController: NavController){
    Text(text = "Welcome to about page")
}
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
    MVVMNavigationTheme {
        AboutScreen(rememberNavController())
    }
}