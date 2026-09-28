/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.electronicsfranchiseapp.Q1;

/**
 *
 * @author Student
 */
public interface ElectronicReport {
     public static void main(String[] args) {
        // 1. Declare and populate the single-dimensional array for cities
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};

        
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // Arrays for console names and city totals
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        int[] cityTotals = new int[3];

        // --- GENERATE FIRST PART OF REPORT ---
        System.out.println("--------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        // Formatting the header
        System.out.printf("%-18s %-8s %-8s %-8s%n", "", "PS5", "XBOX", "SWITCH");

        // Loop through each city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i]);
            // Loop through each console for the current city
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-8d", sales[i][j]);
                // Accumulate the total sales for this city
                cityTotals[i] += sales[i][j];
            }
            System.out.println(); // Move to next line after printing city's consoles
        }

        // --- GENERATE SECOND PART OF REPORT (TOTALS) ---
        System.out.println("--------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = 0;
        String topCity = "";

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s %d%n", cities[i], cityTotals[i]);

            // Check for the city with the most sales
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                topCity = cities[i];
            }
        }

        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
        System.out.println("--------------------------------------------------");
    }

}
