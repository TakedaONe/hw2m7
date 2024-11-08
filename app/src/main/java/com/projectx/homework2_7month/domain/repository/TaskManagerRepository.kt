package com.projectx.homework2_7month.domain.repository

import com.projectx.homework2_7month.data.database.dto.TaskDto

interface TaskManagerRepository {

    suspend fun insertTask(taskDto: TaskDto)
    suspend fun getAllNotes(): List<TaskDto>
    suspend fun getTaskByName(taskName: String): TaskDto?
}
