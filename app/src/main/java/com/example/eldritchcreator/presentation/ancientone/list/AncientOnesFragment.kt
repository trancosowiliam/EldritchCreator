package com.example.eldritchcreator.presentation.ancientone.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.eldritchcreator.R
import com.example.eldritchcreator.presentation.BaseFragment
import kotlinx.android.synthetic.main.fragment_ancient_ones.*

class AncientOnesFragment : BaseFragment() {
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
}