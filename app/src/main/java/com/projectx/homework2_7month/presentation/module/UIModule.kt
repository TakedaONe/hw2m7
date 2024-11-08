package com.projectx.homework2_7month.presentation.module

import com.projectx.homework2_7month.presentation.viewmodel.MainActivityViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val uiModule: Module = module {

    factory { MainActivityViewModel(get(),get()) }
}