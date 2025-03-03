package com.example.studentattendance.models

import kotlinx.serialization.Serializable

@Serializable
data class User(
    val id:Long,
    val username:String,
    val name:String,
    val lastName:String,
    val specialty:String,
    val subject:String,
    val photoUrl:String
)
