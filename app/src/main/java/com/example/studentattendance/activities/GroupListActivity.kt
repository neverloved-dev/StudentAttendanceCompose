package com.example.studentattendance.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.studentattendance.models.Group
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import com.example.studentattendance.models.User

class GroupListActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GroupListScreen()
            }
        }
    }

@ExperimentalMaterial3Api
@Composable
fun GroupListScreen(){
    val context = LocalContext.current
    var groupList = listOf(
        Group(1,"МИТ-221", mutableListOf( User(
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
            ))) ,
        Group(2,"ИТ-42", mutableListOf( User(
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
            ))),
        Group(3,"ПИ-21", mutableListOf( User(
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
            ))),
        Group(4,"ИТ-11", mutableListOf( User(
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
            ))),
        Group(5,"СТС-001", mutableListOf( User(
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
            )))
    )
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Занятия на сегодня") })
        },
        content = { padding ->
            LazyColumn(modifier = Modifier
                .padding(padding)
                .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp))
            {
                items(groupList.size) { index ->
                    val group = groupList[index]
                    groupCard(group,onClick = {
                        val intent = Intent(context, GroupDetailsActivity::class.java).apply {
                            putExtra("groupName", group.name)
                            putExtra("groupStudents",ArrayList(group.students))
                        }
                        context.startActivity(intent)
                    })
                }
            }
        }
    )
}

@ExperimentalMaterial3Api
@Composable
fun groupCard(group: Group,onClick: (Group) -> Unit){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = group.name,
                style = MaterialTheme.typography.titleMedium
            )

            Spacer(modifier = Modifier.weight(1f)) // Pushes the icon to the end

            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Go to group",
                tint = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun showGroupCard(){
    val group =  Group(1,"МИТ-221", mutableListOf( User(
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
        )))
    groupCard(group, onClick = TODO())
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun showGroupListScreen(){
    GroupListScreen()
}
