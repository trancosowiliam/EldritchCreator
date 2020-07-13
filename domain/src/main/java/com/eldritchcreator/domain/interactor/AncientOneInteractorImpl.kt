package com.eldritchcreator.domain.interactor

import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Response
import com.eldritchcreator.domain.repository.AncientOneRepository

class AncientOneInteractorImpl(
    private val ancientOneRepository: AncientOneRepository
) : AncientOneInteractor {
    override suspend fun getAncientOnes(): Response<List<AncientOne>> {
        return ancientOneRepository.getAncientOnes()
    }
}