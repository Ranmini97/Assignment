package com.randoli.assignment.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
<<<<<<< HEAD
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
=======
>>>>>>> origin/master
//import jakarta.persistence.TemporalType;
//import org.springframework.data.jpa.repository.Temporal;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
<<<<<<< HEAD
@NoArgsConstructor
@AllArgsConstructor
@Data //to add getters and setters
=======

 //to add getters and setters
>>>>>>> origin/master
public class Event {
    @Id
    @Column(name = "event_id", columnDefinition = "BINARY(16)") //UUID have fixed length of 16 bytes (stores 126-bit value in binary format)
    private UUID eventId;
    @Column(name = "trans_id", columnDefinition = "VARCHAR(40)")
    private String transId;
    @Column(name = "trans_tms", columnDefinition = "TIMESTAMP") // to use time zone
    private LocalDateTime transTms;
    @Column(name = "re_num", columnDefinition = "VARCHAR(10)")
    private String reNum;
<<<<<<< HEAD
=======


>>>>>>> origin/master
    @Column(name = "client_id", columnDefinition = "VARCHAR(15)")
    private String clientId;
    @Column(name = "event_cnt", columnDefinition = "INT")
    private int eventCnt;
    @Column(name = "location_cd", columnDefinition = "VARCHAR(15)")
    private String locationCd;
<<<<<<< HEAD
    @Column(name = "location_id1", columnDefinition = "VARCHAR(10)")
    private String locationId1;
    @Column(name = "location_id2", columnDefinition = "VARCHAR(10)")
    private String locationId2;
    @Column(name = "addr_nbr", columnDefinition = "VARCHAR(15)")
=======
    @Column(name = "trans_tms", columnDefinition = "VARCHAR(10)")
    private String locationId1;
    @Column(name = "trans_tms", columnDefinition = "VARCHAR(10)")
    private String locationId2;
    @Column(name = "trans_tms", columnDefinition = "VARCHAR(15)")
>>>>>>> origin/master
    private String addrNbr;


}
