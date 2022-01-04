package com.example.exampleapp.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * General AppData class which holds application specific state data.
 */
class AppData {
    private val _currentCount = MutableLiveData<Int>()
    val currentCount: LiveData<Int> = _currentCount

    fun increaseCurrentCount() {
        var curVal = _currentCount.value ?: 0
        curVal += 1
        _currentCount.postValue(curVal)
    }
}