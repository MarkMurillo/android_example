package com.example.exampleapp.ui.common

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDirections
import com.example.exampleapp.utils.NavigationCommand
import com.example.exampleapp.utils.SingleLiveEvent

/**
 * This base viewmodel will handle basic navigation options
 */
open class BaseViewModel: ViewModel() {
    // Mutable live data should always be private
    private val _navigationCommand = SingleLiveEvent<NavigationCommand>()
    // Any observers need to go through the LiveData interface and not the
    // MutableLiveData for best practice, to not expose mutability to unnecessary
    // classes.
    val navigationCommand: LiveData<NavigationCommand> = _navigationCommand


    // Navigation business logic should be driven from the view models,
    // and handled in the corresponding UI view.
    fun navigateBack() = _navigationCommand.postValue(NavigationCommand.Back)

    fun navigate(direction: Int, args: Bundle? = null) {
        val cmd = NavigationCommand.To(direction)
        cmd.args = args
        _navigationCommand.postValue(cmd)
    }

    fun navigateRoot() {
        _navigationCommand.postValue(NavigationCommand.ToRoot)
    }
}