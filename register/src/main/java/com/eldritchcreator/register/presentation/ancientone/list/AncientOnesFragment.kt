package com.eldritchcreator.register.presentation.ancientone.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.core.presentation.BaseFragment
import com.eldritchcreator.core.presentation.adapter.ancientone.AncientOneAdapter
import com.eldritchcreator.core.util.navigator
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.register.R
import com.eldritchcreator.register.navigation.AncientOnesNavigator
import com.eldritchcreator.core.util.observe
import kotlinx.android.synthetic.main.fragment_ancient_ones.*
import org.koin.android.viewmodel.ext.android.viewModel

class AncientOnesFragment : BaseFragment() {

    private val viewModel: AncientOnesViewModel by viewModel()
    private val ancientOnesNavigator: AncientOnesNavigator by navigator()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_ancient_ones, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupListeners()
    }

    override fun observeEvents() {
        super.observeEvents()

        viewModel.ancientOnesLiveData.observe(this) { ancientOnes ->
            AncientOneAdapter.setup(aosRecAncientOnes, ancientOnes) {
                navigateToDetail(it)
            }
        }
    }

    private fun setupListeners() {
        aosBtnAdd.setOnClickListener {
            ancientOnesNavigator.actionAncientOneListToAddAncientOne()
        }
    }

    private fun navigateToDetail(ancientOne: AncientOne) {
        ancientOnesNavigator.actionAncientOneListToAncientOneDetailed(ancientOne)
    }
}