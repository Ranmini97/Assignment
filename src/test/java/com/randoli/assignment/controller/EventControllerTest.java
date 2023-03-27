package com.randoli.assignment.controller;

import com.randoli.assignment.dto.EventDTO;
import com.randoli.assignment.entity.Event;
import com.randoli.assignment.service.EventService;
import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class EventControllerTest {

//    @InjectMocks
//    EventController eventController;

    @Mock
    private EventService eventService;

    String dateTimeString = "20151022102011927EDT";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSSZ");
    LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);


//    @Test //test case for GET/READ method (getEvent) - CRUD
//    public void getEventTest(){
//        List<EventDTO> events = new ArrayList<>();
//        events.add(new EventDTO(UUID.randomUUID(),
//                "0000abf8-d1f5-4536-8fb0-36fe934b1f28",
//                dateTime,
//                "10002",
//                "RPS-00001",
//                1,
//                "DESTINATION",
//                "T8C",
//                "1J7",
//                "0000000001"));
//        when(eventService.getAllEvents()).thenReturn(events);
//        EventService eventService = new EventService();
//        EventDTO expectedEvent = events.get(0);
//        EventDTO actualEvent = (EventDTO) eventService.getAllEvents();
//        assertEquals(expectedEvent, actualEvent);
//    }
//
//    @Test //test case for UPDATE method (updateEvent) - CRUD
//    public void updateEventTest(){
//
//    }



}
