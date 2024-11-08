package com.projectx.homework2_7month.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.projectx.homework2_7month.data.database.dto.TaskDto
import com.projectx.homework2_7month.data.database.repositoryImpl.TaskManagerRepositoryImpl
import com.projectx.homework2_7month.domain.usecase.InsertTaskUseCase
import com.projectx.homework2_7month.presentation.uimodel.TaskUI
import com.projectx.homework2_7month.presentation.uimodel.fromDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel(
    private val insertTaskUseCase: InsertTaskUseCase,
    val taskManagerRepositoryImpl: TaskManagerRepositoryImpl
) : ViewModel() {

    private val _tasks = MutableLiveData<List<TaskDto>>()
    val tasks: LiveData<List<TaskDto>> get() = _tasks

    private val _insertMessage = MutableLiveData<String>()
    val insertMessage: LiveData<String> get() = _insertMessage

    fun insertTask(taskUI: TaskUI) {
        viewModelScope.launch(Dispatchers.IO) {
            val message = insertTaskUseCase.insertTask(taskUI.fromDomain())
            _insertMessage.postValue(message)
        }
    }

    fun loadTasks() {
        viewModelScope.launch(Dispatchers.IO) {
            val allTasks = taskManagerRepositoryImpl.getAllNotes()
            _tasks.postValue(allTasks)
        }
    }
}

