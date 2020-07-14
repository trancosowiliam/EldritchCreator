package com.eldritchcreator

import android.app.Application
import com.eldritchcreator.di.dataModule
import com.eldritchcreator.di.domainModule
import com.eldritchcreator.di.navigatorModule
import com.eldritchcreator.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

@Suppress("unused")
class EldritchApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@EldritchApplication)
            modules(
                listOf(
                    dataModule,
                    presentationModule,
                    domainModule,
                    navigatorModule
                )
            )
        }
    }
}