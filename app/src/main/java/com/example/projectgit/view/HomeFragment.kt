package com.example.projectgit.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.projectgit.R
import com.example.projectgit.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.btGo.setOnClickListener{ view -> navToColors(view) }
        return binding.root
    }

    private fun navToColors(view: View) {
        Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_colorsFragment)
    }


}