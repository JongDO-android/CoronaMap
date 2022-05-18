package android.autocrypt.coronamap.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    private val _progress = MutableLiveData(0f)
    val progress: LiveData<Float> get() = _progress

    /*fun test() = viewModelScope.launch {
        var curProgress = _progress.value ?: 0f

        while(curProgress < CircleProgressBar.END_ARC_VALUE) {
            delay(100)
            curProgress += 1f
            _progress.value = curProgress
        }
    }*/
}