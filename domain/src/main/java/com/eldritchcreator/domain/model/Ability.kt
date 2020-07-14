package com.eldritchcreator.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Ability(
    val trigger: Trigger?,
    val description: String
) : Parcelable

enum class Trigger {
    Reckoning
}

fun reckoning(description: String) = Ability(Trigger.Reckoning, description)
fun ability(description: String) = Ability(null, description)