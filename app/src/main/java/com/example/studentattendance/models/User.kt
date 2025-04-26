package com.example.studentattendance.models

import android.os.Parcel
import android.os.Parcelable
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
) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readLong(),
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: "",
        parcel.readString() ?: ""
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeLong(id)
        parcel.writeString(username)
        parcel.writeString(name)
        parcel.writeString(lastName)
        parcel.writeString(specialty)
        parcel.writeString(subject)
        parcel.writeString(photoUrl)
    }

    override fun describeContents(): Int = 0

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User = User(parcel)
        override fun newArray(size: Int): Array<User?> = arrayOfNulls(size)
    }
}

