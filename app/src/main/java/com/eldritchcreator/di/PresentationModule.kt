package com.eldritchcreator.di

import com.eldritchcreator.presentation.ancientone.list.AncientOnesViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {

    viewModel {
        AncientOnesViewModel(
            ancientOneInteractor = get()
        )
    }
}