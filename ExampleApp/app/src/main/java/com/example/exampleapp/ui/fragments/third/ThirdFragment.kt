package com.example.exampleapp.ui.fragments.third

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.exampleapp.databinding.ThirdFragmentBinding
import com.example.exampleapp.ui.common.BaseFragment
import com.example.exampleapp.ui.common.BaseViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ThirdFragment: BaseFragment() {
    private val viewModel by viewModels<ThirdViewModel>()

    override fun getViewModel(): BaseViewModel = viewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = ThirdFragmentBinding.inflate(inflater, container, false)

        binding.message.text = viewModel.message

        binding.previousButton.setOnClickListener {
            // Can't navigate back to the previous activity
            // since we are now using a different navigation graph.
            // You will have to navigate manually to the first activity
            viewModel.navigateBack()
        }

        return binding.root
    }
}