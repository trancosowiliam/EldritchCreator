package com.eldritchcreator.navigation

import androidx.fragment.app.Fragment
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.navigation.util.navValue
import com.eldritchcreator.register.navigation.AncientOneDetailedNavigator
import com.eldritchcreator.register.presentation.ancientone.detail.AncientOneDetailedFragmentArgs

class AncientOneDetailedNavigatorImpl(
    fragment: Fragment
) : AncientOneDetailedNavigator {

    override val ancientOne: AncientOne =
        fragment.navValue<AncientOneDetailedFragmentArgs>().ancientOne
}