package com.www.nhl1995gmail.retrofit.screens.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.www.nhl1995gmail.retrofit.R
import kotlinx.coroutines.*


class SplashFragment : Fragment() {

    private val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_splash,container,false)

        activityScope.launch {
            delay(2500)
            Navigation.findNavController(view).navigate(R.id.action_splashFragment_to_rootFragment)
        }
        return view
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }

}