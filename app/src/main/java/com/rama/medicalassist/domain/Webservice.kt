package com.rama.medicalassist.domain

import com.rama.medicalassist.data.model.*
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Webservice {
    @GET("GetFeatures")
    suspend fun getFeatures(): Features

    @GET("GetOutcomes")
    suspend fun getOutcomes(): Outcomes

    @GET("InitSession")
    suspend fun initSesion(): SessionId

    @POST("AcceptTermsOfUse")
    suspend fun acceptTermsOfUse(
        @Query("SessionID") sessionId: String,
        @Query("passphrase") passphrase: String
    ): StatusOkOrError

    @GET("GetUseDefaultValues")
    suspend fun getUseDefaultValues(
        @Query("SessionID") sessionId: String
    ): DefaultValues

    @POST("SetUseDefaultValues")
    suspend fun setUseDefaultValues(
        @Query("SessionID") sessionId: String,
        @Query("value") value: Boolean
    ): StatusOkOrError

    @POST("UpdateFeature")
    suspend fun updateFeature(
        @Query("SessionID") sessionId: String,
        @Query("name") name: String,
        @Query("value") value: String
    ): StatusOkOrError

    @POST("DeleteFeature")
    suspend fun deleteFeature(
        @Query("SessionID") sessionId: String,
        @Query("name") name: String,
    ): StatusOkOrError

    @GET("GetSuggestedTests")
    suspend fun getSuggestedTest(
        @Query("SessionID") sessionId: String,
        @Query("TopDiseasesToTake") take: Int
    ): SuggestedTests

    @GET("GetSuggestedFeatures_PatientProvided")
    suspend fun getSuggestedFeaturesPatientProvided(
        @Query("SessionID") sessionId: String,
        @Query("TopDiseasesToTake") take: Int
    ): SuggestedFeatures

    @GET("GetSuggestedFeatures_PhysicianProvided")
    suspend fun getSuggestedFeaturesPhysicianProvided(
        @Query("SessionID") sessionId: String,
        @Query("TopDiseasesToTake") take: Int
    ): SuggestedFeatures
    @GET("Analyze")
    suspend fun analize(
        @Query("SessionID") sessionId: String,
        @Query("NumberOfResults") take: Int,
        @Query("ResponseFormat") responseFormat: String
    ): Analized
}