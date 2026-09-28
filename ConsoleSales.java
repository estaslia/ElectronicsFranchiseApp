/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsfranchiseapp.Q2;

/**
 *
 * @author Student
 */
public class ConsoleSales extends Consoles {

  
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method to print the formatted report
    public void printReport() {
        System.out.println("=====================================");
        System.out.println("       CONSOLE SALES REPORT          ");
        System.out.println("=====================================");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : R" + getTotalSales()); // Assuming currency, adjust if not needed
        System.out.println("=====================================");
    }
}