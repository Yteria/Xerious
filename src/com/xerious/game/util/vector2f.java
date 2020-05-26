package com.xerious.game.util;

public class vector2f {

    public float x;
    public float y;

    public static float worldX;
    public static float worldY;

    public vector2f() {
        x = 0;
        y = 0;
    }

    public vector2f(vector2f vec) {
        new vector2f(vec.x, vec.y);
    }

    public vector2f(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void addX(float f) { x += f; }
    public void addY(float f) { y += f; }

    public void  setX(float f) { x = f; }
    public void  setY(float f) { y = f; }

    public void setVector(vector2f vec) {
        this.x = vec.x;
        this.y = vec.y;
    }

    public void setVector(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public static void setWorldvar(float x, float y) {
        worldX = x;
        worldY = y;
    }

    public vector2f getWorldVar() {
        return new vector2f(x - worldX, y - worldY);
    }

    @Override
    public String toString() {
        return x + ", " + y;
    }
}
