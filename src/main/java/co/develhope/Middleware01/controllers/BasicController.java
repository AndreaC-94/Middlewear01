package co.develhope.Middleware01.controllers;

import co.develhope.Middleware01.services.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/time")
public class BasicController {

    @Autowired
    private BasicService basicService;

    @GetMapping
    public LocalDateTime currentTime(){
        return basicService.currentTime();
    }
}
