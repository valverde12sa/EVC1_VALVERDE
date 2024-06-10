package pe.edu.idat.examen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Numeros() {

    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var num3 by remember { mutableStateOf("") }
    var num4 by remember { mutableStateOf("") }
    var subjects by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Ejercicio 2
        TextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("Número 1") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("Número 2") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = num3,
            onValueChange = { num3 = it },
            label = { Text("Número 3") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = num4,
            onValueChange = { num4 = it },
            label = { Text("Número 4") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = {
            val numbers = listOf(num1, num2, num3, num4)
                .mapNotNull { it.toIntOrNull() }
            result = numbers.minOrNull().toString()
        }) {
            Text("Calcular menor")
        }
        Text(result)
    }
}