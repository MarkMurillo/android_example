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
    fun provideHello(): String = "Hello from Module 1!"
}