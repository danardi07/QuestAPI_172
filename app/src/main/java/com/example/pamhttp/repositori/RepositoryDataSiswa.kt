package com.example.pamhttp.repositori

import com.example.pamhttp.apiservice.ServiceApiSiswa
import com.example.pamhttp.modeldata.DataSiswa

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>

}

class JaringanRepositoryDataSiswa (
    private val serviceApiSiswa: ServiceApiSiswa
):RepositoryDataSiswa{
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
}