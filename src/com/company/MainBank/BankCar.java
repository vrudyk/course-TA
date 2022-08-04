package com.company.MainBank;

import com.company.Interfaces.Driveable;
import com.company.People.Driver;

public class BankCar extends Car {
    private int uniqueNumber;
    private boolean isPassenger;
    private boolean isArmored;
    private Driver driver;

    public BankCar() {

    }

    public BankCar(String color, String mark, int uniqueNumber, boolean isPassenger, boolean isArmored, Driver driver) {
        super(color, mark);
        this.uniqueNumber = uniqueNumber;
        this.isPassenger = isPassenger;
        this.isArmored = isArmored;
        this.driver = driver;
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public boolean isPassenger() {
        return isPassenger;
    }

    public void setPassenger(boolean passenger) {
        isPassenger = passenger;
    }

    public boolean isArmored() {
        return isArmored;
    }

    public void setArmored(boolean armored) {
        isArmored = armored;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    @Override
    public int hashCode() {
        int result = super.getColor().hashCode();
        result = 31 * result + super.getMark().hashCode();
        result = 31 * result + getUniqueNumber();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof BankCar)) return false;

        BankCar car = (BankCar) obj;

        if (getColor() != null && getColor().equals(car.getColor()) &&
                getMark() != null && getMark().equals(car.getMark()) &&
                getUniqueNumber() == car.getUniqueNumber() && isArmored() == car.isArmored() &&
                isPassenger() == car.isPassenger()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "BankCar - Color: " + getColor() + ", Mark: " + getMark() + ", Number: " + getUniqueNumber() +
                ", isPass: " + isPassenger() + ", isArm: " + isArmored();
    }

    @Override
    public void style() {
        System.out.println("Bank-style");
    }

    @Override
    public void drive(Driver driver) {
        System.out.println("I am driver and I can drive the car! My name is " + driver.getName());
    }

    @Override
    public void drift(Driver driver, int meters) {
        System.out.println("My record of drifting is " + meters + " meters. What about you, " + driver.getName() + "?");
    }
}
