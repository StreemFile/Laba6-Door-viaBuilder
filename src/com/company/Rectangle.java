package com.company;

/**
 * Created by IntelliJ IDEA.
 * Laba 6.Rectangle
 *
 * @Autor: vovamv
 * @DateTime: 10/8/20|10:53 дп
 * @Version Rectangle: 1.0
 */

public class Rectangle {
    double height;
    double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
