package com.eldritchcreator.game.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.core.presentation.BaseFragment
import com.eldritchcreator.core.util.navigator
import com.eldritchcreator.game.R
import com.eldritchcreator.game.navigation.GameNavigator
import kotlinx.android.synthetic.main.fragment_game.*

class GameFragment : BaseFragment() {

    private val gameNavigator: GameNavigator by navigator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_game, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gameTxtAncientOneName.text = gameNavigator.ancientOne.name
    }

}