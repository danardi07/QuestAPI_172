package com.example.pamhttp.repositori

import com.example.pamhttp.apiservice.ServiceApiSiswa
import com.example.pamhttp.modeldata.DataSiswa


interface RepositoryDataSiswa{
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa): retrofit2.Response<Void>
    suspend fun getSatuSiswa(id: Int) : DataSiswa

}

class JaringanRepositoryDataSiswa(
    private  val serviceApiSiswa: ServiceApiSiswa

):RepositoryDataSiswa{
    override suspend fun getDataSiswa() : List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa):
            retrofit2.Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)

    override suspend fun getSatuSiswa(id: Int): DataSiswa = serviceApiSiswa.getSatuSiswa(id)

}