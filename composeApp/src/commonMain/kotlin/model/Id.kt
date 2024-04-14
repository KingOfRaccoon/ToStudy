package model

import kotlinx.serialization.Serializable

@Serializable
data class Id(
    val idtrack: Int,
    val numberintrack: Int
)