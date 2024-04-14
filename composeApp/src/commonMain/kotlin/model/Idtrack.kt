package model

import kotlinx.serialization.Serializable

@Serializable
data class Idtrack(
    val id: Int,
    val name: String,
    val quantitymodels: Int
)