package com.gridwise.demo.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
public class Trip {

    @Id
    @GeneratedValue
    private Long id;

    private String storeAndFwdFlag;

    private LocalDate tpepPickupDatetime;

    private LocalDate tpepDropoffDatetime;

    private Double tripDistance;

    private Double fareAmount;

    private Double extra;

    private Double mtaTax;

    private Double tipAmount;

    private Double tollsAmount;

    private Double improvementSurcharge;

    private Integer vendorId;

    private Integer passengerCount;

    private Integer ratecodeId;

    private Integer puLocationId;

//    @Column(name = "DOLocationID")
    private Integer doLocationId;

    private Integer paymentType;

    private Double totalAmount;

}
