package ru.foxstudios.earthrestproject.model

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "EarthTable")
data class EarthRestModel(@Id var uuid : String = "",
                          var name: String = "",
                          var commentary: String = "",
                          var file: String = "",
                          var ext: String = "")