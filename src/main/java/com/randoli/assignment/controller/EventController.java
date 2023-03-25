package com.randoli.assignment.controller;

import com.randoli.assignment.dto.EventDTO;
import com.randoli.assignment.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/getEvents") //Read
    public List<EventDTO> getEvent(){
        return eventService.getAllEvents();
    }

    @PutMapping ("/updateEvent") //Update
    public EventDTO updateEvent(@RequestBody EventDTO eventDTO) {
        return eventService.updateEvent(eventDTO);
    }

    @DeleteMapping ("/deleteEvent") //Delete
    public boolean deleteEvent(@RequestBody EventDTO eventDTO){
        return eventService.deleteEvent(eventDTO);
    }


}
