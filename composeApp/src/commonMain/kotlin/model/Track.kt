package model

import kotlinx.serialization.Serializable

@Serializable
class Track(val id: Int = -1, val name: String = "", val quantitymodels: Int = 0)