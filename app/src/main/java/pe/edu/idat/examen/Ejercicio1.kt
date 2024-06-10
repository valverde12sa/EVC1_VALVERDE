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
fun MainScreen() {
    var age by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
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
        // Ejercicio 1
        TextField(
            value = age,
            onValueChange = { age = it },
            label = { Text("Edad") },
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = gender,
            onValueChange = { gender = it },
            label = { Text("Sexo (M/F)") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = {
            val canRetire = if (gender.equals("M", ignoreCase = true)) {
                age.toIntOrNull() ?: 0 >= 60
            } else {
                age.toIntOrNull() ?: 0 >= 54
            }
            result = if (canRetire) "Puede jubilarse" else "No puede jubilarse"
        }) {
            Text("Calcular jubilación")
        }
        Text(result)
    }
}