package ru.foxstudios.earthrestproject.service

import org.springframework.stereotype.Service
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.repository.IEarthModelRepository

@Service
class EarthRestService(var earthRestRepository: IEarthModelRepository){
    fun saveMessage(jsonData: EarthRestModel) {
        earthRestRepository.save(jsonData)
    }
}