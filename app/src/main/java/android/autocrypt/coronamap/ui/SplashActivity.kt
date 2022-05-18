package android.autocrypt.coronamap.ui

import android.annotation.SuppressLint
import android.autocrypt.coronamap.R
import android.autocrypt.coronamap.databinding.ActivitySplashBinding
import android.autocrypt.coronamap.viewmodel.SplashViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    private val splashViewModel: SplashViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        binding.lifecycleOwner = this
        binding.viewModel = splashViewModel
    }
}