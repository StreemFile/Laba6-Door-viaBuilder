package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Laba 6.Material
 *
 * @Autor: vovamv
 * @DateTime: 10/21/20|3:26 пп
 * @Version Material: 1.0
 */

public class Material{
    private static Map<String, Double> materials = new HashMap<>(){
        {
          put("wooden", 100.00);
          put("metal", 185.00);
          put("plastic", 140.00);
        }
    };

    public static double getPrice(String type) {
       return materials.get(type);
    }
}
