package com.projectx.homework2_7month.domain.di

import com.projectx.homework2_7month.domain.usecase.InsertTaskUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

val domainModule: Module = module {

    factory { InsertTaskUseCase(get()) }
}