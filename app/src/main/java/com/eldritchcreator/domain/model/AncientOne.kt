package com.eldritchcreator.domain.model

data class AncientOne(
    val name: String,
    val nickName: String,
    val imagePath: String,
    val setup: Setup,
    val asleepStatus: AsleepStatus,
    val awakenedStatus: AwakenedStatus,
    val mysteryCards: List<MysteryCard>,
    val researchCards: List<ResearchCard>,
    val specialCards: List<SpecialCard>?
) {
    data class Setup(
        val doomCount: Int,
        val description: String,
        val mythosStageI: MythosStage,
        val mythosStageII: MythosStage,
        val mythosStageIII: MythosStage
    )

    data class AsleepStatus(
        val abilities: List<String>,
        val flavorText: String,
        val reckoning: Boolean,
        val cultist: Cultist
    )

    data class AwakenedStatus(
        val abilities: List<String>,
        val cultist: Cultist,
        val wakeupEffectTitle: String,
        val wakeupEffectDescription: String,
        val finalMysteryTitle: String,
        val finalMysteryFlavor: String,
        val finalMysteryDescription: String,
        val reckoning: Boolean
    )

    data class MythosStage(
        val greenCount: Int,
        val yellowCount: Int,
        val blueCount: Int
    )

    data class Cultist(
        val health: Int,
        val firstAttack: Attack?,
        val secondAttack: Attack?,
        val description: String
    ) {
        data class Attack(
            val skillTest: Skill,
            val modify: Int,
            val damage: Energy
        )
    }
}

