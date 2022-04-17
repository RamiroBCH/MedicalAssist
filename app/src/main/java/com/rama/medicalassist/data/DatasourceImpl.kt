package com.rama.medicalassist.data

import com.rama.medicalassist.data.model.*
import com.rama.medicalassist.domain.Datasource
import com.rama.medicalassist.domain.Webservice
import com.rama.medicalassist.vo.Resource
import javax.inject.Inject

class DatasourceImpl @Inject constructor(private val webservice: Webservice): Datasource {
    val api = "UpdateFeature?SessionID=1hQF4Tk23RnjKrC6&name=asdasdasd&value=true"
    lateinit var sessionId: String
    private val passphrase: String = "I have read, understood and I accept and agree to comply with the Terms of Use of EndlessMedicalAPI and Endless Medical services. The Terms of Use are available on endlessmedical.com"

    override suspend fun getFeatures(): Resource<Features> {
        return Resource.Success(webservice.getFeatures())
    }

    override suspend fun getOutcomes(): Resource<Outcomes> {
        return Resource.Success(webservice.getOutcomes())
    }

    override suspend fun initSesion(): Resource<SessionId> {
        sessionId = webservice.initSesion().toString()
        return Resource.Success(webservice.initSesion())
    }

    override suspend fun acceptTermsOfUse(): Resource<StatusOkOrError> {
        return Resource.Success(webservice.acceptTermsOfUse(sessionId = sessionId,passphrase = passphrase))
    }

    override suspend fun getUseDefaultValues(): Resource<DefaultValues> {
        return Resource.Success(webservice.getUseDefaultValues(sessionId = sessionId))
    }

    override suspend fun setUseDefaultValues(value: Boolean): Resource<StatusOkOrError> {
        return Resource.Success(webservice.setUseDefaultValues(sessionId = sessionId,value))
    }

    override suspend fun updateFeatures(name: String, value: String): Resource<StatusOkOrError> {
        return Resource.Success(webservice.updateFeature(sessionId = sessionId, name, value))
    }

    override suspend fun deteleFeature(name: String): Resource<StatusOkOrError> {
        return Resource.Success(webservice.deleteFeature(sessionId = sessionId, name))
    }

    override suspend fun getSuggestedTests(): Resource<SuggestedTests> {
        return Resource.Success(webservice.getSuggestedTest(sessionId = sessionId,20))
    }

    override suspend fun getSuggestedFeaturesPatientProvided(): Resource<SuggestedFeatures> {
        return Resource.Success(webservice.getSuggestedFeaturesPatientProvided(sessionId = sessionId, 20))
    }

    override suspend fun getSuggestedFeaturesPhysicianProvided(): Resource<SuggestedFeatures> {
        return Resource.Success(webservice.getSuggestedFeaturesPhysicianProvided(sessionId = sessionId, 20))
    }

    override suspend fun analize(): Resource<Analized> {
        return Resource.Success(webservice.analize(sessionId = sessionId, 20,"json"))
    }
}