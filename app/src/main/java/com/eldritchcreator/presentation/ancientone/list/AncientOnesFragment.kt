package com.eldritchcreator.presentation.ancientone.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.eldritchcreator.R
import com.eldritchcreator.presentation.BaseFragment
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

        aosBtnAdd.setOnClickListener {
            findNavController().navigate(AncientOnesFragmentDirections.actionAncientOnesFragmentToAddAncientOneFragment())
        }

        aosBtnDetail.setOnClickListener {
            findNavController().navigate(AncientOnesFragmentDirections.actionAncientOnesFragmentToAncientOneDetailedFragment())
        }
    }

    override fun observeEvents() {
        super.observeEvents()

        viewModel.ancientOnesLiveData.observe(this) {
            Toast.makeText(requireContext(), it.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}