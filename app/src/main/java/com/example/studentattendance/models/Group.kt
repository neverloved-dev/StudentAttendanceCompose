package com.example.studentattendance.models

import kotlinx.serialization.Serializable

@Serializable
data class Group(
    val id:Int,
    val name:String,
    val students:List<Student>
)
