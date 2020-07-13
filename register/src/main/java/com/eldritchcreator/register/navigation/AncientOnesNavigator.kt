package com.eldritchcreator.register.navigation

import com.eldritchcreator.domain.model.AncientOne

interface AncientOnesNavigator {
    fun actionAncientOneListToAddAncientOne()
    fun actionAncientOneListToAncientOneDetailed(ancientOne: AncientOne)
}