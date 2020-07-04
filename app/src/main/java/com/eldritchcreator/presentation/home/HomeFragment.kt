package com.eldritchcreator.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eldritchcreator.R
import com.eldritchcreator.presentation.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeBtnPlay.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToGameFragment())
        }

        homeBtnAncientOnes.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAncientOnesFragment())
        }
    }

}