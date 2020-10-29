package com.company;

/**
 * Created by IntelliJ IDEA.
 * Laba 6.Door
 *
 * @Autor: vovamv
 * @DateTime: 10/15/20|3:09 пп
 * @Version Door: 1.0
 */


public class Door extends Rectangle{

    final String material;
    final String color;
    final String lockType;
    final boolean hasWindow;


    public Door(double height, double width, String material, String color,
                String lockType, boolean hasWindow) {
        super(height, width);
        this.material = material;
        this.color = color;
        this.lockType = lockType;
        this.hasWindow = hasWindow;
    }

    public String getMaterial() {
        return material;
    }


    public String getColor() {
        return color;
    }


    public String getLockType() {
        return lockType;
    }

    public boolean isHasWindow() {
        return hasWindow;
    }


    public Double getPrice(){
        double price = 0;
        price += Material.getPrice(this.getMaterial());
        price += Color.getPrice(this.getColor());
        price *= super.getHeight()*0.055;
        price *= super.getWidth()*0.055;
        price += this.isHasWindow() == true? 250 : 0;
        price += Lock.getPrice(this.getLockType());
        price = Math.round(price*100.0)/100.0;
        return price;
    }

    @Override
    public String toString() {
        return "Door{" +
                "material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", lockType='" + lockType + '\'' +
                ", hasWindow=" + hasWindow +
                ", height=" + super.getHeight() +
                ", width=" + super.getWidth() +
                '}';
    }
}
