package com.eldritchcreator.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MysteryCard(
    val title: String,
    val description: String,
    val flavor: String,
    val imagePath: String
) : Card(), Parcelable