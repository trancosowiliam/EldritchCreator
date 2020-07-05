package com.eldritchcreator.domain.model

data class ResearchCard(
    val city: String,
    val wilderness: String,
    val sea: String,
    val number: Int
) : Card()