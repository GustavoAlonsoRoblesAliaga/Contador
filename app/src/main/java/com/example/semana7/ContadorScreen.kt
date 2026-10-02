package com.example.semana7

import androidx.compose.foundation.layout.Arrangement

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.height

import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults

import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.runtime.getValue

import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier

import androidx.compose.ui.graphics.Color

import androidx.compose.ui.unit.dp

import androidx.lifecycle.compose.collectAsStateWithLifecycle

import androidx.lifecycle.viewmodel.compose.viewModel



@Composable

fun ContadorScreen(

    ContadorViewModel: ContadorViewModel = viewModel()

) {

    val count by ContadorViewModel.count.collectAsStateWithLifecycle()



    Column(

        modifier = Modifier.fillMaxSize(),

        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Text(

            text = "El numero de Click es: $count",

            style = MaterialTheme.typography.headlineMedium

        )



        Spacer(modifier = Modifier.height(16.dp))



        Button(

            onClick = { ContadorViewModel.incrementCount() },

            colors = ButtonDefaults.buttonColors(

                containerColor = Color(0xFFDC143C),

                contentColor = Color.White

            ),

            shape = RoundedCornerShape(10.dp)

        ) {

            Text(text = "Click")

        }

    }

}