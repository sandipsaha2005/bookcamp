package com.tw.bootcamp.problem3;

import com.tw.bootcamp.problem3scratch.InvalidMeasureValue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void shouldCompareGallonWithLiters() throws InvalidMeasureValue {
        Volume gallon = Volume.of(1, VolumeUnits.GALLON);
        assertEquals(Volume.of(3.78, VolumeUnits.LITER), gallon);
    }

    @Test
    void shouldThrowIfNegativeValueIsGivenAsVolume() {
        InvalidMeasureValue invalidMeasureValue = assertThrows(InvalidMeasureValue.class, () -> Volume.of(-1, VolumeUnits.GALLON));
        assertEquals("Volume can't be negative", invalidMeasureValue.getMessage());
    }

    @Test
    void shouldBeAbleToAddGallonAndLiters() throws InvalidMeasureValue {
        Volume gallon = Volume.of(1, VolumeUnits.GALLON);
        Volume liter = Volume.of(1, VolumeUnits.LITER );
        Volume sum = gallon.add(liter);

        assertEquals(Volume.of(4.78, VolumeUnits.LITER), sum);
    }
}