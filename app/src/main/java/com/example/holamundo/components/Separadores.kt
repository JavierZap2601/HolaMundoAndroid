package com.example.holamundo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun TheSpacer(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment =  Alignment.CenterHorizontally
        ){
        Text(text = "Inicio")
        Spacer(modifier = Modifier.height(36.dp))
        Text(text = "Fin")

        Row(modifier = Modifier.fillMaxWidth()){
            Divider(color = Color.Green,
                modifier = Modifier.height(4.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.height(IntrinsicSize.Max),
            horizontalArrangement = Arrangement.Center
        )
        {
            Text(text = "Izquierda",
                modifier = Modifier
                    .background(Color.Green)
                    .border(2.dp, Color.Red)
                    .padding(32.dp)
                    .background(Color.Blue)
                    .border(2.dp, Color.Red)
                )
        Divider(
            modifier = Modifier
                .fillMaxHeight()
                .width(5.dp),
        )
            Text(text = "Derecha")
        }
    }
}