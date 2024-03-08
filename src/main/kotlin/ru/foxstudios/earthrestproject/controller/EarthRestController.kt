package ru.foxstudios.earthrestproject.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import ru.foxstudios.earthrestproject.service.EarthRestService

@RestController
@RequestMapping("Message")
class EarthRestController {
    var service:EarthRestService=EarthRestService()
    @GetMapping("all")
    fun getMessage():String{
        return service.getMessage()
    }
}