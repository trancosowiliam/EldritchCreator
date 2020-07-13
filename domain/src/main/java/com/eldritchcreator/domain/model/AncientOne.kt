package com.eldritchcreator.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
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
) : Parcelable {

    @Parcelize
    data class Setup(
        val doomCount: Int,
        val description: String,
        val mythosStageI: MythosStage,
        val mythosStageII: MythosStage,
        val mythosStageIII: MythosStage
    ) : Parcelable

    @Parcelize
    data class AsleepStatus(
        val abilities: List<Ability>,
        val flavorText: String,
        val reckoning: Boolean,
        val cultist: Cultist
    ) : Parcelable

    @Parcelize
    data class AwakenedStatus(
        val abilitiesTitle: String,
        val abilities: List<Ability>,
        val cultist: Cultist,
        val wakeupEffect: WakeupEffect?,
        val finalMystery: FinalMystery,
        val reckoning: Boolean
    ) : Parcelable {

        @Parcelize
        data class WakeupEffect(
            val title: String,
            val description: String
        ) : Parcelable

        @Parcelize
        data class FinalMystery(
            val title: String,
            val flavor: String,
            val description: String
        ) : Parcelable
    }

    @Parcelize
    data class MythosStage(
        val greenCount: Int,
        val yellowCount: Int,
        val blueCount: Int
    ) : Parcelable

    @Parcelize
    data class Cultist(
        val health: Int,
        val firstAttack: Attack?,
        val secondAttack: Attack?,
        val abilities: List<Ability>?
    ) : Parcelable {

        @Parcelize
        data class Attack(
            val skillTest: Skill,
            val modify: Int,
            val damage: Int,
            val damageType: Energy
        ) : Parcelable
    }
}

