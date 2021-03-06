package com.eldritchcreator.data.datasource

import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Response

interface AncientOneDataSource {
    suspend fun getAncientOnes(): Response<List<AncientOne>>
}