package com.example.exampleapp.data.usecases

import com.example.exampleapp.data.AppData

/**
 * Usecases are modular classes used to apply business logic
 * to data classes/repositories/apis.
 * For example, you could have a usecase that has an api service
 * and appdata as a dependency which calls the API endpoints
 * and apply the results to the corresponding appdata property states.
 */
class IsEvenUseCase(private val appData: AppData) {
    /**
     * Internal function to increase and determine if the
     * current value in AppData is even or odd.
     */
    private fun isEven(value: Int): Boolean = value % 2 == 0

    fun increaseCurrentValue() {
        appData.increaseCurrentCount()
    }

    fun getIsEvenText(value: Int): String {
        if (isEven(value)) return "Current value is even"
        return "Current value is odd"
    }
}