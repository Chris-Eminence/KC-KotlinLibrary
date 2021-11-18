package com.example.kotlib.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlib.R
import com.example.kotlib.databinding.FragmentSignUpBinding

class SignUpFragment : Fragment() {
    private lateinit var _binding: FragmentSignUpBinding

    private val binding get() = _binding
    private lateinit var navCon: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignUpBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.signInButton.setOnClickListener {
            navCon.navigate(R.id.action_signUpFragment_to_signInFragment)
        }
        binding.alreadHaveAnAccount.setOnClickListener {
            navCon.navigate(R.id.action_signUpFragment_to_signInFragment)
        }
        binding.googleSignIn.setOnClickListener {
            Toast.makeText(activity, "Google Authentication, Still in progress", Toast.LENGTH_SHORT).show()
        }
        binding.facebookSignIn.setOnClickListener {
            Toast.makeText(activity, "Facebook Authentication, Still in progress", Toast.LENGTH_SHORT).show()
        }
        binding.twitterSignIn.setOnClickListener {
            Toast.makeText(activity, "Twitter Authentication, Still in progress", Toast.LENGTH_SHORT).show()
        }
    }
}

