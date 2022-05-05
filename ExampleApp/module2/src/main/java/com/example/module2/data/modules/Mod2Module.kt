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
    fun provideHello(): String = "Hello from Module 2!"
}