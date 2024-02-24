package com.example.holamundo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun theColumn(){
    Column(
        modifier = Modifier.height(200.dp). width(100.dp),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.End
    ){
        Text(
            text = "C1",
            modifier = Modifier
                .background(Color.Yellow)
                .weight(1f)
        )
        Text(
            text = "C2",
            modifier = Modifier
                .background(Color.Green)
                .weight(2f)
        )
        Text(
            text = "C3",
            modifier = Modifier
                .background(Color.Magenta)
                .weight(1f)
        )
    }
}