package com.meekoo.hilttutorial.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * Created by Ajay Verma on 24/03/22.
 */
@HiltViewModel
class MyViewModel @Inject constructor(val intValue: Int) : ViewModel() {
    val TAG = "MyViewModel"

    init {
        Log.d(TAG, "debug: ViewModelValue: $intValue")
    }
}
