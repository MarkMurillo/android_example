package com.example.exampleapp.utils

import android.os.Bundle
import androidx.navigation.NavDirections

sealed class NavigationCommand {
    var args: Bundle? = null

    data class To(val direction: Int) : NavigationCommand()
    object Back : NavigationCommand()
    object ToRoot : NavigationCommand()
}