package com.example.eldritchcreator.presentation.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.eldritchcreator.R
import com.example.eldritchcreator.presentation.BaseFragment
import com.example.eldritchcreator.util.*
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hello.transformationMethod = null
        hello.text = spannable(
            normal("Você viu alguma coisa("),
            image(hello, R.drawable.stats_observation),
            normal("-1) em caso de sucesso, tente o convencer("),
            image(hello, R.drawable.stats_influence),
            normal(") de alguma coisa, caso contrario ("),
            image(hello, R.drawable.stats_will),
            normal("+1) para não perder "),
            image(hello, R.drawable.stats_strength),
            normal(" ou "),
            image(hello, R.drawable.stats_lore)
        )
    }
}