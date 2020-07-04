package com.example.eldritchcreator.presentation.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eldritchcreator.R
import com.example.eldritchcreator.presentation.BaseFragment

class GameFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_game, container, false)

}