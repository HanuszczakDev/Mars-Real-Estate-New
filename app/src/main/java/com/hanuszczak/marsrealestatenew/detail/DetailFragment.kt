package com.hanuszczak.marsrealestatenew.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.hanuszczak.marsrealestatenew.R
import com.hanuszczak.marsrealestatenew.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailBinding.inflate(inflater, container, false)

        binding.lifecycleOwner = viewLifecycleOwner

        val application = requireNotNull(activity).application

        val marsProperty = DetailFragmentArgs.fromBundle(requireArguments()).selectedProperty

        val viewModelFactory = DetailViewModelFactory(marsProperty, application)

        binding.viewModel = ViewModelProvider(this, viewModelFactory)[DetailViewModel::class.java]

        return binding.root
    }
}