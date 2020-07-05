package com.eldritchcreator.domain.model

data class MysteryCard(
    val title: String,
    val description: String,
    val flavor: String,
    val imagePath: String
) : Card()