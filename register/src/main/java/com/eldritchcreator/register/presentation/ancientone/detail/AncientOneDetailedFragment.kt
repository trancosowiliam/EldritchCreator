package com.eldritchcreator.register.presentation.ancientone.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.core.presentation.BaseFragment
import com.eldritchcreator.core.util.navigator
import com.eldritchcreator.register.R
import com.eldritchcreator.register.navigation.AncientOneDetailedNavigator
import kotlinx.android.synthetic.main.fragment_ancient_one_detailed.*

class AncientOneDetailedFragment : BaseFragment() {

    private val ancientOneDetailedNavigator: AncientOneDetailedNavigator by navigator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_ancient_one_detailed, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        aodLblAncientOne.text =
            "ancient one detailed\n${ancientOneDetailedNavigator.ancientOne.name}"
    }
}