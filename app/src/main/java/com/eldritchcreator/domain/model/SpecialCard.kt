package com.eldritchcreator.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SpecialCard(
    val title: String,
    val description: String,
    val successful: String,
    val failure: String,
    val number: Int
) : Card(), Parcelable