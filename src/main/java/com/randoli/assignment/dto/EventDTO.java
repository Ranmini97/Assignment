package com.randoli.assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventDTO {
    private UUID eventId;
    private String transId;
    private LocalDateTime transTms;
    private String reNum;
    private String clientId;
    private int eventCnt;
    private String locationCd;
    private String locationId1;
    private String locationId2;
    private String addrNbr;

//    public EventDTO(UUID eventId, String transId, LocalDateTime transTms, String reNum, String clientId, int eventCnt, String destination, String t8C, String locationId2, String addrNbr) {
//    }
}
