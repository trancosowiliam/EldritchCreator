package com.eldritchcreator.register.presentation.ancientone.add

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.eldritchcreator.core.presentation.BaseFragment
import com.eldritchcreator.register.R

class AddAncientOneFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_ancient_one, container, false)
    }
}
