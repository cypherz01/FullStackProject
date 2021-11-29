/*
package com.example.groupdemo;


import com.example.groupdemo.model.Driver;
import com.example.groupdemo.repository.DriverRepository;
import com.example.groupdemo.service.DriverService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class GroupdemoApplicationTests {

    @Test
    @ExtendWith(MockitoExtension.class)
    void contextLoads() {

    }

    @Mock
    private DriverRepository driverRepository;
    @InjectMocks
    private DriverService driverService;

    private String prefix = "Mrs";
    private String firstName = "Mrs";
    private String lastName = "Mrs";
    private String telephoneNumber = "Mrs";
    private String addressLineOne = "Mrs";
    private String addressLineTwo = "Mrs";
    private String addressCity = "Mrs";
    private String addressPostcode = "Mrs";
    private String vehicleType = "";
    private int engineSize = 500;
    private int additionalDrivers = 1;
    private String isCommericial = "True";
    private String isRegisteredOutsideState = "False";
    private int vehicleValue = 4000;
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

    @Test
    void getDriverWithId1() {
        when(driverRepository.findById(1L)).thenReturn(Optional.of(driver));

        Optional<Driver> driver = driverService.getDriverByID(1L);

        assertAll(
                () -> assertEquals(firstName, driver.get().getFirstName()),
                () -> assertEquals(lastName, driver.get().getLastName())
        );
    }

}
*/