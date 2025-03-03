package com.example.studentattendance.models

import kotlinx.serialization.Serializable

@Serializable
data class Student(
    val id:Int,
    val name:String,
    val lastName:String,
    val group:Group
)
