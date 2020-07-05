package com.eldritchcreator.data.local.datasource

import com.eldritchcreator.data.local.datasource.fakedatabase.FakeDataBase
import com.eldritchcreator.domain.model.AncientOne
import com.eldritchcreator.domain.model.Response
import com.eldritchcreator.domain.model.toResponse

class AncientOneDatabaseDataSource : AncientOneDataSource {

    override suspend fun getAncientOnes(): Response<List<AncientOne>> {
        return FakeDataBase.ancientOnes.toResponse()
    }
}