/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electronicsfranchiseapp.Q2;

/**
 *
 * @author Student
 */
public class RunApplication {
    public static void main(String[] args) {
        // Instantiate the ConsoleSales class with sample data
        ConsoleSales sale1 = new ConsoleSales("PS5", "Game Central", 15000);
        ConsoleSales sale2 = new ConsoleSales("XBOX", "Tech Hub", 12000);

        // Call the printReport method
        sale1.printReport();
        sale2.printReport();
    }
}
