/*Create a package named ‘mypack.converter’ with the following three java classes. Implement
currency converter (Dollar to INR, EURO to INR, Yen to INR and vice versa as methods) in
CurrencyConverter class, distance converter (meter to KM, miles to KM and vice versa) in
DistanceConverter class, time converter (hours to minutes, minute to seconds and vice versa) in
TimeConverter class. Write the main program to access these classes outside the package. */

import java.util.*;
import mypackconverter.*;

class TestPackage{
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        int ch1,ch2,ch3,ch4;
        System.out.println("CONVERSION OPTIONS\n1: Currency Conversion\n2: Distance Conversion\n3: Time Conversion");
        System.out.print("Enter your choice: ");
        ch1 = sc.nextInt();
        do{
            switch(ch1){
                case 1: System.out.print("Enter the amount to be converted: ");
                        float amount = sc.nextFloat();
                        System.out.println("CURRENCY CONVERSION OPTIONS\n1: Dollar to INR\t2: EURO to INR\n3: Yen to INR\t4: INR to Dollar\n5: INR to EURO\t6: INR to Yen");
                        System.out.print("Enter your choice: ");
                        ch2 = sc.nextInt();
                        switch(ch2){
                            case 1: System.out.printf("$%.2f = Rs%.2f\n", amount,CurrencyConv.dollarToINR(amount));
                                    break;
                            case 2: System.out.printf("€%.2f = Rs%.2f\n", amount,CurrencyConv.euroToINR(amount));
                                    break;
                            case 3: System.out.printf("¥%.2f = Rs%.2f\n", amount,CurrencyConv.yenToINR(amount));
                                    break;
                            case 4: System.out.printf("Rs%.2f = $%.2f\n", amount,CurrencyConv.inrToDollar(amount));
                                    break;
                            case 5: System.out.printf("Rs%.2f = €%.2f\n", amount,CurrencyConv.inrToEuro(amount));
                                    break;
                            case 6: System.out.printf("Rs%.2f = ¥%.2f\n", amount,CurrencyConv.inrToYen(amount));
                                    break;
                        }
                        break;
                
                case 2: System.out.print("Enter the distance to be converted: ");
                        float distance = sc.nextFloat();
                        System.out.println("DISTANCE CONVERSION OPTIONS\n1: Meters to KiloMeters\t2: Miles to KiloMeters\n3: KiloMeters to Meters\t4: KiloMeters to Miles");
                        System.out.print("Enyer your choice: ");
                        ch3 = sc.nextInt();
                        switch(ch3){
                            case 1: System.out.printf("%.2f meters = %.2f km\n", distance, DistanceConv.metersToKM(distance));
                                    break;
                            case 2: System.out.printf("%.2f miles = %.2f km\n", distance, DistanceConv.milesToKM(distance));
                                    break;
                            case 3: System.out.printf("%.2f km = %.2f meters\n", distance, DistanceConv.kmToMeters(distance));
                                    break;
                            case 4: System.out.printf("%.2f km = %.2f miles\n", distance, DistanceConv.kmToMiles(distance));
                                    break;
                        }
                        break;
                
                case 3: System.out.println("TIME CONVERSION OPTIONS\n1: Hours to Minutes\t2: Minutes to Seconds\n3: Minutes to Hours\t4: Seconds to Minutes");
                        System.out.print("Enter your choice: ");
                        ch4 = sc.nextInt();
                        switch(ch4){
                            case 1: System.out.print("Enetr the time in hours: ");
                                    float hours = sc.nextFloat();
                                    System.out.printf("%.2f hours = %.2f minutes\n", hours,TimeConv.hoursToMinutes(hours));
                                    break;
                            case 2: System.out.print("Enetr the time in minutes: ");
                                    float minutes = sc.nextFloat();
                                    System.out.printf("%.2f minutes = %.2f seconds\n", minutes,TimeConv.minutesToSeconds(minutes));
                                    break;
                            case 3: System.out.print("Enetr the time in minutes: ");
                                    float mintoh = sc.nextFloat();
                                    System.out.printf("%.2f minutes = %.2f hours\n", mintoh,TimeConv.hoursToMinutes(mintoh));
                                    break;
                            case 4: System.out.print("Enetr the time in hours: ");
                                    float seconds = sc.nextFloat();
                                    System.out.printf("%.2f seconds = %.2f minutes\n", seconds,TimeConv.secondsToMinutes(seconds));
                                    break;
                        }
                        break;
            }
            System.out.println("CONVERSION OPTIONS\n1: Currency Conversion\n2: Distance Conversion\n3: Time Conversion");
            System.out.print("Enter your choice(To stop enter -1): ");
            ch1 = sc.nextInt();
        }while(ch1 != -1);
    }
}