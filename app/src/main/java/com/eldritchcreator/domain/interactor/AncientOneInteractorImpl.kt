package com.eldritchcreator.domain.interactor

import com.eldritchcreator.data.repository.AncientOneRepository
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Response

class AncientOneInteractorImpl(
    private val ancientOneRepository: AncientOneRepository
) : AncientOneInteractor {
    override suspend fun getAncientOnes(): Response<List<AncientOne>> {
        return ancientOneRepository.getAncientOnes()
    }
}