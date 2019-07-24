/**
 * Component providing inject() methods for presenters.
 */

package com.injection.component

import com.injection.module.NetworkModule
import com.ui.post.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component (modules = [NetworkModule::class])

interface ViewModelInjector{

    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    fun inject(postListViewModel : PostListViewModel)

    @Component.Builder
    interface Builder{

        fun build(): ViewModelInjector
        fun networkModule(networkModule: NetworkModule): Builder

    }

}