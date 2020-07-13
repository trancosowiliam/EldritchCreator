package com.eldritchcreator.navigation

import androidx.fragment.app.Fragment
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.game.navigation.GameNavigator
import com.eldritchcreator.game.presentation.GameFragmentArgs
import com.eldritchcreator.navigation.util.navValue

class GameNavigatorImpl(
    fragment: Fragment
) : GameNavigator {

    override val ancientOne: AncientOne =
        fragment.navValue<GameFragmentArgs>().ancientOne
}