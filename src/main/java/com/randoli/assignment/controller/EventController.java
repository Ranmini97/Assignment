package com.randoli.assignment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/event")
@CrossOrigin
public class EventController {

    @PostMapping("/saveEvent") //Create
    public String saveEvent(){
        return "event saved - Created";
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
