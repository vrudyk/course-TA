package com.company.Tasks;

public class Currency {
    private String name;
    private String country;
    private int banknoteWidth;
    private int banknoteLength;

    public Currency() {
    }

    public Currency(String name, String country, int banknoteWidth, int banknoteLength) {
        this.name = name;
        this.country = country;
        this.banknoteWidth = banknoteWidth;
        this.banknoteLength = banknoteLength;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getBanknoteWidth() {
        return banknoteWidth;
    }

    public int getBanknoteLength() {
        return banknoteLength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBanknoteWidth(int banknoteWidth) {
        this.banknoteWidth = banknoteWidth;
    }

    public void setBanknoteLength(int banknoteLength) {
        this.banknoteLength = banknoteLength;
    }

    @Override
    public int hashCode() {
        int result = getCountry().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getBanknoteLength() + getBanknoteWidth();
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Currency)) return false;

        Currency currency = (Currency) obj;

        if (getName() != null && getName().equals(currency.getName()) &&
                getCountry() != null && getCountry().equals(currency.getCountry()) &&
                getBanknoteWidth() == currency.getBanknoteWidth() &&
                getBanknoteLength() == currency.getBanknoteLength()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Currency - Name: " + getName() + ", Country: " + getCountry() + ", Width: " + getBanknoteWidth() +
                ", Length: " + getBanknoteLength();
    }
}
