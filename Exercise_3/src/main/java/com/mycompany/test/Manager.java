/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test;

import java.util.Calendar;
import java.util.GregorianCalendar;


class Manager extends Employee implements Sortable {
    public Manager (String n, double s, int d, int m, int y){ 
        super(n, s, d, m, y);
        secretaryName = "";
    }
    
    @Override
    public void raiseSalary(double byPercent){ 
        // add 1/2% bonus for every year of service
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    
    public String getSecretaryName(){ 
        return secretaryName;
    }
    
    private String secretaryName;

    @Override
    public int compare(Sortable b) {
        Manager mb = (Manager) b;
        if (super.compare(b) != 0) {
            return super.compare(b);
        } else {
            // Compare managers based on additional criteria if needed
            // Example: compare by secretaryName
            // return secretaryName.compareTo(mb.secretaryName);
            return 0;
        }
    }
}

