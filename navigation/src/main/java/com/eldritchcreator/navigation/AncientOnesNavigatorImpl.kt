package com.eldritchcreator.navigation

import androidx.fragment.app.Fragment
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.navigation.util.navigate
import com.eldritchcreator.register.navigation.AncientOnesNavigator
import com.eldritchcreator.register.presentation.ancientone.list.AncientOnesFragmentDirections.Companion.actionAncientOnesFragmentToAddAncientOneFragment
import com.eldritchcreator.register.presentation.ancientone.list.AncientOnesFragmentDirections.Companion.actionAncientOnesFragmentToAncientOneDetailedFragment

class AncientOnesNavigatorImpl(private val fragment: Fragment) : AncientOnesNavigator {
    override fun actionAncientOneListToAddAncientOne() {
        fragment.navigate(
            actionAncientOnesFragmentToAddAncientOneFragment()
        )
    }

    override fun actionAncientOneListToAncientOneDetailed(ancientOne: AncientOne) {
        fragment.navigate(
            actionAncientOnesFragmentToAncientOneDetailedFragment(ancientOne)
        )
    }
}