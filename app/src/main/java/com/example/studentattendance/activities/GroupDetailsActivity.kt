package com.example.studentattendance.activities

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.studentattendance.activities.ui.theme.StudentAttendanceTheme
import com.example.studentattendance.models.Student
import com.example.studentattendance.models.User

class GroupDetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val groupName = intent.getStringExtra("groupName") as String?:"Group"
        val groupStudentList = intent.getSerializableExtra("groupStudents") as? ArrayList<User>?: arrayListOf()
        setContent {
            StudentAttendanceTheme {
                    groupDetailsScreen(groupName,groupStudentList)
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun groupDetailsScreen(groupName:String, studentGroupList: ArrayList<User>){
    var selectedOption by remember { mutableStateOf("Absent") }
    val context = LocalContext.current as Activity
    Scaffold(
        bottomBar = {
            Button(
                onClick = {
                    Toast.makeText(context, "Data sent successfully", Toast.LENGTH_SHORT).show()
                    context.finish() // Go back to previous activity
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text("Submit")
            }
        },
        topBar = {
            TopAppBar(title = { Text(groupName) })
        },
        content = { padding ->
            LazyColumn(
                modifier = Modifier
                    .padding(padding)
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(studentGroupList.size) { index ->
                    val student = studentGroupList[index]
                    Card(
                        modifier = Modifier.fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(4.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text("👤 ${student.name} ${student.lastName}", style = MaterialTheme.typography.titleMedium,
                                textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
                        }
                            // Horizontal Row of Radio Buttons
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceEvenly,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                AttendanceRadioButton("Absent", selectedOption) { selectedOption = it }
                                AttendanceRadioButton("Present", selectedOption) { selectedOption = it }
                                AttendanceRadioButton("Let Go", selectedOption) { selectedOption = it }
                            }
                        }
                    }
            }
        }
    )

}

@Composable
fun AttendanceRadioButton(
    label: String,
    selectedOption: String,
    onSelect: (String) -> Unit
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        RadioButton(
            selected = selectedOption == label,
            onClick = { onSelect(label) }
        )
        Text(text = label)
    }
}

@Preview(showBackground = true)
@Composable
fun showGroupDetailsScreen(){
    val groupName = "МИТ - 332"
    val studentList =  arrayListOf ( User(
        id = 1L,
        username = "jdoe",
        name = "John",
        lastName = "Doe",
        specialty = "Software Engineering",
        subject = "Mobile Development",
        photoUrl = "https://example.com/photos/jdoe.jpg"
    ),
        User(
            id = 2L,
            username = "asmith",
            name = "Alice",
            lastName = "Smith",
            specialty = "Data Science",
            subject = "Machine Learning",
            photoUrl = "https://example.com/photos/asmith.jpg"
        ),
        User(
            id = 3L,
            username = "bwilson",
            name = "Bob",
            lastName = "Wilson",
            specialty = "Cybersecurity",
            subject = "Network Security",
            photoUrl = "https://example.com/photos/bwilson.jpg"
        ),
        User(
            id = 4L,
            username = "kpatel",
            name = "Kavita",
            lastName = "Patel",
            specialty = "Cloud Computing",
            subject = "AWS Infrastructure",
            photoUrl = "https://example.com/photos/kpatel.jpg"
        ),
        User(
            id = 5L,
            username = "mrodriguez",
            name = "Miguel",
            lastName = "Rodriguez",
            specialty = "Artificial Intelligence",
            subject = "Natural Language Processing",
            photoUrl = "https://example.com/photos/mrodriguez.jpg"
        )
    )
    groupDetailsScreen(groupName, studentList)
}
