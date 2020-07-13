package com.eldritchcreator.game.navigation

import com.eldritchcreator.domain.model.AncientOne

interface ChooseAncientOneNavigator {
    fun actionChooseAncientOneToGame(ancientOne: AncientOne)
}