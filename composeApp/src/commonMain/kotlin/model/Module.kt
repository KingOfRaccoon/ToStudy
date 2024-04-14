package model

import kotlinx.serialization.Serializable

@Serializable
data class Module(
    val endcontent: String,
    val id: Id,
    val idTrackId: Int,
    val idtrack: Idtrack,
    val name: String,
    val quantitycoins: Int,
    val quantitypages: Int,
    val startcontent: String
)