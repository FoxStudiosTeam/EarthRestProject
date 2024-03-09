package ru.foxstudios.earthrestproject.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import ru.foxstudios.earthrestproject.controller.JsonData
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.repository.IEarthModelRepository

@Service
class EarthRestService(@Autowired var earthRestRepository: IEarthModelRepository){
    fun saveMessage(jsonData: JsonData):EarthRestModel {
        val earthRestModel = EarthRestModel(jsonData)
        return earthRestRepository.save(earthRestModel)
    }
}