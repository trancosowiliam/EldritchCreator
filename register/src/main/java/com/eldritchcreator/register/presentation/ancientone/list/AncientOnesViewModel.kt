package com.eldritchcreator.register.presentation.ancientone.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eldritchcreator.domain.interactor.AncientOneInteractor
import com.eldritchcreator.domain.model.AncientOne
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AncientOnesViewModel(
    private val ancientOneInteractor: AncientOneInteractor,
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main
) : ViewModel() {

    private val _ancientOnesLiveData = MutableLiveData<List<AncientOne>>()

    val ancientOnesLiveData: LiveData<List<AncientOne>> = _ancientOnesLiveData

    init {
        fetchAncientOnes()
    }

    private fun fetchAncientOnes() = viewModelScope.launch(dispatcher) {
        ancientOneInteractor.getAncientOnes()
            .onSuccess {
                _ancientOnesLiveData.value = it
            }
    }
}