/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RiskApplication;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class RiskTool {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        heat h = new heat();
        noise n = new noise();
        vibration v = new vibration();

        Scanner myKb = new Scanner(System.in);
        int response;

        try {

            do {

                System.out.println("What risk would you like to check?");

                System.out.println("Risk list");
                System.out.println("Code| Risk name");
                System.out.println("1- Heat");
                System.out.println("2- Noise");
                System.out.println("3- Vibration");
                System.out.println("4- Leave risk list \n ");

                response = myKb.nextInt();

                if (response != 4) {

                    switch (response) {
                        case 1:
                            System.out.println("Name: " + h.getName());
                            System.out.println("Exposure Limit: " + h.getExposureLimit());
                            System.out.println("Injuries if exposure above the limit: " + h.getInjuries());
                            System.out.println("How to control: " + h.getControl());
                            break;
                        case 2:
                            System.out.println("Name: " + n.getName());
                            System.out.println("Exposure Limit: " + n.getExposureLimit());
                            System.out.println("Injuries if exposure above the limit: " + n.getInjuries());
                            System.out.println("How to control: " + n.getControl());
                            break;
                        case 3:
                            System.out.println("Name: " + v.getName());
                            System.out.println("Exposure Limit: " + v.getExposureLimit());
                            System.out.println("Injuries if exposure above the limit: " + v.getInjuries());
                            System.out.println("How to control: " + v.getControl());
                            break;

                    }
                }

            } while (response != 4);
            System.out.println("Thank you!! Stay safe.");

        } catch (Exception e) {
            System.out.println("Only numbers allowed!!!");

        }
    }
}

