package com.pos.model.collections;

import com.pos.model.Staff;
import java.util.*;

public class StaffCollection {
    private List<Staff> staffMembers;
    
    public StaffCollection() {
        this.staffMembers = new ArrayList<>();
    }
    
    public void addStaff(Staff staff) {
        staffMembers.add(staff);
    }
    
    public Staff findStaffById(String staffId) {
        for (Staff staff : staffMembers) {
            if (staff.getStaffId().equals(staffId)) {
                return staff;
            }
        }
        return null;
    }
    
    public Staff findStaffByPhone(String phoneNumber) {
        for (Staff staff : staffMembers) {
            if (staff.getPhoneNumber().equals(phoneNumber)) {
                return staff;
            }
        }
        return null;
    }
    
    public List<Staff> getStaffByRole(String role) {
        List<Staff> result = new ArrayList<>();
        for (Staff staff : staffMembers) {
            if (staff.getRole().equalsIgnoreCase(role)) {
                result.add(staff);
            }
        }
        return result;
    }
    
    public List<Staff> getStaffByShift(String shift) {
        List<Staff> result = new ArrayList<>();
        for (Staff staff : staffMembers) {
            if (staff.getShift().equalsIgnoreCase(shift)) {
                result.add(staff);
            }
        }
        return result;
    }
    
    public List<Staff> getAllStaff() {
        return new ArrayList<>(staffMembers);
    }
    
    public boolean removeStaff(String staffId) {
        return staffMembers.removeIf(staff -> staff.getStaffId().equals(staffId));
    }
    
    public double getTotalSalaryExpense() {
        double total = 0;
        for (Staff staff : staffMembers) {
            total += staff.getSalary();
        }
        return total;
    }
}

