package com.example.exampleapp.ui.fragments.second

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.exampleapp.databinding.SecondFragmentBinding
import com.example.exampleapp.ui.common.BaseFragment
import com.example.exampleapp.ui.common.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SecondFragment: BaseFragment() {

    private val viewModel by viewModels<SecondViewModel>()

    override fun getViewModel(): BaseViewModel = viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = SecondFragmentBinding.inflate(inflater, container, false)

        viewModel.currentString.observe(viewLifecycleOwner) {
            binding.message.text = it
        }

        binding.incrementButton.setOnClickListener {
            viewModel.increaseCurrentValue()
        }

        binding.previousButton.setOnClickListener {
            viewModel.navigateBack()
        }

        return binding.root
    }
}