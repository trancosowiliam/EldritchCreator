package com.eldritchcreator.di

import com.eldritchcreator.presentation.ancientone.list.AncientOnesViewModel
import com.eldritchcreator.presentation.game.choose.ChooseAncientOneViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val presentationModule = module {

    viewModel {
        AncientOnesViewModel(
            ancientOneInteractor = get()
        )
    }

    viewModel {
        ChooseAncientOneViewModel(
            ancientOneInteractor = get()
        )
    }
}