package ru.foxstudios.earthrestproject.controller

import com.fasterxml.jackson.databind.ObjectMapper
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
data class JsonData(
        var name: String = "",
        var commentary: String = "",
        var file: String = "",
        var ext: String = ""
)
@RestController
@RequestMapping("Message")
class EarthRestController(@Autowired val earthRestService: EarthRestService) {
    @PostMapping("/json")
    fun saveJsonData(@RequestBody jsonData: String): EarthRestModel {
        val json = ObjectMapper().readValue(jsonData, JsonData::class.java)
        return earthRestService.saveMessage(json)
    }
}