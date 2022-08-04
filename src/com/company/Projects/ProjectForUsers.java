package com.company.Projects;

import java.util.Date;

public abstract class ProjectForUsers {
    private Date dateOfCreation;
    private int countOfUsers;
    private int markOfUsers;

    public ProjectForUsers() {

    }

    public ProjectForUsers(Date dateOfCreation, int countOfUsers, int markOfUsers) {
        this.dateOfCreation = dateOfCreation;
        this.countOfUsers = countOfUsers;
        this.markOfUsers = markOfUsers;
    }

    public Date getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public int getCountOfUsers() {
        return countOfUsers;
    }

    public void setCountOfUsers(int countOfUsers) {
        this.countOfUsers = countOfUsers;
    }

    public int getMarkOfUsers() {
        return markOfUsers;
    }

    public void setMarkOfUsers(int markOfUsers) {
        this.markOfUsers = markOfUsers;
    }

    public abstract void launch();

    public void closing() {
        System.out.println("Goodbye!");
    }

}
