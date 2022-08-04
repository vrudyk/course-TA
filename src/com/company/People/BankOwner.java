package com.company.People;

public class BankOwner extends Human {

    private boolean isUkrainian;

    public BankOwner() {
    }

    public BankOwner(String name, String surname, boolean isUkrainian) {
        super(name, surname);
        this.isUkrainian = isUkrainian;
    }


    public boolean isUkrainian() {
        return isUkrainian;
    }

    public void setUkrainian(boolean ukrainian) {
        isUkrainian = ukrainian;
    }

    @Override
    public int hashCode() {
        int result = super.getName().hashCode();
        result = 31 * result + super.getSurname().hashCode();
        result = 31 * result + 31 * 29;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof BankOwner)) return false;

        BankOwner owner = (BankOwner) obj;

        if (getName() != null && getName().equals(owner.getName()) &&
                getSurname() != null && getSurname().equals(owner.getSurname()) &&
                isUkrainian() == owner.isUkrainian()) {
            return true;
        }

        return false;

    }

    @Override
    public String toString() {
        return "BankOwner - Name: " + getName() + ", Surname: " + getSurname() + ", Ukrainian: " + isUkrainian();
    }

    @Override
    public void role() {
        System.out.println("This is BankOwner");
    }

    @Override
    public void swim() {
        System.out.println("I am not able to swim but I am able to make a lot of money :)");
    }
}
