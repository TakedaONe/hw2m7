package com.projectx.homework2_7month.data.database

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.projectx.homework2_7month.data.database.dao.TaskManagerDao
import com.projectx.homework2_7month.data.database.dto.TaskDto

@Database(entities = [TaskDto::class], version = 1, exportSchema = false)
abstract class AppDatabase:RoomDatabase() {

    abstract fun taskManagerDao():TaskManagerDao

}