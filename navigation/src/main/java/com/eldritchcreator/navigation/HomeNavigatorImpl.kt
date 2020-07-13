package com.eldritchcreator.navigation

import androidx.fragment.app.Fragment
import com.eldritchcreator.home.navigation.HomeNavigator
import com.eldritchcreator.home.presentation.HomeFragmentDirections.Companion.actionHomeFragmentToAncientOnesFragment
import com.eldritchcreator.home.presentation.HomeFragmentDirections.Companion.actionHomeFragmentToChooseAncientOneFragment
import com.eldritchcreator.navigation.util.navigate

class HomeNavigatorImpl(private val fragment: Fragment): HomeNavigator {
    override fun actionHomeToAncientOneList() {
        fragment.navigate(
            actionHomeFragmentToAncientOnesFragment()
        )
    }

    override fun actionHomeToPlay() {
        fragment.navigate(
            actionHomeFragmentToChooseAncientOneFragment()
        )
    }
}