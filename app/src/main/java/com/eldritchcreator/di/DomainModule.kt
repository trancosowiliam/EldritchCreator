package com.eldritchcreator.di

import com.eldritchcreator.domain.interactor.AncientOneInteractor
import com.eldritchcreator.domain.interactor.AncientOneInteractorImpl
import org.koin.dsl.module

val domainModule = module {

    factory<AncientOneInteractor> {
        AncientOneInteractorImpl(
            ancientOneRepository = get()
        )
    }
}