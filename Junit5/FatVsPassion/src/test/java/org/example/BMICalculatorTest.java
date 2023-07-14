package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    @DisplayName("다이어트가 필요합니까?")
    void dietRequired(){
        // given
        double weight = 75.2;
        double height = 1.73;

        // when
        boolean isDietRecommand = BMICalculator.isDietRecommended(weight, height);

        // then
        assertTrue(isDietRecommand);
    }

    @ParameterizedTest
    @ValueSource(doubles = {30.0, 75.0, 95.0, 144.0})
    @DisplayName("173cm일때 다이어트가 필요합니까?")
    void dietRequiredParameter(Double coderWeight){
        // given
        double weight = coderWeight;
        double height = 1.73;

        // when
        boolean isDietRecommand = BMICalculator.isDietRecommended(weight, height);

        // then
        assertTrue(isDietRecommand);
    }

    @ParameterizedTest(name = "weight={0}, height{1}")
    @CsvSource(value = {"120, 1.83", "11, 1.20"})
    @DisplayName("다이어트가 필요합니까?")
    void dietRequiredParameterBoth(Double coderWeight, Double coderHeight){
        // given
        double weight = coderWeight;
        double height = coderHeight;

        // when
        boolean isDietRecommand = BMICalculator.isDietRecommended(weight, height);

        // then
        assertTrue(isDietRecommand);
    }



    @Test
    @DisplayName("키가 0이면?")
    void throwArthmeticException(){
        // given
        double weight = 75.2;
        double height = 0.0;

        // when
        Executable executable = () -> BMICalculator.isDietRecommended(weight, height);

        // then
        assertThrows(ArithmeticException.class, executable);
    }

    @Test
    @DisplayName("코더들의 최악의 BMI 리턴")
    void returnCoderWithWorstBMI(){
        // given
        List<Coder> coders = new ArrayList<>();
        coders.add(new Coder(1.80, 120));
        coders.add(new Coder(1.50, 85));

        // when
        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        // then
        assertAll(
                () -> assertEquals(1.50, coderWorstBMI.getHeight()),
                () ->assertEquals(85, coderWorstBMI.getWeight())
        );
    }

    @Test
    @DisplayName("Null BMI 리턴")
    void returnNullBMI(){
        // given
        List<Coder> coders = new ArrayList<>();

        // when
        Coder coderWorstBMI = BMICalculator.findCoderWithWorstBMI(coders);

        // then
        assertNull(coderWorstBMI);
    }

}