package com.eldritchcreator.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class ResearchCard(
    val city: String,
    val wilderness: String,
    val sea: String,
    val number: Int
) : Card(), Parcelable