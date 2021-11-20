package com.company;

public class Ball {
    private double height;
    private double smoothness;
    public Ball(double height, double smoothness){
        this.smoothness = smoothness;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getSmoothness() {
        return smoothness;
    }

    public int getJumps(){
        int result = 0;
        float multiplier = 1;
        while(height > 1){
            height = height / (multiplier / smoothness);
            multiplier+=0.1;
            result++;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "height=" + height +
                ", smoothness=" + smoothness +
                '}';
    }
}