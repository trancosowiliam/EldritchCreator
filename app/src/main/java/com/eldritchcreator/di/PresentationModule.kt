package com.eldritchcreator.di

import com.eldritchcreator.game.presentation.choose.ChooseAncientOneViewModel
import com.eldritchcreator.register.presentation.ancientone.list.AncientOnesViewModel
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