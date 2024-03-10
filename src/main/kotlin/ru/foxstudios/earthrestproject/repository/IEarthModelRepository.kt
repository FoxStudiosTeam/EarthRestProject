package ru.foxstudios.earthrestproject.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.service.EarthRestService
@Repository
interface IEarthModelRepository:JpaRepository<EarthRestModel, String> {
    fun findEarthRestModelBy(uuid:String):EarthRestModel
}