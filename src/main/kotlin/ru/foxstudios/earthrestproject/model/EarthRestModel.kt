package ru.foxstudios.earthrestproject.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "earth_table")
data class EarthRestModel(@Id var uuid : String = "",
                          var name: String = "",
                          var commentary: String = "",
                          var file: String = "",
                          var ext: String = "")
{
    constructor(jsonData: JsonData) : this(
            uuid = UUID.randomUUID().toString(),
            name = jsonData.name,
            commentary = jsonData.commentary,
            file = jsonData.file,
            ext = jsonData.ext
    )
}