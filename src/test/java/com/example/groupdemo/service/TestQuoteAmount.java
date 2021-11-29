package com.example.groupdemo.service;

import com.example.groupdemo.model.Driver;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestQuoteAmount {

    public FactorCalculator factorCalculator = new FactorCalculator();

    private String prefix = "TEST";
    private String firstName = "TEST";
    private String lastName = "TEST";
    private String telephoneNumber = "TEST";
    private String addressLineOne = "TEST";
    private String addressLineTwo = "TEST";
    private String addressCity = "TEST";
    private String addressPostcode = "TEST";
    private String vehicleType = "Hatchback";
    private int engineSize = 1600;
    private int additionalDrivers = 3;
    private String isCommericial = "True";
    private String isRegisteredOutsideState = "True";
    private int vehicleValue = 5000;
    private String dateRegistered = "01/01/2021";

    private Driver driver = new Driver(1l,
            prefix,
            firstName,
            lastName,
            telephoneNumber,
            addressLineOne,
            addressLineTwo,
            addressCity,
            addressPostcode,
            vehicleType,
            engineSize,
            additionalDrivers,
            isCommericial,
            isRegisteredOutsideState,
            vehicleValue,
            dateRegistered);

    private Driver driver2 = new Driver(1l,
            prefix,
            firstName,
            lastName,
            telephoneNumber,
            addressLineOne,
            addressLineTwo,
            addressCity,
            addressPostcode,
            "Cabriolet",
            3000,
            1,
            "False",
            "False",
            15000,
            dateRegistered);

    @Test
    void calculateInsurcanceQuoteTESTDriver1() {
        assertEquals("371.71", factorCalculator.calculateInsurcanceQuote(driver).toString());
    }

    @Test
    void calculateInsurcanceQuoteTESTDriver2() {
        assertEquals("514.80", factorCalculator.calculateInsurcanceQuote(driver2).toString());
    }
}