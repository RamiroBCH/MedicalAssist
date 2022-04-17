package com.rama.medicalassist.domain

import com.rama.medicalassist.data.model.*
import com.rama.medicalassist.vo.Resource
import javax.inject.Inject

class RepoImpl @Inject constructor(private val datasource: Datasource): Repo {
    override suspend fun getFeatures(): Resource<Features> {
        return datasource.getFeatures()
    }

    override suspend fun getOutcomes(): Resource<Outcomes> {
        return datasource.getOutcomes()
    }

    override suspend fun initSesion(): Resource<SessionId> {
        return datasource.initSesion()
    }

    override suspend fun acceptTermsOfUse(): Resource<StatusOkOrError> {
        return datasource.acceptTermsOfUse()
    }

    override suspend fun getUseDefaultValues(): Resource<DefaultValues> {
        return datasource.getUseDefaultValues()
    }

    override suspend fun setUseDefaultValues(value: Boolean): Resource<StatusOkOrError> {
        return datasource.setUseDefaultValues(value)
    }

    override suspend fun updateFeature(name: String, value: String): Resource<StatusOkOrError> {
        return datasource.updateFeatures(name,value)
    }

    override suspend fun deleteFeature(name: String): Resource<StatusOkOrError> {
        return datasource.deteleFeature(name)
    }

    override suspend fun getSuggestedTests(): Resource<SuggestedTests> {
        return datasource.getSuggestedTests()
    }

    override suspend fun getSuggestedFeaturesPatientProvided(): Resource<SuggestedFeatures> {
        return datasource.getSuggestedFeaturesPatientProvided()
    }

    override suspend fun getSuggestedFeaturesPhysicianProvided(): Resource<SuggestedFeatures> {
        return datasource.getSuggestedFeaturesPhysicianProvided()
    }

    override suspend fun analize(): Resource<Analized> {
        return datasource.analize()
    }
}