package com.eldritchcreator.data.local.datasource.fakedatabase

import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Energy
import com.eldritchcreator.domain.model.MysteryCard
import com.eldritchcreator.domain.model.ResearchCard
import com.eldritchcreator.domain.model.Skill
import com.eldritchcreator.domain.model.ability
import com.eldritchcreator.domain.model.reckoning

object ShubNiggurath {
    private const val name = "Shub-Niggurath"
    private const val nickName = "A Cabra negra do bosque"
    private const val imagePath = "shub-niggurath"
    private const val flavor =
        "Em rituais pagãos, Shub-Niggurath absorve cultistas valorosos com seu corpo amorfo e os transforma em gof'nn hupadgh Shub-Niggurath, as proles da cabra. Sua prole primordial, os filhotes sombrios, emergem dos cantos mais distantes do globo para subjugar a humanidade"

    private val setup = AncientOne.Setup(
        doomCount = 15,
        description = "Ponha de lado 2 monstros Ghoul, 2 Monstros Prole da Cabra e 1 Monstro Filhote Sombrio",
        mythosStageI = AncientOne.MythosStage(
            greenCount = 1,
            yellowCount = 2,
            blueCount = 1
        ),
        mythosStageII = AncientOne.MythosStage(
            greenCount = 3,
            yellowCount = 2,
            blueCount = 1
        ),
        mythosStageIII = AncientOne.MythosStage(
            greenCount = 2,
            yellowCount = 4,
            blueCount = 0
        )
    )

    private val asleepStatus = AncientOne.AsleepStatus(
        abilities = listOf(
            reckoning("Faça aparecer 1 Monstro num espaço aleatório. Em seguida, se houver 10 ou mais Monstros no tabuleiro, avance a Perdição em 2"),
            ability("Quando 3 mistérios forem solucionados, <b>os Investigadores vencem o jogo</b>"),
            ability("Quando Shub-Niggurath despertar, <b>vire esta ficha</b> e resolva o efeito \"Shub-Niggurath Despertou\" no verso.")
        ),
        flavorText = flavor,
        reckoning = true,
        cultist = AncientOne.Cultist(
            health = 1,
            firstAttack = null,
            secondAttack = AncientOne.Cultist.Attack(
                skillTest = Skill.Strength,
                modify = -1,
                damage = 1,
                damageType = Energy.Health
            ),
            abilities = listOf(reckoning("[reckoning]: Faça aparecer 1 Monstro Prole da Cabra ou 1 Monstro Filhote Sombrio neste espaço. Em seguida, se você fez aparecer um Monstro, descarte este Cultista."))
        )
    )

    private val awakenedStatus = AncientOne.AwakenedStatus(
        abilitiesTitle = "Cabra Negra do Bosque com Prole de Mil Filhotes",
        abilities = listOf(
            ability("A Cada vez que a Perdição fosse avançar, faça aparecer 1 Monstro no espaço onde está o Monstro Épico Shub-Niggurath. Em seguida, se houver 6 ou mais Monstros nesse espaço(incluindo o Monstro Épico Shub-Niggurath), <b>os investigadores perdem o jogo</b>"),
            reckoning("[reckoning]: Cada investigador no espaço onde está o Monstro Épico Shub-Niggurath o encontra imediatamente")
        ),
        cultist = AncientOne.Cultist(
            health = 2,
            firstAttack = null,
            secondAttack = AncientOne.Cultist.Attack(
                skillTest = Skill.Strength,
                modify = -2,
                damage = 1,
                damageType = Energy.Health
            ),
            abilities = listOf(ability("Se voce passar no teste de [will], derrote esse monstro\n\nSe você for perder Sanidade no teste de [will], você é devorado ao invés disso."))
        ),
        wakeupEffect = AncientOne.AwakenedStatus.WakeupEffect(
            title = "",
            description = "Faça aparecer o Monstro Épico Shub-Niggurath no Coração da África. Em seguida, mova todos os Monstros Ghoul, Prole da Cabra e Filhote Sombrio no tabuleiro para o Coração da África."
        ),
        finalMystery = AncientOne.AwakenedStatus.FinalMystery(
            title = "Shub-Niggurath Despertou!",
            flavor = "A mãe bestial de todas as monstruosidades se manifestou! Ela é uma nuvem enorme na qual dezenas de tentáculos se estendem e retraem. Aonde quer que vá, ela deixa grandes rastros de patas. Contemplar sua verdadeira forma aterrorizante é como ficar diante do horror puro e primorial",
            description = "Quando o Monstro Épico Shub-Niggurath for derrotado, o Mistério Final é solucionado e os investigadores vencem o jogo."
        ),
        reckoning = true
    )

    private val mysteryCards = listOf<MysteryCard>(
        MysteryCard(
            title = "Prole da Cabra Negra",
            description = "Quando esta carta entra em jogo, faça aparecer o Monstro Épico Nug na amazônia.\nAo final da fase do Mito, se o Monstro Épico Nug tiver sido derrotado, este Mistério é solucionado.",
            flavor = "Os gêmeos blasfemos de Shub-Niggurath preparam o mundo para a Cabra Negra, destruindo qualquer possível oposição ao reinado de sua mãe. Um deles, Nug, já iniciou sua terrível tarefa.",
            imagePath = ""
        ),
        MysteryCard(
            title = "Caçando o Mil",
            description = "Quando um Monstro Não Épico for derrotado, o investigador ativo pode gastar 2 Pistas para colocar o Monstro nesta carta.\nAo final da Fase do MIto, se a resistência somada dos Monstros sobre esta carta for igual ou maior do que o dobro do [investigator], este Mistério é solucionado.",
            flavor = "A prole de Shub-Niggurath, os Mil Filhotes, infestam o planeta em números cada vez maiores, ameaçando sobrepujar a humanidade",
            imagePath = ""
        ),
        MysteryCard(
            title = "Rituais na Selva",
            description = "Quando esta carta entra em jogo, coloque 1 marcador Tétrico em cada um dos seguintes espaços Selvagens: 4, 10, 21 e Tunguska.\nComo um encontro, um investigador num espaço com um marcador Tétrico pode tentar determinar as intenções do ritual ([observation]). Se passar, ele pode descartar 2 Pistas para colocar aquele marcador Tétrico nesta carta.\nAo final da Fase do Mito, se o número de marcadores Tétricos nesta carta for igual a metade do [investigator], este Mistério é solucionado e todos os marcadores Tétricos devem ser descartados do tabuleiro",
            flavor = "Fogueiras ardem nos contos mais selvagens do planeta enquanto o Culda da Cabra Negra realiza seus ritos bestiais. Os cultistas chamam para que Shub-Niggurath libere seus filhos sobre a Terra",
            imagePath = ""
        ),
        MysteryCard(
            title = "Natureza da Onimadre",
            description = "QUando esta carta entra em jogo, mova cada uma das Pistas no tabuleiro para o espaço Selvagem mais próximo.\nApós um investigador resolver um Encontro de Pesquisa, ele pode gastar 1 Pista recebida no encontro e colocá-la nesta carta.\nAo final da Fase do Mito, se o número de Pistas nesta carta for igual ao [investigator], este Mistério é solucionado",
            flavor = "Shub-Niggurath corrompe naturalmente toda a vida que encontra. Onde houber seus adoradores, os seres vivos se tornam mais cruéis e maliciosos.",
            imagePath = ""
        )
    )
    private val researchCards = listOf<ResearchCard>(
        ResearchCard(
            city = "Você busca indícios sobre o que a Ordem da Cabeça da Morte fazia antes de sair da cidade [observation], Se passar você descobre anotações sobre uma criatura; receba esta Pista e descarte 1 Monstro de sua escolha. Se falhar, avance a Perdição em 1",
            wilderness = "A lua está cheia, e uma criatura parecida com um sátiro se ergue de uma massa ondulante de lodo. Um Monstro Prole da Cabra lhe armou uma emboscada! se derrotá-lo, receba esta Pista e 1 Pista extra. Se não derrotá-lo, você acorda sem saber como conseguiu sobreviver; receba uma condição de Amnésia",
            sea = "Você procura por uma criatura que está atacando a tripulação([observation-1]). Se passar, você encontra a fera dormindo em meio à carga e a domina sem esforços; receba esta Pista e 1 Pista extra. Se falhar, você é encontrado primeiro; um Monstro lhe armou uma emboscada!",
            number = 1
        ),
        ResearchCard(
            city = "Você capturou um dos cavaleiros da Irmandade. Esses assassinos dificilmente são pegos vivos, e esta pode ser a sua única chance de interrogatório ([observation]). Se passar, você o interroga antes que ele engula uma cápsula de veneno; receba esta Pista. Se falhar, ele luta e consegue escapar; perca 2 de vida",
            wilderness = "Os cultistas se embrenham na mata, e fica mais dificil segui-los ([observation-1]), Se passar, você se perde na floresta; faça aparecer um Monstro Filhote Sombrio(ou um Monstro aleatório, se o Filhote Sombrio já estiver no tabuleiro) em seu espaço e o encontre",
            sea = "Você negocia para que a tripulação lute ao seu lado([influence]-1). Se passar, eles prontamente oferecem ajuda; receba esta Pista e descarte 1 Monstro de sua escolha.",
            number = 2
        ),
        ResearchCard(
            city = "O museu foi arrombado à meia-noite e vários guardas foram mortos. Com base na descrição dos itens roubados, você tenta identificar as peças([observation]). Se passar, você descobre que os itens são as lendárias Fornalha de Yeb e Tocha de Nug; receba esta Pista",
            wilderness = "As pessoas em vestes ritualísticas usam máscaras caprinas de madeira. Os cânticos corrompem o pensamento. Você pode receber uma condição de Pacto Obscuro para receber esta Pista e aprimorar [strength]. Se não, receba a Condição, você se encontra sozinho e incerto quanto à existência dos cultistas; receba uma Condição de Paranoia",
            sea = "Alguém na tripulação adora secretamente a Cabra Negra e ateou fogo ao barco. Você corre para apagar o incêndio ([strength]-1). Se passar você interroga o cultista; receba esta Pista e 1 Pista extra. Se falhar, você precisa abandonar o barco; mova-se para o espaço Selvagem mais próximo e fique atrasado",
            number = 3
        ),
        ResearchCard(
            city = "Em seus pesadelo, os cânticos do Culto da Cabra Negra ameaçam sua sanidade ([will]). Se passar, você se lembra das palavras ao acordar; receba esta Pista. Se falhar, você acorda em um descampado; mova-se para o espaço Selvagem mais próximo e receba uma Condição de Amnésia.",
            wilderness = "Esta área foi preparada para um sacrificio. Você fica atento ao retorno do Culto ([observation]-1). Se passar, você vê a imolação de uma cabra a Shub-Niggurath; receba esta Pista e 1 Pista extra. Se falhar, você é surpreendido no escuro; descarte 1 Recurso do tipo Aliado e perca 2 de Sanidade.",
            sea = "Você para com o intuito de examinar um navio encalhado ([observation]-1). Se passar, o diário de bordo descreve uma criatura em meio à carga; receba esta Pista e 1 Pista extra. Se falhar você não encontra nada de útil, mova esta Pista para o espaço Selvagem mais próximo.",
            number = 4
        ),
        ResearchCard(
            city = "Você vasculha um templo subterrâneop dedicado a uma deusa da fertilidade([observation]-1). Se passar, você descobre um túnel secreto conectando o templo a um cemitério; receba esta Pista e 1 Pista extra. Se falhar, fungos e esporos penetram em seus pulmões; receba uma Condição de Lesão Interna",
            wilderness = "O ser encapuzado lhe entrega um cálice, mas você desconfia do conteúdo ([observation]-1). Se passar, você derrama a substância fedorenta no chão e observa seus efeitos; receba esta Pista e 1 Pista extra. Se falhar, você bebe o leite de Shub-Niggurath; um Monstro Filhote Sobrio lhe armou uma emboscada!",
            sea = "Sob a lua cheia, o marinheiro se transforma numa fera. Você o tranca na cabine e segura a porta ([strength]-1). Se passar, ele volta ao normal de manhã e conta sua história; receba esta Pista. Se falhar, ele escapa e mergulha no mar; mova esta Pista para o espaço Selvagem mais próximo.",
            number = 5
        ),
        ResearchCard(
            city = "Sangue começa a pingar de seus nariz, orelhas e boca. Uma bruxa o enfeitiçou, e é preciso resistir à magia ([will])! Se passar, você consegue redirecionar o feitiço para longe; receba esta Pista e 1 Monstro de sua escolha perde 2 de Vida. Se falhar, receba uma Condição de Amaldiçoado",
            wilderness = "Você foi escolhido pelo Culto da Cabra Negra como alvo da caçada ritualística. Você tenta apagar seu rastro e escapar das armadilhas ([observation]). Se passar, você foge com informações sobre o Culto; receba esta Pista. Se falhar, você é capturado e preso numa jaula até o proximo ritual; receba uma Condição de Aprisionado",
            sea = "Um dos marinheiros diz que você foi marcado e precisa ser purificado pelo fogo. Ele usa um ferrete em sua pele. Perca 2 de Vida. A dor quebra as influências obscuras; receba esta Pista, e você ṕde descartar uma Condição de Amaldiçoado ou de Pacto Obscuro. ",
            number = 6
        ),
        ResearchCard(
            city = "Você identifica um importante membro do governo local como adorador da Cabra Negra e tenta pressioná-lo a revelar os segredos do culto ([influence]). Se passar, ele responde às suas perguntas; receba esta Pista e 1 Pista extra. Se falhar, você é acusado de um crime; receba uma Condição de Aprisionado.",
            wilderness = "Um grupo de cultistas foi eviscerado por alguma criatura invocada que saiu do controle. Você acha que sabe como enviar a abominação de volta para o lugar de onde veio ([lore]-1). Se passar, você bane a fera; receba esta Pista e recue a Perdição em 1. Se falhar, você é arremessado contra as pedras pela fera; receba uma Condição de Lesão nas Costas.",
            sea = "A tripulação sumiu, e todo o equipamento de navegação foi destruído. Você decide fazer uma busca numa ilha próxima ([observation]). Se passar, logo na chegada, você vê evidências de atividade cultista; receba esta Pista. Se falhar, você aguarda restate; fique Atrasado.",
            number = 7
        ),
        ResearchCard(
            city = "Enquanto jaz à beira da morte, o padre coberto de sangue implora que você proteja a espada. Ele conta que o Irmão Tristão e sua Ordem não desistirão nunca. Se você fizer um voto solene, ele lhe entregará a espada antiga; Você pode receber uma Condição de Pacto Obscuro para receber esta Pista e o Artefato Espada de São Jerônimo.",
            wilderness = "Os moradores do povoado estão celebrando uma antigo feriado pagão. Algumas das canções e tradições parecem ter um significado oculto ([lore]-1). Se passar, você reconhece a influência da Cabra Negra e se afasta do festival; receba esta Pista. Se falhar, um Monstro Prole da Cabra lhe armou uma emboscada.",
            sea = "Você não consegue afastar a sensação de que algo está em seu encalço. Você fica acordado a noite toda à procura da ameaça ([observation]). Se passar, você descobre rastros estranhos no convés do navio; receba esta Pista. Se falhar, um Monstro lhe armou uma emboscada!",
            number = 8
        )
    )
    private val specialCards = null

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