package ru.foxstudios.earthrestproject.controller

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.foxstudios.earthrestproject.model.EarthRestModel
import ru.foxstudios.earthrestproject.model.JsonData
import ru.foxstudios.earthrestproject.service.EarthRestService

@RestController
@RequestMapping("Message")
class EarthRestController(@Autowired val earthRestService: EarthRestService) {
    @PostMapping("/json")
    fun saveJsonData(@RequestBody jsonData: String): EarthRestModel {
        val json = ObjectMapper().readValue(jsonData, JsonData::class.java)
        return earthRestService.saveMessage(json)
    }
    @GetMapping("/getAll")
    fun getMessageAll(){

    }
    @GetMapping("/getOne")
    fun getMessageOne(){

    }
}