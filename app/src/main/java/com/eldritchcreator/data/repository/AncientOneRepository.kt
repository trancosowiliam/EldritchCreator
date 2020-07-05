package com.eldritchcreator.data.repository

import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Response

interface AncientOneRepository {
    suspend fun getAncientOnes(): Response<List<AncientOne>>
}