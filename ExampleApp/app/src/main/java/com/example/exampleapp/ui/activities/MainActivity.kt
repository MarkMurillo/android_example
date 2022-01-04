package com.example.exampleapp.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.exampleapp.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * Fragments and activities MUST have the @AndroidEntryPoint annotation.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
}