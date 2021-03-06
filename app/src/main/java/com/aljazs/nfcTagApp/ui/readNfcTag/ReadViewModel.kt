package com.aljazs.nfcTagApp.ui.readNfcTag

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aljazs.nfcTagApp.model.NfcTag

class ReadViewModel : ViewModel() {

    private val _tag = MutableLiveData<NfcTag>().apply {
        value = NfcTag(message = "", tagID = "", tagSize = "", tagUsedMemory = "", isReadOnly = false)
    }

    val tag: LiveData<NfcTag> = _tag

    fun setTagMessage(message: NfcTag) {
        _tag.value = message

    }

    val _closeDialog = MutableLiveData<Boolean>().apply {
        value = false
    }
    val closeDialog: LiveData<Boolean> = _closeDialog
}