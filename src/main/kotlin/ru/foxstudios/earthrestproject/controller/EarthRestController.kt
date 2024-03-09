package ru.foxstudios.earthrestproject.controller

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.repository.IEarthModelRepository
import ru.foxstudios.earthrestproject.service.EarthRestService

@RestController
@RequestMapping("Message")
class EarthRestController(@Autowired var earthRestRepository: IEarthModelRepository) {
    var earthRestService:EarthRestService=EarthRestService(earthRestRepository)
    @PostMapping("/json")
    fun saveJsonData(@RequestBody jsonData: EarthRestModel): String {
        earthRestService.saveMessage(jsonData)
        return "Data saved successfully"
    }
}