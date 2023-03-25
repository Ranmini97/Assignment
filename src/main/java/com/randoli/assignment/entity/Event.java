package com.randoli.assignment.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//import jakarta.persistence.TemporalType;
//import org.springframework.data.jpa.repository.Temporal;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data //to add getters and setters
public class Event {

    //(strategy = GenerationType.IDENTITY)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id", columnDefinition = "BINARY(16)") //UUID have fixed length of 16 bytes (stores 126-bit value in binary format)
    private UUID eventId;
    @Column(name = "trans_id", columnDefinition = "VARCHAR(40)")
    private String transId;
    @Column(name = "trans_tms", columnDefinition = "TIMESTAMP") // to use time zone
    private LocalDateTime transTms;
    @Column(name = "re_num", columnDefinition = "VARCHAR(10)")
    private String reNum;
    @Column(name = "client_id", columnDefinition = "VARCHAR(15)")
    private String clientId;
    @Column(name = "event_cnt", columnDefinition = "INT")
    private int eventCnt;
    @Column(name = "location_cd", columnDefinition = "VARCHAR(15)")
    private String locationCd;
    @Column(name = "location_id1", columnDefinition = "VARCHAR(10)")
    private String locationId1;
    @Column(name = "location_id2", columnDefinition = "VARCHAR(10)")
    private String locationId2;
    @Column(name = "addr_nbr", columnDefinition = "VARCHAR(15)")
    private String addrNbr;






}
