package com.company.MainBank;

import com.company.Interfaces.Lockable;
import com.company.Interfaces.Transportable;

public class MainSafe implements Transportable, Lockable {
    private boolean isGoldInside;
    private int currentMoneySum;
    private int safeLength;
    private int safeWidth;


    public MainSafe() {
    }

    public MainSafe(boolean isGoldInside, int currentMoneySum, int safeLength, int safeWidth) {
        this.isGoldInside = isGoldInside;
        this.currentMoneySum = currentMoneySum;
        this.safeLength = safeLength;
        this.safeWidth = safeWidth;
    }

    public boolean isGoldInside() {
        return isGoldInside;
    }

    public void setGoldInside(boolean goldInside) {
        isGoldInside = goldInside;
    }

    public int getCurrentMoneySum() {
        return currentMoneySum;
    }

    public void setCurrentMoneySum(int currentMoneySum) {
        this.currentMoneySum = currentMoneySum;
    }

    public int getSafeLength() {
        return safeLength;
    }

    public void setSafeLength(int safeLength) {
        this.safeLength = safeLength;
    }

    public int getSafeWidth() {
        return safeWidth;
    }

    public void setSafeWidth(int safeWidth) {
        this.safeWidth = safeWidth;
    }

    @Override
    public int hashCode() {
        int result = getCurrentMoneySum();
        result = result * 31 + getSafeWidth();
        result = 31 * result + getSafeLength();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof MainSafe)) return false;

        MainSafe safe = (MainSafe) obj;

        if (getSafeLength() == safe.getSafeLength()
                && getSafeWidth() == safe.getSafeWidth()
                && getCurrentMoneySum() == safe.getCurrentMoneySum()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Main Safe - Current Money: " + getCurrentMoneySum() + ", Width: " + getSafeWidth() +
                ", Length: " + getSafeLength();
    }

    @Override
    public void move() {
        System.out.println("Now I am on my way to Toronto");
    }

    @Override
    public boolean lock(MainSafe mainSafe) {
        if (mainSafe.isGoldInside()) {
            System.out.println("Sorry, I need to be closed, because I want to protect my gold inside! *Closing*");
            return true;
        } else {
            return false;
        }
    }
}
