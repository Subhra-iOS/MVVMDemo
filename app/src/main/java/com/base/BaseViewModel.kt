package com.base

import androidx.lifecycle.ViewModel
import com.injection.component.ViewModelInjector
import dagger.Module
import com.injection.module.NetworkModule
import com.ui.post.PostListViewModel
import com.injection.component.DaggerViewModelInjector

@Module

/**
 * By default in Kotlin all classes are final. To make a class derivable we need to add open or abstract
 * before class keyword.
 * open : functions are overridden
 * abstract : No need to override, direct call the function
 *
 * DaggerViewModelInjector : Need to  build the app (Android Studio, Menu Build => Rebuild Project). This class is generated
 * */
abstract class BaseViewModel : ViewModel() {

    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
            is PostListViewModel -> injector.inject(this)
        }
    }
}