package com.company.People;

public class Driver extends Human {
    private boolean hasDriverLicense;

    public Driver() {

    }

    public Driver(String name, String surname, boolean hasDriverLicense) {
        super(name, surname);
        this.hasDriverLicense = hasDriverLicense;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    public boolean isHasDriverLicense() {
        return hasDriverLicense;
    }

    public void setHasDriverLicense(boolean hasDriverLicense) {
        this.hasDriverLicense = hasDriverLicense;
    }

    @Override
    public int hashCode() {
        int result = super.getName().hashCode();
        result = 31 * result + super.getSurname().hashCode();
        result = 31 * result + 31 * 99;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Driver)) return false;

        Driver driver = (Driver) obj;

        if (getName() != null && getName().equals(driver.getName()) &&
                getSurname() != null && getSurname().equals(driver.getSurname()) &&
                isHasDriverLicense() == driver.isHasDriverLicense()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Driver - Name: " + getName() + ", Surname: " + getSurname() + ", HasDriverLicense: " +
                isHasDriverLicense();
    }

    @Override
    public void role() {
        System.out.println("This is a driver!");
    }

    @Override
    public void swim() {
        System.out.println("I am not able to swim :(");
    }
}
