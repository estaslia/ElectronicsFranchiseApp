/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsfranchiseapp.Q2;

/**
 *
 * @author Student
 */
// It implements the interface
public abstract class Consoles implements IConsoles {
    private String consoleType;
    private String storeName;
    private int totalSales;

   
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }

    // These are the methods ConsoleSales inherits
    @Override
    public String getConsoleType() { return consoleType; }

    @Override
    public String getStore() { return storeName; }

    @Override
    public int getTotalSales() { return totalSales; }
}