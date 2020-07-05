package com.eldritchcreator.domain.model

data class SpecialCard(
    val title: String,
    val description: String,
    val successful: String,
    val failure: String,
    val number: Int
) : Card()