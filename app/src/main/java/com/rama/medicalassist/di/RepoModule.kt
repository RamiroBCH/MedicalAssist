package com.rama.medicalassist.di

import com.rama.medicalassist.domain.Repo
import com.rama.medicalassist.domain.RepoImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepoModule {

    @Binds
    @Singleton
    abstract fun bindRepo(repoImpl: RepoImpl): Repo
}