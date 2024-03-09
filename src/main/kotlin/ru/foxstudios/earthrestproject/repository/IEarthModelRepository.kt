package ru.foxstudios.earthrestproject.repository

import org.springframework.data.jpa.repository.JpaRepository
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.service.EarthRestService

interface IEarthModelRepository:JpaRepository<EarthRestModel, String> {
    fun findEarthRestModelByUuid(Uuid:String):EarthRestModel
}