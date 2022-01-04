package com.example.exampleapp.ui.fragments.second

import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.exampleapp.data.AppData
import com.example.exampleapp.data.usecases.IsEvenUseCase
import com.example.exampleapp.ui.common.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(
    private val isEvenUseCase: IsEvenUseCase,
    appData: AppData
): BaseViewModel() {
    val currentString: LiveData<String>

    init {
        // Here we can leverage the Transformations util class
        // to give us a new string automatically whenever
        // appData.currentCount is updated.
        currentString = Transformations.map(appData.currentCount) { curVal ->
            isEvenUseCase.getIsEvenText(curVal)
        }
    }

    fun increaseCurrentValue() {
        isEvenUseCase.increaseCurrentValue()
    }
}