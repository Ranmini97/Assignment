package com.randoli.assignment.service;

import com.randoli.assignment.dto.EventDTO;
import com.randoli.assignment.entity.Event;
import com.randoli.assignment.repo.EventRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EventService {
    @Autowired
    private EventRepository eventRepository;
    @Autowired
    private ModelMapper modelMapper;
    public EventDTO saveEvent(EventDTO eventDTO){
        eventRepository.save(modelMapper.map(eventDTO, Event.class));
        return eventDTO;
    }
}
