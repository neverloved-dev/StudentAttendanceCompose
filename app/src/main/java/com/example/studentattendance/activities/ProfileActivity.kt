package com.example.studentattendance.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.studentattendance.ui.theme.StudentAttendanceTheme


class ProfileActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileScreen()
        }
    }
}


@Composable
fun ProfileScreen() {
    var name by remember { mutableStateOf("") }
    var specialization by remember { mutableStateOf("") }
    var photoUrl by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Редактируйте свой профиль", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Ваше ФИО") },
            modifier = Modifier.fillMaxWidth(),
            isError = errorMessage.isNotEmpty()
        )
        OutlinedTextField(
            value = specialization,
            onValueChange = { specialization = it },
            label = { Text("Ваша специализация") },
            modifier = Modifier.fillMaxWidth(),
            isError = errorMessage.isNotEmpty()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // Login Button
        Button(
            onClick = {
            },
            modifier = Modifier.padding(5.dp), colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF3583A8)
            )
        ) {
            Text("Сохранить")
        }
    }
    }


@Preview(showBackground = true)
@Composable
fun ProfileActivityPreview(){
    StudentAttendanceTheme {
        ProfileScreen()
    }
}
