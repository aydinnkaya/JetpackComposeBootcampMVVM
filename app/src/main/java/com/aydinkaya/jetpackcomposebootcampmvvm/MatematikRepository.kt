package com.aydinkaya.jetpackcomposebootcampmvvm

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MatematikRepository {
    var mds = MatematikDataSource()

    suspend fun add(alinanSayi1: String, alinanSayi2: String): String {

        return mds.add(alinanSayi1, alinanSayi2)
    }

    suspend fun multiplication(alinanSayi1: String, alinanSayi2: String): String =
        mds.multiplication(alinanSayi1, alinanSayi2)


}