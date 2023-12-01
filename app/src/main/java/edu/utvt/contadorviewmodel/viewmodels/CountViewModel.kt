package edu.utvt.contadorviewmodel.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    private val countState = mutableStateOf(0)
    val count: State<Int> = countState

    fun increment() {
        countState.value = countState.value + 1
    }

    fun decrement() {
        countState.value = countState.value - 1
    }
}
