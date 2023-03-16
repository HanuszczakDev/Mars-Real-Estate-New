package com.hanuszczak.marsrealestatenew.overview

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hanuszczak.marsrealestatenew.R
import com.hanuszczak.marsrealestatenew.databinding.FragmentOverviewBinding

class OverviewFragment : Fragment() {
    private val viewModel: OverviewViewModel by lazy {
        ViewModelProvider(this)[OverviewViewModel::class.java]
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentOverviewBinding.inflate(inflater)

        binding.viewModel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

//        setHasOptionsMenu(true)

        val view = binding.root

        return view
    }

//    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
//        super.onCreateOptionsMenu(menu, inflater)
//    }
}