package com.rama.medicalassist.domain

import com.rama.medicalassist.data.model.*
import com.rama.medicalassist.vo.Resource

interface Datasource {
    suspend fun getFeatures(): Resource<Features>
    suspend fun getOutcomes(): Resource<Outcomes>
    suspend fun initSesion(): Resource<SessionId>
    suspend fun acceptTermsOfUse(): Resource<StatusOkOrError>
    suspend fun getUseDefaultValues(): Resource<DefaultValues>
    suspend fun setUseDefaultValues(value: Boolean): Resource<StatusOkOrError>
    suspend fun updateFeatures(name: String, value: String): Resource<StatusOkOrError>
    suspend fun deteleFeature(name: String): Resource<StatusOkOrError>
    suspend fun getSuggestedTests(): Resource<SuggestedTests>
    suspend fun getSuggestedFeaturesPatientProvided(): Resource<SuggestedFeatures>
    suspend fun getSuggestedFeaturesPhysicianProvided(): Resource<SuggestedFeatures>
    suspend fun analize(): Resource<Analized>
}