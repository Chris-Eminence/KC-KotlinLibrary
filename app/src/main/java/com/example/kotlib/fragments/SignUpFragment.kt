package com.example.kotlib.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlib.R

class SignUpFragment : Fragment() {
    private lateinit var _binding : FragmentSignUpBinding
    private val binding get() = _binding
    private lateinit var navCon : NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _biding = FragmentSignUpBinding.inflate(inflater, container, false)
        navCon =  NavHostFtagment.findNavController(this)
        return binding.root
    }


    }
}