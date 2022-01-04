package com.example.exampleapp.ui.fragments.third

import com.example.exampleapp.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class ThirdViewModel @Inject constructor(
    @Named("SecondActivity") val message: String
): BaseViewModel()