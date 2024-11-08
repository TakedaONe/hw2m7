package com.projectx.homework2_7month.data.database.repositoryImpl

import com.projectx.homework2_7month.data.database.dao.TaskManagerDao
import com.projectx.homework2_7month.data.database.dto.TaskDto
import com.projectx.homework2_7month.domain.repository.TaskManagerRepository

class TaskManagerRepositoryImpl(private val taskManagerDao: TaskManagerDao) : TaskManagerRepository {

    override suspend fun insertTask(taskDto: TaskDto) {
        taskManagerDao.insertTask(taskDto)
    }

    override suspend fun getAllNotes(): List<TaskDto> {
        return taskManagerDao.getAllNotes()
    }

    override suspend fun getTaskByName(taskName: String): TaskDto? {
        return taskManagerDao.getTaskByName(taskName)
    }
}
