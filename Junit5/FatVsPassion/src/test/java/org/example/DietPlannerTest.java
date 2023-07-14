package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DietPlannerTest {

    private DietPlanner dietPlanner;

    @BeforeEach
    void setup(){
        this.dietPlanner = new DietPlanner(20, 30, 50);
    }

    @AfterEach
    void afterEach(){
        System.out.println("단위 테스트 종료");
    }

    @Test
    void 정확한_코더일때_다이어트_플랜을_리턴(){
        //given
        Coder coder = new Coder(1.82, 75.0, 25, Gender.MALE);
        DietPlan expected = new DietPlan(2210, 111, 74, 275);

        //when
        DietPlan actual = dietPlanner.calculateDiet(coder);

        //then
        assertAll(
                ()-> assertEquals(expected.getCalories(), actual.getCalories()),
                ()-> assertEquals(expected.getFat(), actual.getFat()),
                ()-> assertEquals(expected.getProtein(), actual.getProtein())
        );
    }

}