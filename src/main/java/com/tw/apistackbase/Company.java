package com.tw.apistackbase;

import java.util.ArrayList;
import java.util.List;

public class Company {

     private String companyId;
     private String companyName;
     private String employeesNumber;
     private List<Employee> employees=new ArrayList<Employee>();

     public Company()
     {

     }
    public Company(String companyName, String employeesNumber, List<Employee> employees) {
        this.companyName = companyName;
        this.employeesNumber = employeesNumber;
        this.employees = employees;
    }


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(String employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
