package com.eldritchcreator.presentation.ancientone.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.R
import com.eldritchcreator.presentation.BaseFragment

class AncientOneDetailedFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_ancient_one_detailed, container, false)
}