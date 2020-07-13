package com.eldritchcreator.navigation

import androidx.fragment.app.Fragment
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.game.navigation.ChooseAncientOneNavigator
import com.eldritchcreator.game.presentation.choose.ChooseAncientOneFragmentDirections.Companion.actionChooseAncientOneFragmentToGameFragment
import com.eldritchcreator.navigation.util.navigate

class ChooseAncientOneNavigatorImpl(private val fragment: Fragment) : ChooseAncientOneNavigator {
    override fun actionChooseAncientOneToGame(ancientOne: AncientOne) {
        fragment.navigate(
            actionChooseAncientOneFragmentToGameFragment(ancientOne)
        )
    }
}