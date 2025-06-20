package com.pos.model;

public class Staff {
    private String staffName;
    private String staffId;
    private String idNumber; //national id card 
    private String role; //cashier, manager
    private String shift;
    private String phoneNumber;
    private double salary;
    private String address;
    private static int totalStaff = 0;

    //cons for new em
    public Staff(String staffName, String staffId, String role, String shift, String phoneNumber, double salary, String address, String idNumber) {
        this.staffName = staffName;
        this.staffId = staffId;
        this.role = role;
        this.shift = shift;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.address = address;
        this.idNumber = idNumber;
        totalStaff++;
    }

    public static int getTotalStaff() {
        return totalStaff;
    }

    public String getStaffName() {
        return staffName;
    }

    public String getStaffId() {
        return staffId;
    }

    public String getRole() {
        return role;
    }

    public String getShift() {
        return shift;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
