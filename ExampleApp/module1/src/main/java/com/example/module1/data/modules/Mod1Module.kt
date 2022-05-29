package com.example.module1.data.modules

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
class Mod1Module {

    @Provides
    @Named("Module1Hello")
    fun provideHello(@Named("DynamicDep1") dynDep1: String): String {
        return if (dynDep1.isNotEmpty()) "Module 1 runtime dep: $dynDep1" else "Hello from Module 1!"
    }
}