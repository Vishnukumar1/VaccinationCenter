package com.corona.portal.VaccinationCenter.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "VaccinationCenter")
public class VaccinationCenter
{
    @Id
    private int id;
    private String centerName;
    private String centerAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterAddress() {
        return centerAddress;
    }

    public void setCenterAddress(String centerAddress) {
        this.centerAddress = centerAddress;
    }

    public VaccinationCenter(int id, String centerName, String centerAddress) {
        this.id = id;
        this.centerName = centerName;
        this.centerAddress = centerAddress;
    }

    public VaccinationCenter() {
    }

    @Override
    public String toString() {
        return "VaccinationCenter{" +
                "id=" + id +
                ", centerName='" + centerName + '\'' +
                ", centerAddress='" + centerAddress + '\'' +
                '}';
    }
}
