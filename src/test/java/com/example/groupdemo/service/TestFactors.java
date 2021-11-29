package com.example.groupdemo.service;

import com.example.groupdemo.model.Driver;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TestFactors {

    public FactorCalculator factorCalculator = new FactorCalculator();

    @Test
    void calculateVehicleTypeFactorTEST() {
        assertAll(
                () -> assertEquals(1.3, factorCalculator.calculateVehicleTypeFactor("Cabriolet")),
                () -> assertEquals(1.4, factorCalculator.calculateVehicleTypeFactor("Coupe")),
                () -> assertEquals(1.5, factorCalculator.calculateVehicleTypeFactor("Estate")),
                () -> assertEquals(1.6, factorCalculator.calculateVehicleTypeFactor("Hatchback")),
                () -> assertEquals(1.7, factorCalculator.calculateVehicleTypeFactor("Other"))
        );
    }

    @Test
    void calculateEngineSizeFactorTEST() {
        assertAll(
                () -> assertEquals(1.0, factorCalculator.calculateEngineSizeFactor(1000)),
                () -> assertEquals(1.6, factorCalculator.calculateEngineSizeFactor(1600)),
                () -> assertEquals(2.0, factorCalculator.calculateEngineSizeFactor(2000)),
                () -> assertEquals(2.5, factorCalculator.calculateEngineSizeFactor(2500)),
                () -> assertEquals(3.0, factorCalculator.calculateEngineSizeFactor(3000)),
                () -> assertEquals(3.5, factorCalculator.calculateEngineSizeFactor(1234))

        );
    }

    @Test
    void calculateVehicleValueFactorTEST() {
        assertAll(
                () -> assertEquals(1.0, factorCalculator.calculateVehicleValueFactor(4000)),
                () -> assertEquals(1.2, factorCalculator.calculateVehicleValueFactor(6000))
        );
    }

    @Test
    void calculateAdditionalDriversFactorTEST() {
        assertAll(
                () -> assertEquals(1.1, factorCalculator.calculateAdditionalDriversFactor(0)),
                () -> assertEquals(1.1, factorCalculator.calculateAdditionalDriversFactor(1)),
                () -> assertEquals(1.2, factorCalculator.calculateAdditionalDriversFactor(2)),
                () -> assertEquals(1.2, factorCalculator.calculateAdditionalDriversFactor(3))
                );
    }

    @Test
    void calculateCommercialUseFactorTEST() {
        assertAll(
                () -> assertEquals(1.1, factorCalculator.calculateCommercialUseFactor("True")),
                () -> assertEquals(1.0, factorCalculator.calculateCommercialUseFactor("False"))

        );
    }

    @Test
    void calculateOutsideStateUseFactorTEST() {
        assertAll(
                () -> assertEquals(1.1, factorCalculator.calculateOutsideStateUseFactor("True")),
                () -> assertEquals(1.0, factorCalculator.calculateOutsideStateUseFactor("False"))

        );

    }
}