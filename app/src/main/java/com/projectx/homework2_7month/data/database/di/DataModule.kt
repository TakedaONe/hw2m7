package com.projectx.homework2_7month.data.database.di

import androidx.room.Room
import com.projectx.homework2_7month.data.database.AppDatabase
import com.projectx.homework2_7month.data.database.repositoryImpl.TaskManagerRepositoryImpl
import com.projectx.homework2_7month.domain.repository.TaskManagerRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val dataModules:Module = module {

    single {

        Room.databaseBuilder(get(),AppDatabase::class.java,"TaskDataBase")
            .fallbackToDestructiveMigration()
            .build()

    }

    single { get  <AppDatabase>().taskManagerDao() }

    single  <TaskManagerRepository>{TaskManagerRepositoryImpl(get())}

}