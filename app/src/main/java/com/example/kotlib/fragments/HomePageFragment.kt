package com.example.kotlib.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlib.R
import com.example.kotlib.databinding.FragmentHomePageBinding
import com.example.kotlib.databinding.FragmentSignInBinding


class HomePageFragment : Fragment() {

    private lateinit var _binding: FragmentHomePageBinding

    private val binding get() = _binding
    private lateinit var navCon: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.whatISKotlin.setOnClickListener {
            navCon.navigate(R.id.action_homePageFragment_to_whatIsKotlin)
        }
        binding.KotlinBasicSyntax.setOnClickListener {
            navCon.navigate(R.id.action_homePageFragment_to_basicSyntax)

        }
        binding.kotlinComments.setOnClickListener {
            navCon.navigate(R.id.action_homePageFragment_to_commments)

        }
        binding.kotlinDataTypes.setOnClickListener {
            navCon.navigate(R.id.action_homePageFragment_to_dataType)
        }
        binding.kotlinStrings.setOnClickListener {
            Toast.makeText(activity, "Strings in Kotlin still under construction", Toast.LENGTH_SHORT).show()

        }
        binding.kotlinVariables.setOnClickListener {
            navCon.navigate(R.id.action_homePageFragment_to_variables)
        }
        binding.KotlinOperators.setOnClickListener {
            Toast.makeText(activity, "Operators in Kotlin still under operation", Toast.LENGTH_SHORT).show()
        }

    }
}



