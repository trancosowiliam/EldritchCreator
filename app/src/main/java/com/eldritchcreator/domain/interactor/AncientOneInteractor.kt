package com.eldritchcreator.domain.interactor

import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Response

interface AncientOneInteractor {
    suspend fun getAncientOnes(): Response<List<AncientOne>>
}