package com.randoli.assignment.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.randoli.assignment.dto.EventDTO;
import com.randoli.assignment.entity.Event;
import com.randoli.assignment.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "api/event")
@CrossOrigin
public class EventController {
    @Autowired
    private EventService eventService;

    @PostMapping("/createEvents") //Create
    public ResponseEntity<String> createEvents(@RequestBody String payload) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(payload);
        List<Event> events = new ArrayList<>();

        JsonNode records = jsonNode.get("records");
        for(JsonNode record : records){
            UUID eventId = UUID.randomUUID();
            String transId = record.get("transId").asText();
            LocalDateTime transTms = LocalDateTime.parse(record.get("transTms").asText());
            String reNum = record.get("reNum").asText();
            String clientId = record.get("clientId").asText();
            int eventCnt = record.get("eventCnt").asInt();
            String locationCd = record.get("locationCd").asText();
            String locationId1 = record.get("locationId1").asText();
            String locationId2 = record.get("locationId2").asText();
            String addrNbr = record.get("addrNbr").asText();
            events.add(new Event(eventId,transId,transTms,reNum,clientId,eventCnt,locationCd,locationId1,locationId2,addrNbr));

        }

        eventService.saveAll(events);
        return ResponseEntity.ok("Events are saved");
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