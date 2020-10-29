package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Laba 6.Color
 *
 * @Autor: vovamv
 * @DateTime: 10/25/20|12:19 пп
 * @Version Color: 1.0
 */

public class Color{
    private static Map<String, Double> colors = new HashMap<>(){{
        put("black", 0.00);
        put("white", 0.00);
        put("brown", 0.00);
        put("red", 10.00);
        put("yellow", 10.00);
        put("green", 10.00);
        put("gold", 30.00);
        put("blue", 20.00);
    }};
    public static double getPrice(String type) {
        return colors.get(type);
    }
}
