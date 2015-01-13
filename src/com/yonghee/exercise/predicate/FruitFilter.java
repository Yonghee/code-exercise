package com.yonghee.exercise.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by yhlee on 15. 1. 13..
 */
public class FruitFilter {

    public static <T> List<T> filter(List<T> fruits, Predicate<T> predicate) {

        List<T> result = new ArrayList<T>();
        for (T item : fruits) {
            if (predicate.test(item)) {
               result.add(item);
            }
        }

        return result;
    }

}
