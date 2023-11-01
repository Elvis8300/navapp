package com.example.mvvmnavigation.ui.theme.screens.signup

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.ui.theme.MVVMNavigationTheme

@Composable
fun SignupScreen(navController: NavController){
    Text(text = "Sign up here!")
}
@Preview(showBackground = true)
@Composable
fun SignupScreenPreview(){
    MVVMNavigationTheme {
        SignupScreen(rememberNavController())
    }
}