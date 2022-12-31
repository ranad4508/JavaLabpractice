/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB3;

class Ball {

    float x;
    float y;
    int radius;
    float xDelta;
    float yDelta;

    Ball() {
    }

    Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    int getRadius() {
        return radius;
    }

    void setRadius(int radius) {
        this.radius = radius;
    }

    float getXDelta() {
        return xDelta;
    }

    void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    float getYDelta() {
        return yDelta;
    }

    void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    void move() {
        System.out.println("Move one step:" + x + " " + y);
        x += xDelta;
        y += yDelta;
    }

    void reflectHorizontal() {
        xDelta = -xDelta;
    }

    void reflectVertical() {
        yDelta = -yDelta;
    }

    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}

public class Assignment8_Ball {

    public static void main(String[] args) {
        Ball b = new Ball(1, 2, 10, 3, 4);
        System.out.println(b);
        //bounce the ball within the boundary
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 3; i++) {
            b.move();
            System.out.println(b);
            float xNew = b.getX();
            float yNew = b.getY();
            int radius = b.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                b.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                b.reflectVertical();
            }
        }
    }

}
