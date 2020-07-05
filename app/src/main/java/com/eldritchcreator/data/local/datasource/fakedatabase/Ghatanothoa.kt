package com.eldritchcreator.data.local.datasource.fakedatabase

import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Energy
import com.eldritchcreator.domain.model.MysteryCard
import com.eldritchcreator.domain.model.ResearchCard
import com.eldritchcreator.domain.model.Skill
import com.eldritchcreator.domain.model.SpecialCard

object Ghatanothoa {
    private const val name = "Ghatanothoa"
    private const val nickName = "Primogênito de Cthulhu"
    private const val imagePath = "ghatanothoa"
    private const val flavor =
        "Ghatanothoa foi adorado pelos antigos Muviens, que o temeram e o respeitaram por causa de sua habilidade de transformar os humanos que o vissem em vida, em múmias pensativas. Ele foi trazido para a Terra vindo do plenata Yoggoth por uma antiga raça alienígena"

    private val setup = AncientOne.Setup(
        doomCount = 8,
        description = "Embaralhe as oito fichas de rosto e coloque sobre esta ficha",
        mythosStageI = AncientOne.MythosStage(
            greenCount = 1,
            yellowCount = 2,
            blueCount = 1
        ),
        mythosStageII = AncientOne.MythosStage(
            greenCount = 2,
            yellowCount = 3,
            blueCount = 1
        ),
        mythosStageIII = AncientOne.MythosStage(
            greenCount = 2,
            yellowCount = 3,
            blueCount = 0
        )
    )

    private val asleepStatus = AncientOne.AsleepStatus(
        abilities = listOf(
            "[reckoning]: O Investigador-Chefe deve virar uma ficha de rosto",
            "Quando um investigador revelar um rosto de Ghatanothoa ele perde 3 de sanidade. Quando quatro fichas de rosto tiverem sido reveladas, embaralhe todas as fichas de rosto novamente e coloque virada para baixo",
            "Quando 3 mistérios forem solucionados, <b>os Investigadores vencem o jogo</b>",
            "Quando Ghatanothoa desperar, <b>vire esta ficha</b> e resolva o efeito \"O Olhar Aniquilador\" no verso."
        ),
        flavorText = flavor,
        reckoning = true,
        cultist = AncientOne.Cultist(
            health = 1,
            firstAttack = AncientOne.Cultist.Attack(
                skillTest = Skill.Will,
                modify = 0,
                damage = 1,
                damageType = Energy.Sanity
            ),
            secondAttack = null,
            description = "Se voce passar no teste de [will], derrote esse monstro\n\nSe você for perder Sanidade no teste de [will], vire uma ficha de rosto ao invés disso."
        )
    )

    private val awakenedStatus = AncientOne.AwakenedStatus(
        abilities = listOf(
            "[reckoning]: Coloque uma ficha de rosto em um espaço aleatório, ate o limite de 8 tokens em jogo.",
            "As fichas de rosto representam o controle de Ghatanothoa em nosso mundo.",
            "Cada vez que a perdição fosse avançar, mova as fichas de rosto 1 espaço em direção ao investigador mais próximo.",
            "Se uma ficha encerrar o movimento no espaço que contenha um investigador, esse investigador é devorado"
        ),
        cultist = AncientOne.Cultist(
            health = 1,
            firstAttack = AncientOne.Cultist.Attack(
                skillTest = Skill.Will,
                modify = 0,
                damage = 2,
                damageType = Energy.Sanity
            ),
            secondAttack = null,
            description = "Se voce passar no teste de [will], derrote esse monstro\n\nSe você for perder Sanidade no teste de [will], você é devorado ao invés disso."
        ),
        wakeupEffectDescription = null,
        finalMysteryTitle = "O Olhar Aniquilador",
        finalMysteryFlavor = "Uma sombra poderosa surge através das fendas na realidade, e formas grotescas entram em nosso mundo.\nTodo ser que os olhos encontram com essa loucura se transforma instantaneamente em pedra.",
        finalMysteryDescription = "Coloque fichas de rosto igual ao [investigator] em jogo, em espaços aleatórios.\n\nQuando 3 mistérios forem solucionados <b>os investigadores vencem o jogo</b>",
        reckoning = true
    )

    private val mysteryCards = listOf<MysteryCard>()
    private val researchCards = listOf<ResearchCard>()
    private val specialCards = emptyList<SpecialCard>()

    val ancientOne = AncientOne(
        name = name,
        nickName = nickName,
        imagePath = imagePath,
        setup = setup,
        asleepStatus = asleepStatus,
        awakenedStatus = awakenedStatus,
        mysteryCards = mysteryCards,
        researchCards = researchCards,
        specialCards = specialCards
    )
}