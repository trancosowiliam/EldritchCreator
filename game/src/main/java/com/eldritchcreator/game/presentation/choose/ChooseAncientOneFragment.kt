package com.eldritchcreator.game.presentation.choose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.core.presentation.BaseFragment
import com.eldritchcreator.core.presentation.adapter.ancientone.AncientOneAdapter
import com.eldritchcreator.core.util.navigator
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.game.R
import com.eldritchcreator.game.navigation.ChooseAncientOneNavigator
import com.eldritchcreator.core.util.observe
import kotlinx.android.synthetic.main.fragment_choose_ancient_one.*
import org.koin.android.viewmodel.ext.android.viewModel

class ChooseAncientOneFragment : BaseFragment() {

    private val viewModel: ChooseAncientOneViewModel by viewModel()
    private val chooseAncientOneNavigator: ChooseAncientOneNavigator by navigator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_choose_ancient_one, container, false)


    override fun observeEvents() {
        super.observeEvents()

        viewModel.ancientOnesLiveData.observe(this) { ancientOnes ->
            AncientOneAdapter.setup(caoRecAncientOnes, ancientOnes) {
                navigateToDetail(it)
            }
        }
    }

    private fun navigateToDetail(ancientOne: AncientOne) {
        chooseAncientOneNavigator.actionChooseAncientOneToGame(ancientOne)
    }

}