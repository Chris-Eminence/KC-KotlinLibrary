package com.example.kotlib.tutorial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlib.R
import com.example.kotlib.databinding.FragmentWhatIsKotlinBinding


class WhatIsKotlin : Fragment() {
    private lateinit var _binding: FragmentWhatIsKotlinBinding

    private val binding get() = _binding
    private lateinit var navCon: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWhatIsKotlinBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.backButton.setOnClickListener {
            navCon.navigate(R.id.action_whatIsKotlin_to_homePageFragment)
        }
    }}