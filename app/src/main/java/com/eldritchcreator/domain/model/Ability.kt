package com.eldritchcreator.domain.model

data class Ability(
    val trigger: Trigger?,
    val description: String
)

enum class Trigger {
    Reckoning
}

fun reckoning(description: String) = Ability(Trigger.Reckoning, description)
fun ability(description: String) = Ability(null, description)