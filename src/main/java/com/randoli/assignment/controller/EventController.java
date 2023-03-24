package com.randoli.assignment.controller;

import com.randoli.assignment.dto.EventDTO;
import com.randoli.assignment.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/event")
@CrossOrigin
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/saveEvent") //Create
    public EventDTO saveEvent(@RequestBody EventDTO eventDTO){
        return eventService.saveEvent(eventDTO);
    }

    @GetMapping("/getEvent") //Read
    public String getEvent(){
        return "this is the event - Read";
    }

    @PutMapping ("/updateEvent") //Update
    public String updateEvent(){
        return "Event updated";
    }

    @DeleteMapping ("/deleteEvent") //Delete
    public String deleteEvent(){
        return "Event deleted";
    }


}
