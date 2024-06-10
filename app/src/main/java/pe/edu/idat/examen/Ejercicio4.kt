package pe.edu.idat.examen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Calcular() {

    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Ejercicio 4
        Button(onClick = {
            val numbers = (15..70).map { number ->
                val square = number * number
                val half = (number.toDouble() / 2.0)
                "Número: $number, Cuadrado: $square, Mitad: $half"
            }
            result = numbers.joinToString("\n")
        }) {
            Text("Calcular cuadrados y mitades")
        }
        Text(result)
    }
}