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
        val abilities: List<Ability>,
        val flavorText: String,
        val reckoning: Boolean,
        val cultist: Cultist
    )

    data class AwakenedStatus(
        val abilitiesTitle: String,
        val abilities: List<Ability>,
        val cultist: Cultist,
        val wakeupEffect: WakeupEffect?,
        val finalMystery: FinalMystery,
        val reckoning: Boolean
    ) {
        data class WakeupEffect(
            val title: String,
            val description: String
        )

        data class FinalMystery(
            val title: String,
            val flavor: String,
            val description: String
        )
    }

    data class MythosStage(
        val greenCount: Int,
        val yellowCount: Int,
        val blueCount: Int
    )

    data class Cultist(
        val health: Int,
        val firstAttack: Attack?,
        val secondAttack: Attack?,
        val abilities: List<Ability>?
    ) {
        data class Attack(
            val skillTest: Skill,
            val modify: Int,
            val damage: Int,
            val damageType: Energy
        )
    }
}

