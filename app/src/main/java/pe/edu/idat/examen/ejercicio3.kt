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
fun Materias() {

    var subjects by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Ejercicio 3
        TextField(
            value = subjects,
            onValueChange = { subjects = it },
            label = { Text("Número de materias") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = {
            val numSubjects = subjects.toIntOrNull() ?: 0
            val totalCost = if (numSubjects > 5) 520 * 0.9 else 520
            result = "El costo total es S/ $totalCost"
        }) {
            Text("Calcular matrícula")
        }
        Text(result)
    }
}