package com.eldritchcreator.home.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.core.presentation.BaseFragment
import com.eldritchcreator.core.util.navigator
import com.eldritchcreator.home.R
import com.eldritchcreator.home.navigation.HomeNavigator
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {

    private val homeNavigator: HomeNavigator by navigator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeBtnPlay.setOnClickListener {
            homeNavigator.actionHomeToPlay()
        }

        homeBtnAncientOnes.setOnClickListener {
            homeNavigator.actionHomeToAncientOneList()
        }
    }

}