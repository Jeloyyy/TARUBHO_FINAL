//Tarubho BSIT - 101I
//FinalsCaseStudy_TARUBHO

import java.util.Scanner;
import java.text.DecimalFormat;
public class Finalterm_CaseStudy_TARUBHO 
{
	public static void shop ()
    	{
    	System.out.println("__________________________________________________________________\n");
        System.out.println("                Cyber Enigma - Computer Shop");
        System.out.println("        Marikina City | Quezon City | Antipolo City");
        System.out.println("                    FB @CyberEnigma.ict");
        System.out.print("\n");
        
        }
	public static void menu ()
    	{
        System.out.println("__________________________________________________________________\n");
        System.out.println("                    PRODUCT INFORMATION\n");
        System.out.println("          Code         Description     Unit Price\n\n"+
        "          CE1          Monitor X       $   999.00\n"+
        "          CE2          Key Board       $   350.50\n"+
        "          CE3          Mouse pro       $   200.75\n"+
        "          CE4          FlashDrive      $   500.00\n"+
        "          CE5          Hard Disk       $   500.00");
    	}
    public static void main(String[] args) 
    	{
        Scanner scsc = new Scanner(System.in);
        DecimalFormat oo = new DecimalFormat("0.00");
        DecimalFormat no = new DecimalFormat("0");
        
        int counter = 0;
        String[] name = {"Monitor X ", "Key Board ", "Mouse pro ", "FlashDrive", "Hard Disk " };
        String[] code = {"CE1", "CE2", "CE3", "CE4", "CE5"};
        double[] price = {999.00, 350.50, 200.75, 500.00, 500.00 };
        String choice = "";
        int quantity = 0;
        int array = 0;
        String newcustomer = "";
        String orders = "";
        double amount = 0;
        double total = 0;

        for (int i = 1; i <= 2; i++)
        {  
        shop(); 
        menu();
        
        System.out.println("__________________________________________________________________\n");
   		System.out.print("Purchase Item (yes/no): ");
        choice = scsc.nextLine();
        System.out.println("__________________________________________________________________\n");
        
        if (choice.equalsIgnoreCase("yes")) {
            shop();
            System.out.println("__________________________________________________________________\n");
			System.out.println("                     PURCHASE ORDER(s)\n");
			
            while (counter <= 5) {
            	System.out.print("Enter Product Code:  	  ");
            String Code = scsc.nextLine();

            	System.out.print("Enter Quantity:           ");

            String enterquantity = scsc.nextLine();
            quantity = Integer.valueOf(enterquantity);
            
            if (Code.equalsIgnoreCase("CE1")) {
                array = 0;
                amount = price[array] * quantity;
            	System.out.print("Amount:                   $ " + amount);
                orders += code[array] + "\t" + name[array]+ "\t\t" + price[array] + "\t\t" + quantity + "\t" + amount + "\n";
                total += amount;
            } 

            else if (Code.equalsIgnoreCase("CE2")) {
                array = 1;
                amount = price[array] * quantity;
                System.out.print("Amount:                   $ " + amount);
                orders += code[array] + "\t" + name[array]+ "\t\t" + price[array] + "\t\t" + quantity + "\t" + amount + "\n";
                total += amount;
            } 

            else if (Code.equalsIgnoreCase("CE3")) {
                array = 2;
                amount = price[array] * quantity;
                System.out.print("Amount:                   $ " + amount);
                orders += code[array] + "\t" + name[array]+ "\t" + price[array] + "\t\t" + quantity + "\t" + amount + "\n";
                total += amount;            
            } 

            else if (Code.equalsIgnoreCase("CE4")) {
                array = 3;
                amount = price[array] * quantity;
                System.out.print("Amount:                   $ " + amount);
                orders += code[array] + "\t" + name[array]+ "\t" + price[array] + "\t\t" + quantity + "\t" + amount + "\n";
                total += amount;
            } 

            else if (Code.equalsIgnoreCase("CE5")) {
                array = 4;
                amount = price[array] * quantity;
                System.out.print("Amount:                   $ " + amount);
                orders += code[array] + "\t" + name[array]+ "\t" + price[array] + "\t\t" + quantity + "\t" + amount + "\n";
                total += amount;
            }


                System.out.print("\nAdd Item (yes/no):        ");
                    String choices = scsc.nextLine();
                    System.out.print(System.lineSeparator());
                    
					if (choices.equalsIgnoreCase("yes"))
						{
						counter++;
						break;
						}
					
                    else if(choices.equalsIgnoreCase("no")) 
                    	{
                    	counter = 6;
                        break;
                        }
                    else{
                    	System.out.println("Invalid!");
						System.out.println("Thanks for visiting Cyber Enigma CS :)");
						break;
                    	}
                    }
                if (counter == 5) {
                    System.out.println("Maximum Order Reached");
                }
			shop();
            
            System.out.println("__________________________________________________________________\n");
        	System.out.println("                     ORDER INFORMATION");
        	System.out.print(System.lineSeparator());
            System.out.println("   Code    Description    UnitPrice    Quantity    Amount ");
            System.out.println("_______________________________________________________________");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal: $ " + (oo.format(total)));
            System.out.println("_______________________________________________________________");
            }
            
        else if(choice.equalsIgnoreCase("no"))
			{
			System.out.println("\nThanks for visiting Cyber Enigma CS");
			System.out.println("Come Again :)");
			}
		else
			{
			System.out.println("Invalid!");
			System.out.println("Thanks for visiting Cyber Enigma CS :)");
			}
			
			System.out.print("\nNew Customer? (yes/no): ");
			String newc = scsc.next();
        
        switch(newc)
		{
		case "yes" : i = 1 ; break;
		case "no"  : i = 2 ; break;
		default: i = 2 ;
		System.out.println("\nInvalid!\nThanks for visiting Cyber Enigma CS :)");
		break;
		}
    	}
    	}
}
