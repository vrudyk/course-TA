package com.company.Projects;

import java.util.Date;

public class Website extends ProjectForUsers {
    private String domen;
    private boolean isWorkingNow;

    public Website() {
    }

    public Website(Date dateOfCreation, int countOfUsers, int markOfUsers, String domen, boolean isWorkingNow) {
        super(dateOfCreation, countOfUsers, markOfUsers);
        this.domen = domen;
        this.isWorkingNow = isWorkingNow;
    }

    public String getDomen() {
        return domen;
    }

    public void setDomen(String domen) {
        this.domen = domen;
    }

    public boolean isWorkingNow() {
        return isWorkingNow;
    }

    public void setWorkingNow(boolean workingNow) {
        isWorkingNow = workingNow;
    }

    @Override
    public int hashCode() {
        int result = getDateOfCreation().hashCode();
        result = 31 * result + getCountOfUsers() + getMarkOfUsers();
        result = result * 31 + getDomen().hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (!(obj instanceof Website)) return false;

        Website website = (Website) obj;

        if (getDateOfCreation() != null && getDateOfCreation().equals(website.getDateOfCreation()) &&
                getCountOfUsers() == website.getCountOfUsers() && getMarkOfUsers() == website.getMarkOfUsers() &&
                getDomen() != null && getDomen().equals(website.getDomen()) &&
                isWorkingNow() == website.isWorkingNow()) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Website information: DateOfCreation: " + getDateOfCreation().toString() +
                ", CountOfUsers: " + getCountOfUsers() + ", MarkOfUsers: " + getMarkOfUsers() +
                ", Domen: " + getDomen() + ", isWorkingNow: " + isWorkingNow();
    }

    @Override
    public void launch() {
        System.out.println("Website is launching...");
    }
}
