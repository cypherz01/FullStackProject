package com.example.groupdemo.model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String prefix;
    private String firstName;
    private String lastName;
    private String telephoneNumber;
    private String addressLineOne;
    private String addressLineTwo;
    private String addressCity;
    private String addressPostcode;
    private String vehicleType;
    private int engineSize;
    private int AdditionalDrivers;
    private String Commercial;
    private String RegisteredOutsideState;
    private int vehicleValue;
    private String dateRegistered;
    private String premium;

    public Driver() {
    }

    public Driver(Long id,
                  String prefix,
                  String firstName,
                  String lastName,
                  String telephoneNumber,
                  String addressLineOne,
                  String addressLineTwo,
                  String addressCity,
                  String addressPostcode,
                  String vehicleType,
                  int engineSize,
                  int additionalDrivers,
                  String Commercial,
                  String RegisteredOutsideState,
                  int vehicleValue,
                  String dateRegistered) {
        this.id = id;
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephoneNumber = telephoneNumber;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.addressCity = addressCity;
        this.addressPostcode = addressPostcode;
        this.vehicleType = vehicleType;
        this.engineSize = engineSize;
        AdditionalDrivers = additionalDrivers;
        this.Commercial = Commercial;
        this.RegisteredOutsideState = RegisteredOutsideState;
        this.vehicleValue = vehicleValue;
        this.dateRegistered = dateRegistered;
        this.premium = "";

    }

    public String getPremium() {
        return premium;
    }

    public void setPremium(String premium) {
        this.premium = premium;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getAddressLineOne() {
        return addressLineOne;
    }

    public void setAddressLineOne(String addressLineOne) {
        this.addressLineOne = addressLineOne;
    }

    public String getAddressLineTwo() {
        return addressLineTwo;
    }

    public void setAddressLineTwo(String addressLineTwo) {
        this.addressLineTwo = addressLineTwo;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressPostcode() {
        return addressPostcode;
    }

    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public int getAdditionalDrivers() {
        return AdditionalDrivers;
    }

    public void setAdditionalDrivers(int additionalDrivers) {
        AdditionalDrivers = additionalDrivers;
    }

    public String getCommercial() {
        return Commercial;
    }

    public void setCommercial(String Commercial) {
        this.Commercial = Commercial;
    }

    public String getRegisteredOutsideState() {
        return RegisteredOutsideState;
    }

    public void setRegisteredOutsideState(String RegisteredOutsideState) {
        this.RegisteredOutsideState = RegisteredOutsideState;
    }

    public int getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(int vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }
}
