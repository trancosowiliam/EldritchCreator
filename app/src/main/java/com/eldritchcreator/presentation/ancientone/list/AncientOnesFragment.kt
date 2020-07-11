package com.eldritchcreator.presentation.ancientone.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.eldritchcreator.R
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.presentation.BaseFragment
import com.eldritchcreator.presentation.adapter.ancientone.AncientOneAdapter
import com.eldritchcreator.util.observe
import kotlinx.android.synthetic.main.fragment_ancient_ones.*
import org.koin.android.viewmodel.ext.android.viewModel

class AncientOnesFragment : BaseFragment() {

    private val viewModel: AncientOnesViewModel by viewModel()

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
            findNavController().navigate(AncientOnesFragmentDirections.actionAncientOnesFragmentToAddAncientOneFragment())
        }
    }

    private fun navigateToDetail(ancientOne: AncientOne) {
        findNavController().navigate(
            AncientOnesFragmentDirections.actionAncientOnesFragmentToAncientOneDetailedFragment(
                ancientOne
            )
        )
    }
}