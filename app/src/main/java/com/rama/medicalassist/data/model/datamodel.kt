package com.rama.medicalassist.data.model

data class Outcomes(
    val `data`: List<String>,
    val status: String
)
data class Features(
    val `data`: List<String>,
    val status: String
)
data class SessionId(
    val SessionID: String,
    val status: String
)
data class StatusOkOrError(
    val status: String
)
data class DefaultValues(
    val status: String,
    val value: Boolean
)
data class SuggestedTests(
    val Tests: List<String>,
    val status: String
)
data class SuggestedFeatures(
    val SuggestedFeatures: List<String>,
    val status: String
)

data class Analized(
    val Diseases: List<Any>,
    val VariableImportances: List<Any>,
    val status: String
)
