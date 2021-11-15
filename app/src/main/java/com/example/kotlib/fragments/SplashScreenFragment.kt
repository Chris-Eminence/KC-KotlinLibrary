package com.example.kotlib.fragments

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlib.R
import com.example.kotlib.databinding.ActivityMainBinding.inflate
import com.example.kotlib.databinding.FragmentSplashScreenBinding
import com.example.kotlib.databinding.FragmentSplashScreenBinding.inflate

class SplashScreenFragment : Fragment(){
    private lateinit var _binding : FragmentSplashScreenBinding
    private val binding get() = _binding
    private lateinit var navCon : NavController

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashScreenBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Handler().postDelayed({
            navCon.navigate(R.id.action_splashScreenFragment_to_signUpFragment2)
        }, 3000)
    }
}


