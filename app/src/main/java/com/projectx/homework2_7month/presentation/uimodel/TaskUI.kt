package com.projectx.homework2_7month.presentation.uimodel

import com.projectx.homework2_7month.domain.model.TaskModel
import com.projectx.homework2_7month.presentation.viewmodel.MainActivityViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

data class TaskUI(
    val id: Int,
    val taskName: String,
    val taskDate: String,
)

fun TaskUI.fromDomain() = TaskModel(id, taskName, taskDate)