package ru.foxstudios.earthrestproject.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.repository.IEarthModelRepository
import ru.foxstudios.earthrestproject.service.EarthRestService

@RestController
@RequestMapping("Message")
class EarthRestController(@Autowired var repository: IEarthModelRepository) {
    var service:EarthRestService=EarthRestService(repository)
    @GetMapping("all/{value}")
    fun getMessage(@PathVariable value:String):EarthRestModel{
        return service.getMessage(value)
    }
}