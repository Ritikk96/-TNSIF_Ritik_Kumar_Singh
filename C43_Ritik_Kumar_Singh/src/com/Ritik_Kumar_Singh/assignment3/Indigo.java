package com.Ritik_Kumar_Singh.assignment3;

public class Indigo implements Airfare {
    private int hours;
    private double costPerHour;

    public Indigo() {
    }

    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculateAmount() {
        return Math.round(hours * costPerHour * 8 * 100.0) / 100.0;
    }
}


