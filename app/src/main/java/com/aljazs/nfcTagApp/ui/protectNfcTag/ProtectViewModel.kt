package com.aljazs.nfcTagApp.ui.protectNfcTag

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*

class ProtectViewModel : ViewModel() {



    val _protectSuccess = MutableLiveData<Boolean>().apply {

    }
    val protectSuccess: LiveData<Boolean> = _protectSuccess


}