package example.com.githubconnect

import android.app.Application
import example.com.githubconnect.data.di.DataModule
import example.com.githubconnect.domain.di.DomainModule
import example.com.githubconnect.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()

    }
}