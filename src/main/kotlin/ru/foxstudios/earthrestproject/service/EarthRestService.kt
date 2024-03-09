package ru.foxstudios.earthrestproject.service

import org.springframework.stereotype.Service
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.repository.IEarthModelRepository

@Service
class EarthRestService(var repository: IEarthModelRepository){
    fun getMessage(value: String):EarthRestModel{
        val messageSend:EarthRestModel = repository.findEarthRestModelByUuid(value)
        return messageSend
    }
}