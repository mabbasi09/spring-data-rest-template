package com.gridwise.demo.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "id", sequenceName = "id", allocationSize = 1)
    @Column(name = "id")
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

    private Integer doLocationId;

    private Integer paymentType;

    private Double totalAmount;

    public Long getId() {
        return id;
    }

    public String getStoreAndFwdFlag() {
        return storeAndFwdFlag;
    }

    public LocalDate getTpepPickupDatetime() {
        return tpepPickupDatetime;
    }

    public LocalDate getTpepDropoffDatetime() {
        return tpepDropoffDatetime;
    }

    public Double getTripDistance() {
        return tripDistance;
    }

    public Double getFareAmount() {
        return fareAmount;
    }

    public Double getExtra() {
        return extra;
    }

    public Double getMtaTax() {
        return mtaTax;
    }

    public Double getTipAmount() {
        return tipAmount;
    }

    public Double getTollsAmount() {
        return tollsAmount;
    }

    public Double getImprovementSurcharge() {
        return improvementSurcharge;
    }

    public Integer getVendorId() {
        return vendorId;
    }

    public Integer getPassengerCount() {
        return passengerCount;
    }

    public Integer getRatecodeId() {
        return ratecodeId;
    }

    public Integer getPuLocationId() {
        return puLocationId;
    }

    public Integer getDoLocationId() {
        return doLocationId;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStoreAndFwdFlag(String storeAndFwdFlag) {
        this.storeAndFwdFlag = storeAndFwdFlag;
    }

    public void setTpepPickupDatetime(LocalDate tpepPickupDatetime) {
        this.tpepPickupDatetime = tpepPickupDatetime;
    }

    public void setTpepDropoffDatetime(LocalDate tpepDropoffDatetime) {
        this.tpepDropoffDatetime = tpepDropoffDatetime;
    }

    public void setTripDistance(Double tripDistance) {
        this.tripDistance = tripDistance;
    }

    public void setFareAmount(Double fareAmount) {
        this.fareAmount = fareAmount;
    }

    public void setExtra(Double extra) {
        this.extra = extra;
    }

    public void setMtaTax(Double mtaTax) {
        this.mtaTax = mtaTax;
    }

    public void setTipAmount(Double tipAmount) {
        this.tipAmount = tipAmount;
    }

    public void setTollsAmount(Double tollsAmount) {
        this.tollsAmount = tollsAmount;
    }

    public void setImprovementSurcharge(Double improvementSurcharge) {
        this.improvementSurcharge = improvementSurcharge;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    public void setPassengerCount(Integer passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setRatecodeId(Integer ratecodeId) {
        this.ratecodeId = ratecodeId;
    }

    public void setPuLocationId(Integer puLocationId) {
        this.puLocationId = puLocationId;
    }

    public void setDoLocationId(Integer doLocationId) {
        this.doLocationId = doLocationId;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
