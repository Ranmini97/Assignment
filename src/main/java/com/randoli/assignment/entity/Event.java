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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //IDENTITY
    @Column(name = "event_id", columnDefinition = "BINARY(16)") //UUID have fixed length of 16 bytes (stores 126-bit value in binary format)
    private UUID eventId;
    @Column(name = "trans_id", columnDefinition = "VARCHAR(40)")
    private String transId;
    @Column(name = "trans_tms", columnDefinition = "TIMESTAMP") // selected timestamp to access the time zone details
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


//    public Event(UUID eventId, String transId, LocalDateTime transTms, String reNum, String clientId, int eventCnt, String locationCd, String locationId1, String locationId2, String addrNbr) {
//        this.eventId = eventId;
//        this.transId = transId;
//        this.transTms = transTms;
//        this.reNum = reNum;
//        this.clientId = clientId;
//        this.eventCnt = eventCnt;
//        this.locationCd = locationCd;
//        this.locationId1 = locationId1;
//        this.locationId2 = locationId2;
//        this.addrNbr = addrNbr;
//    }


}
