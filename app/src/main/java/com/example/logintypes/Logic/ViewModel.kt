package com.example.logintypes.Logic

import androidx.lifecycle.*
import androidx.lifecycle.ViewModel


class ViewModel() : ViewModel(), LifecycleObserver {
    val email: MutableLiveData<String> = MutableLiveData("")
    val senha: MutableLiveData<String> = MutableLiveData("")

    private val isEmailValid: LiveData<Boolean> = email.map { it.isNotEmpty() }
    private val isPasswordValid: LiveData<Boolean> = senha.map { it.isNotEmpty() }
    val isLoginButtonEnabled: List<LiveData<Boolean>> = listOf(isEmailValid, isPasswordValid)



}

