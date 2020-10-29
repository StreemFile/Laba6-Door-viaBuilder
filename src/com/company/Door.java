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

    String material;
    String color;
    String lockType;
    boolean hasWindow;

    public Door() {
    }

    public Door(double height, double width, String material, String color, String lockType, boolean hasWindow) {
        super(height, width);
        this.material = material;
        this.color = color;
        this.lockType = lockType;
        this.hasWindow = hasWindow;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLockType() {
        return lockType;
    }

    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    public boolean isHasWindow() {
        return hasWindow;
    }

    public void setHasWindow(boolean hasWindow) {
        this.hasWindow = hasWindow;
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
