package com.rama.medicalassist.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.rama.medicalassist.domain.Repo
import com.rama.medicalassist.vo.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

@HiltViewModel
class MedAssistViewModel@Inject constructor(private val repo: Repo): ViewModel() {

//Data Transfer


//FUNCIONES
    fun getFeatures() = liveData(Dispatchers.IO) {
        emit(Resource.Loading)
        try {
            emit(repo.getFeatures())
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
    fun getOutcomes() = liveData(Dispatchers.IO) {
        emit(Resource.Loading)
        try {
            emit(repo.getOutcomes())
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
    fun initSession() = liveData(Dispatchers.IO) {
        emit(Resource.Loading)
        try {
            emit(repo.initSesion())
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
    fun acceptTermsOfUse() = liveData(Dispatchers.IO) {
        emit(Resource.Loading)
        try {
            emit(repo.acceptTermsOfUse())
        } catch (e: Exception) {
            emit(Resource.Failure(e))
        }
    }
}