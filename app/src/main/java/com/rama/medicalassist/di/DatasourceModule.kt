package com.rama.medicalassist.di

import com.rama.medicalassist.data.DatasourceImpl
import com.rama.medicalassist.domain.Datasource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DatasourceModule {

    @Binds
    @Singleton
    abstract fun bindDatasource(datasourceImpl: DatasourceImpl): Datasource
}