package com.example.exampleapp.ui.fragments.main

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.exampleapp.R
import com.example.exampleapp.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

/**
 * View models must have the @HiltViewModel annotation
 * so we can inject dependencies.
 * Dependencies are injected through the constructor only
 * and require the @Inject annotation on the constructor.
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    @Named("HelloFromModules")
    val appName: String
) : BaseViewModel() {

    fun navigateToNextFragment() {
        navigate(R.id.action_second_fragment)
    }

    fun navigateToSecondActivity() {
        navigate(R.id.action_navigate_second_activity)
    }
}