package com.example.projectgit.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projectgit.databinding.FragmentColorsBinding
import com.example.projectgit.databinding.FragmentHomeBinding

class ColorsFragment : Fragment() {

    private var _binding: FragmentColorsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentColorsBinding.inflate(inflater, container, false)
        return binding.root
    }
}