package com.example.module2.data.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class Mod2Module {
    @Provides
    @Named("Module2Hello")
    fun provideHello(@Named("DynamicDep2") dynDep2: String): String {
        return if (dynDep2.isNotEmpty()) "Module 2 runtime dep: $dynDep2" else "Hello from Module 2!"
    }
}