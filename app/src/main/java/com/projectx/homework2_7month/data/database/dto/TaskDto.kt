package com.projectx.homework2_7month.data.database.dto

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.projectx.homework2_7month.domain.model.TaskModel

@Entity
data class TaskDto(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val taskName:String? = null,
    val taskDate:String? = null
)

fun TaskModel.toData() = TaskDto(id,taskName,taskDate)