package com.rama.medicalassist.di

import com.google.gson.GsonBuilder
import com.rama.medicalassist.domain.Webservice
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WebserviceProvide {
    @Singleton
    @Provides
    fun provideWebservice(): Webservice{
        return Retrofit.Builder()
            .baseUrl("https://api.endlessmedical.com/v1/dx/")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(Webservice::class.java)
    }
}