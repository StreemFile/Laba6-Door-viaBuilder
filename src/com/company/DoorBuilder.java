package com.company;

/**
 * Created by IntelliJ IDEA.
 * Laba 6.PlasticDoorBuilder
 *
 * @Autor: vovamv
 * @DateTime: 10/29/20|11:17 пп
 * @Version PlasticDoorBuilder: 1.0
 */

public class DoorBuilder extends Rectangle implements IDoorBuilder {
    String material;
    String color;
    String lockType;
    boolean hasWindow;
    @Override
    public void setDoorHeight(double height) {
        super.setHeight(height);
    }

    @Override
    public void setDoorWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setLockType(String lockType) {
        this.lockType = lockType;
    }

    @Override
    public void setHasWindow(boolean hasWindow) {
        this.hasWindow = hasWindow;
    }

    @Override
    public Door build() {
        return new Door(height, width, material, color, lockType, hasWindow);
    }
}
