package com.example.eldritchcreator.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment

open class BaseFragment : Fragment() {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        observeEvents()
    }

    protected open fun observeEvents() {

    }
}