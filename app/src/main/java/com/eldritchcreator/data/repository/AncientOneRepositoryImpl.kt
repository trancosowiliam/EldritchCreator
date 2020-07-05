package com.eldritchcreator.data.repository

import com.eldritchcreator.data.local.datasource.AncientOneDataSource
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Response

class AncientOneRepositoryImpl(
    private val ancientOneDataSource: AncientOneDataSource
) : AncientOneRepository {
    override suspend fun getAncientOnes(): Response<List<AncientOne>> {
        return ancientOneDataSource.getAncientOnes()
    }
}