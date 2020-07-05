package com.eldritchcreator.di

import com.eldritchcreator.data.local.datasource.AncientOneDataSource
import com.eldritchcreator.data.local.datasource.AncientOneDatabaseDataSource
import com.eldritchcreator.data.repository.AncientOneRepository
import com.eldritchcreator.data.repository.AncientOneRepositoryImpl
import org.koin.dsl.module

val dataModule = module {

    factory<AncientOneDataSource> {
        AncientOneDatabaseDataSource()
    }


    factory<AncientOneRepository> {
        AncientOneRepositoryImpl(
            ancientOneDataSource = get()
        )
    }


}