package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Laba 6.Lock
 *
 * @Autor: vovamv
 * @DateTime: 10/25/20|12:23 пп
 * @Version Lock: 1.0
 */

public class Lock {
    static Map<String, Double> locks = new HashMap<>(){{
        put("mortise", 0.00);
        put("electromechanical", 800.00);
    }};

    public static double getPrice(String type) {
        return locks.get(type);
    }
}
