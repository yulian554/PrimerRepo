package com.example.projectgit.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import com.example.projectgit.R
import com.example.projectgit.databinding.FragmentColorsBinding
import com.example.projectgit.viewmodels.ColorsViewModel

class ColorsFragment : Fragment() {

    private lateinit var binding: FragmentColorsBinding
    private val viewModel: ColorsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_colors, container, false)
        binding.colorsViewModel = viewModel
        binding.lifecycleOwner = this
        binding.btBack.setOnClickListener{ view ->
            navToHome(view)
        }
        return binding.root
    }

    private fun navToHome(view: View) {
        Navigation.findNavController(view).navigate(R.id.action_colorsFragment_to_homeFragment)
    }
}