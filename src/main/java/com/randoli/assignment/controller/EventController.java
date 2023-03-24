package com.randoli.assignment.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/entity")
@CrossOrigin
public class EventController {

    @PostMapping("/saveEntity") //Create
    public String saveEntity(){
        return "entity saved - Created";
    }

    @GetMapping("/getEntity") //Read
    public String getEntity(){
        return "this is the entity - Read";
    }

    @PutMapping ("/updateEntity") //Update
    public String updateEntity(){
        return "entity updated";
    }

    @DeleteMapping ("/deleteEntity") //Delete
    public String deleteEntity(){
        return "entity deleted";
    }


}
