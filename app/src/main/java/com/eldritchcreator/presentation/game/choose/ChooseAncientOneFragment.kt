package com.eldritchcreator.presentation.game.choose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.R
import com.eldritchcreator.presentation.BaseFragment
import com.eldritchcreator.presentation.adapter.ancientone.AncientOneAdapter
import com.eldritchcreator.util.observe
import kotlinx.android.synthetic.main.fragment_choose_ancient_one.*
import org.koin.android.viewmodel.ext.android.viewModel

class ChooseAncientOneFragment : BaseFragment() {

    private val viewModel: ChooseAncientOneViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_choose_ancient_one, container, false)


    override fun observeEvents() {
        super.observeEvents()

        viewModel.ancientOnesLiveData.observe(this) { ancientOnes ->
            AncientOneAdapter.setup(caoRecAncientOnes, ancientOnes)
        }
    }

}