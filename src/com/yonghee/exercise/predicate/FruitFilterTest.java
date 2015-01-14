package com.yonghee.exercise.predicate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FruitFilterTest {

    @org.junit.Test
    public void testFilter() throws Exception {

        List<Apple> apples = new ArrayList<Apple>();
        apples.add(new Apple("red", 10));
        apples.add(new Apple("blue", 22));
        apples.add(new Apple("green", 5));

        List<Apple> result = FruitFilter.filter(apples, (Apple apple)->"red".equals(apple.getColor()));

        assertEquals(1,result.size());
    }
}

class Apple {

    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}