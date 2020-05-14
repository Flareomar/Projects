/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine;

import java.util.Scanner;

/**
 *
 * @author Omar
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        // TODO code application logic here
        
        double DrinkCost = 1.25;
        double CandyCost = 1.00;
        double ChipsCost = 1.50;
        

        String [][] Machine = {{"       Vending Machine"},
            {"|Pepsi |","|Coke|","|SevenUp |","|Gingerale|"},
            {"|Cookie|","|M&Ms|","|Snickers|","|Wonderbar|"},
            {"|Crunch|","|Lays|","|Cheetos |","| Gatorade|"},
            {"|Reeses|","|Twix|","|Doritos |","|Starburst|"},
            {"|Famta |","|Oreo|","|DrPepper|","|Skittles |"},
            {"             [  ]"}};
        PrintMachine(Machine);
        
        
        System.out.println("Please enter then name of the Item you would like ");
        String answer1 = scan.nextLine();
     if (answer1.equals("pepsi") || answer1.equals("Pepsi")) {
        System.out.println("The item you chosen is " + Machine[1][0] + " Are you ready to proceed?");
        System.out.println("The Price is " + DrinkCost + "$");
        String ChoicePepsi = scan.nextLine();
       if (ChoicePepsi.equals("Yes")) {
              System.out.println("Thank you, your item is now in the dispenser");
         Machine[6][0] = "\t       [Pepsi]";
         PrintMachine(Machine);
       }
       }
         else if (answer1.equals("coke") || answer1.equals("Coke")) {
        System.out.println("The item you chosen is " + Machine[1][1] + " Are you ready to proceed?");
         System.out.println("The Price is " + DrinkCost + "$");
         String ChoiceCoke = scan.nextLine();
       if (ChoiceCoke.equals("Yes") || ChoiceCoke.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Coke]";
         PrintMachine(Machine);
       }
    }
     else if (answer1.equals("SevenUp") || answer1.equals("7up")) {
        System.out.println("The item you chosen is " + Machine[1][2] + " Are you ready to proceed?");
         System.out.println("The Price is " + DrinkCost + "$");
         String Choice7up = scan.nextLine();
       if (Choice7up.equals("Yes") || Choice7up.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [SevenUp]";
         PrintMachine(Machine);
       }
     }
       else if (answer1.equals("Gingerale")) {
        System.out.println("The item you chosen is " + Machine[1][3] + " Are you ready to proceed?");
         System.out.println("The Price is " + DrinkCost + "$");
         String ChoiceGingerale = scan.nextLine();
       if (ChoiceGingerale.equals("Yes") || ChoiceGingerale.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Gingerale]";
         PrintMachine(Machine);
       }
       }
       else if (answer1.equals("Cookie")) {
        System.out.println("The item you chosen is " + Machine[2][0] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceCookie = scan.nextLine();
       if (ChoiceCookie.equals("Yes") || ChoiceCookie.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Cookie]";
         PrintMachine(Machine);
       }
       }
       else if (answer1.equals("M&Ms")) {
        System.out.println("The item you chosen is " + Machine[2][1] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceMMS = scan.nextLine();
       if (ChoiceMMS.equals("Yes") || ChoiceMMS.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [M&Ms]";
         PrintMachine(Machine);
       }
               }
       else if (answer1.equals("Snickers")) {
        System.out.println("The item you chosen is " + Machine[2][2] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceSnickers = scan.nextLine();
       if (ChoiceSnickers.equals("Yes") || ChoiceSnickers.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Snickers]";
         PrintMachine(Machine);
       }
               }
       else if (answer1.equals("Wonderbar")) {
        System.out.println("The item you chosen is " + Machine[2][3] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceWonderbar = scan.nextLine();
       if (ChoiceWonderbar.equals("Yes") || ChoiceWonderbar.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Wonderbar]";
         PrintMachine(Machine);
       }
       }
       else if (answer1.equals("Crunch")) {
        System.out.println("The item you chosen is " + Machine[3][0] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceCrunch = scan.nextLine();
       if (ChoiceCrunch.equals("Yes") || ChoiceCrunch.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Crunch]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Lays")) {
        System.out.println("The item you chosen is " + Machine[3][1] + " Are you ready to proceed?");
         System.out.println("The Price is " + ChipsCost + "$");
         String ChoiceLays = scan.nextLine();
       if (ChoiceLays.equals("Yes") || ChoiceLays.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Lays]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Cheetos")) {
        System.out.println("The item you chosen is " + Machine[3][2] + " Are you ready to proceed?");
         System.out.println("The Price is " + ChipsCost + "$");
         String ChoiceCheetos = scan.nextLine();
       if (ChoiceCheetos.equals("Yes") || ChoiceCheetos.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Cheetos]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Gatorade")) {
        System.out.println("The item you chosen is " + Machine[3][3] + " Are you ready to proceed?");
         System.out.println("The Price is " + DrinkCost + "$");
         String ChoiceGatorade = scan.nextLine();
       if (ChoiceGatorade.equals("Yes") || ChoiceGatorade.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Gatorade]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Reeses")) {
        System.out.println("The item you chosen is " + Machine[4][0] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceReeses = scan.nextLine();
       if (ChoiceReeses.equals("Yes") || ChoiceReeses.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Reeses]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Twix")) {
        System.out.println("The item you chosen is " + Machine[4][1] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceTwix = scan.nextLine();
       if (ChoiceTwix.equals("Yes") || ChoiceTwix.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Twix]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Doritos")) {
        System.out.println("The item you chosen is " + Machine[4][2] + " Are you ready to proceed?");
         System.out.println("The Price is " + ChipsCost + "$");
         String ChoiceDoritos = scan.nextLine();
       if (ChoiceDoritos.equals("Yes") || ChoiceDoritos.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Doritos";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Starbursts")) {
        System.out.println("The item you chosen is " + Machine[4][3] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceStarbursts = scan.nextLine();
       if (ChoiceStarbursts.equals("Yes") || ChoiceStarbursts.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Starbursts]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Fanta")) {
        System.out.println("The item you chosen is " + Machine[5][0] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceFanta = scan.nextLine();
       if (ChoiceFanta.equals("Yes") || ChoiceFanta.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Fanta]";
         PrintMachine(Machine);     
       }
             }
       else if (answer1.equals("Oreo")) {
        System.out.println("The item you chosen is " + Machine[5][1] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceOreo = scan.nextLine();
       if (ChoiceOreo.equals("Yes") || ChoiceOreo.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Oreo]";
         PrintMachine(Machine);   
          }
             }
       else if (answer1.equals("DrPepper")) {
        System.out.println("The item you chosen is " + Machine[5][2] + " Are you ready to proceed?");
         System.out.println("The Price is " + DrinkCost + "$");
         String ChoiceDrPepper = scan.nextLine();
       if (ChoiceDrPepper.equals("Yes") || ChoiceDrPepper.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [DrPepper]";
         PrintMachine(Machine);  
          }
             }
       else if (answer1.equals("Skittles")) {
        System.out.println("The item you chosen is " + Machine[5][3] + " Are you ready to proceed?");
         System.out.println("The Price is " + CandyCost + "$");
         String ChoiceSkittles = scan.nextLine();
       if (ChoiceSkittles.equals("Yes") || ChoiceSkittles.equals("yes")) {
              System.out.println("Thank you, your item is now in the dispenser!");
              Machine[6][0] = "\t       [Skittles]";
         PrintMachine(Machine);  
       }
       }
     }
    public static void PrintMachine(String[][] Machine) {
            for (String[] row: Machine) {
                for (String c: row) {
                    System.out.print(c);
                }
                System.out.println();
            }  
        }   
}
  


