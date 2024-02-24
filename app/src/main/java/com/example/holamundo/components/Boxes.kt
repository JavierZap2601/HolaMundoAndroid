package com.example.holamundo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun TheBox(){
    Box(modifier = Modifier
        .height(120.dp)
        .width(120.dp)
        .verticalScroll(rememberScrollState())
        .background(
            Color(0xFF7956B6)
        )
    ){
        //Aqui el contenido
        theText(1, modifier = Modifier.align(Alignment.TopStart))
        theText(2, modifier = Modifier.align(Alignment.TopCenter))
        theText(3, modifier = Modifier.align(Alignment.TopEnd))
        theText(4, modifier = Modifier.align(Alignment.CenterStart))
        theText(5, modifier = Modifier.align(Alignment.Center))
        theText(6, modifier = Modifier.align(Alignment.CenterEnd))
        theText(7, modifier = Modifier.align(Alignment.BottomStart))
        theText(8, modifier = Modifier.align(Alignment.BottomCenter))
        theText(9, modifier = Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
fun theText(numberBox: Int,
            modifier: Modifier,
            color: Color = Color.White){
    Text(text = "Caja $numberBox", modifier = modifier, color = color)
}
//-----------------------------------------------------------------------------------
@Composable
fun MyNumberBox(numero: Int,
                modificador: Modifier,
                color: Color = Color.Yellow){
    Text(text = "Caja $numero",
        modifier = modificador,
        color = color)
}

@Preview(showBackground = true)
@Composable
fun TheBox2(){
    Box(modifier = Modifier
        //.fillMaxSize()
        .height(120.dp)
        .width(120.dp)
        .background(Color.Red)){
        MyNumberBox(1, Modifier.align((Alignment.TopStart)))
        MyNumberBox(2, Modifier.align((Alignment.TopCenter)), Color.White)
        MyNumberBox(3, Modifier.align((Alignment.TopEnd)), Color.Cyan)
        MyNumberBox(4, Modifier.align((Alignment.CenterStart)), Color.Black)
        MyNumberBox(5, Modifier.align((Alignment.Center)), Color.DarkGray)
        MyNumberBox(6, Modifier.align((Alignment.CenterEnd)), Color.Green)
        MyNumberBox(7, Modifier.align((Alignment.BottomStart)), Color.Magenta)
        MyNumberBox(8, Modifier.align((Alignment.BottomCenter)), Color.Blue)
        MyNumberBox(9, Modifier.align((Alignment.BottomEnd)), Color.LightGray)
    }
}

