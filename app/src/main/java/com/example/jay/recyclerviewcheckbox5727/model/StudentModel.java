package com.example.jay.recyclerviewcheckbox5727.model;

/**
 * Created by Jay on 24-02-2018.
 */

public class StudentModel {


    //@SerializedName("UserLoginID")
    //@Expose
    private String UserLoginID;

    //@SerializedName("UserName")
    //@Expose
    private String UserName;

    //@SerializedName("Department")
    //@Expose
    private String Department;

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getUserLoginID() {
        return UserLoginID;
    }

    public void setUserLoginID(String userLoginID) {
        UserLoginID = userLoginID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }


    //This private field to maintain to every row's state...!
    private boolean isSelected;

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

}