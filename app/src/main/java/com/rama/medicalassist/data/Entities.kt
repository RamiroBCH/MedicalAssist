package com.rama.medicalassist.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity()
data class Entities(
    @PrimaryKey
    val prymarykey: Int,
    val id: String
)
