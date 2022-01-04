package com.example.exampleapp.ui.fragments.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.exampleapp.databinding.MainFragmentBinding
import com.example.exampleapp.ui.common.BaseFragment
import com.example.exampleapp.ui.common.BaseViewModel
import com.example.exampleapp.ui.fragments.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

/**
 * Fragments and activities MUST have the @AndroidEntryPoint annotation.
 */
@AndroidEntryPoint
class MainFragment : BaseFragment() {

    /**
     * use viewModels() to scope it to this fragment
     * use activityViewModels() to scope it to its activity
     */
    private val viewModel by viewModels<MainViewModel>()

    override fun getViewModel(): BaseViewModel = viewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = MainFragmentBinding.inflate(inflater, container, false)

        binding.nextButton.setOnClickListener {
            viewModel.navigateToNextFragment()
        }

        binding.secondActivityButton.setOnClickListener {
            viewModel.navigateToSecondActivity()
        }

        binding.message.text = viewModel.appName

        return binding.root
    }

}