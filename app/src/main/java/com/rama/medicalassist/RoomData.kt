package com.rama.medicalassist

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rama.medicalassist.data.Dao
import com.rama.medicalassist.data.Entities


@Database(entities = [Entities::class],version = 1, exportSchema = false)
abstract class RoomData: RoomDatabase() {
    abstract fun Dao():Dao
}