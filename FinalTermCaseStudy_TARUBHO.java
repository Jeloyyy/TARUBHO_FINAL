
//TARUBHO BSIT 101I
//FinaltermCaseStudy_TARUBHO.java

//======================= Import Package ========================================
import java.util.Scanner;
import java.text.DecimalFormat;
//======================= End of Package ========================================

//======================= Class =================================================
public class FinalTermCaseStudy_TARUBHO{	
//===================================== Header ==================================
	public static void shop ()
    	{
    	System.out.println("__________________________________________________________________\n");
        System.out.println("                Cyber Enigma - Computer Shop");
        System.out.println("        Marikina City | Quezon City | Antipolo City");
        System.out.println("                    FB @CyberEnigma.ict");
        System.out.print("\n");
        
        }
//===================================== End of Header ===========================

//===================================== Menu ====================================
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
//===================================== End of Menu =============================

//===================================== Main program ============================
	public static void main (String[] args)
	{
        Scanner scsc = new Scanner(System.in);
        DecimalFormat oo = new DecimalFormat("0.00");
        DecimalFormat no = new DecimalFormat("0");
        
    for(int i = 1; i <= 2; i++)
    	{
    
	shop(); //Displaying Header
	menu(); //Displaying Menu
	System.out.println("__________________________________________________________________\n");
   		System.out.print("Purchase Item (yes/no): ");
        String choice = scsc.next();
        System.out.println("\n");
		if (choice.equalsIgnoreCase("yes"))
			{
				
	shop(); //Displaying Header
			System.out.println("__________________________________________________________________\n");
			System.out.println("                     PURCHASE ORDER(s)\n");
	
			//Declaring Variables
			int trans = 1;
			double price = 0;
			double quantt = 1;
			double total = 0;
			String add = "";
			String dscrip = "";
			String prcode = "";
			String transaction = "";
			double amount1 = 0,amount2 = 0,amount3 = 0,amount4 = 0,amount5 = 0;
			String trans1 = "",trans2 = "",trans3 = "",trans4 = "",trans5 = "";
	
	//While Loop for Transaction	
		here:while (trans <= 5)
				{
				
				//======================== Transaction ========================
				switch(trans)
					{
					//==================== case 1 =============================	
					case 1:
					System.out.print("Enter Product Code:\t\t\t\t");
					prcode = scsc.next();
				
						switch(prcode)
							{
							case "CE1": dscrip = "Monitor X "; price = 999.00; break;
							case "CE2": dscrip = "Key Board "; price = 350.50; break;
							case "CE3": dscrip = "Mouse pro "; price = 200.75; break;
							case "CE4": dscrip = "FlashDrive"; price = 500.00; break;
							case "CE5": dscrip = "Hard Disk "; price = 500.00; break;
							default: System.out.println("Invalid!"); continue;
							}  
								
					System.out.print("Enter Quantity:    \t\t\t\t");
					quantt = scsc.nextDouble();
						
					amount1 = price * quantt;
					trans1 = "\n   " + prcode + "     " + 
					dscrip + "      $ " + 
					(oo.format(price)) + "     " + 
					(no.format(quantt)) + "\t\t   $ " + 
					(oo.format(amount1));
					
					System.out.println("Amount:            \t\t\t\t$ " + (oo.format(amount1)));
					System.out.print("Add more product (yes/no):      ");
					add = scsc.next();
					System.out.print("\n");
					
						if (add.equalsIgnoreCase("yes"))trans++;
						else if(add.equalsIgnoreCase("no"))trans = 6;
						else
							{
							System.out.println("Invalid!");
							}continue here;
					//==================== End of case 1 ======================	
					
					//==================== case 2 =============================	
					case 2:
					System.out.print("Enter Product Code:\t\t\t\t");
					prcode = scsc.next();
				
						switch(prcode)
							{
							case "CE1": dscrip = "Monitor X "; price = 999.00; break;
							case "CE2": dscrip = "Key Board "; price = 350.50; break;
							case "CE3": dscrip = "Mouse pro "; price = 200.75; break;
							case "CE4": dscrip = "FlashDrive"; price = 500.00; break;
							case "CE5": dscrip = "Hard Disk "; price = 500.00; break;
							default: System.out.println("Invalid!"); continue;
							}  
								
					System.out.print("Enter Quantity:    \t\t\t\t");
					quantt = scsc.nextDouble();
						
					amount2 = price * quantt;
					trans2 = "\n   " + prcode + "     " + 
					dscrip + "      $ " + 
					(oo.format(price)) + "     " + 
					(no.format(quantt)) + "\t\t   $ " + 
					(oo.format(amount2));
					
					System.out.println("Amount:            \t\t\t\t$ " + (oo.format(amount2)));
					System.out.print("Add more product (yes/no):      ");
					add = scsc.next();
					System.out.print("\n");
					
						if (add.equalsIgnoreCase("yes"))trans++;
						else if(add.equalsIgnoreCase("no"))trans = 6;
						else
							{
							System.out.println("Invalid!");
							}continue here;
					//==================== End of case 2 ======================
					
					//==================== case 3 =============================				
					case 3:
					System.out.print("Enter Product Code:\t\t\t\t");
					prcode = scsc.next();
				
						switch(prcode)
							{
							case "CE1": dscrip = "Monitor X "; price = 999.00; break;
							case "CE2": dscrip = "Key Board "; price = 350.50; break;
							case "CE3": dscrip = "Mouse pro "; price = 200.75; break;
							case "CE4": dscrip = "FlashDrive"; price = 500.00; break;
							case "CE5": dscrip = "Hard Disk "; price = 500.00; break;
							default: System.out.println("Invalid!"); continue;
							}  
								
					System.out.print("Enter Quantity:    \t\t\t\t");
					quantt = scsc.nextDouble();
						
					amount3 = price * quantt;
					trans3 = "\n   " + prcode + "     " + 
					dscrip + "      $ " + 
					(oo.format(price)) + "     " + 
					(no.format(quantt)) + "\t\t   $ " + 
					(oo.format(amount3));
					
					System.out.println("Amount:            \t\t\t\t$ " + (oo.format(amount3)));
					System.out.print("Add more product (yes/no):      ");
					add = scsc.next();
					System.out.print("\n");
					
						if (add.equalsIgnoreCase("yes"))trans++;
						else if(add.equalsIgnoreCase("no"))trans = 6;
						else
							{
							System.out.println("Invalid!");
							}continue here;
					//==================== End of case 3 ======================	
					
					//==================== case 4 =============================	
					case 4:
					System.out.print("Enter Product Code:\t\t\t\t");
					prcode = scsc.next();
				
						switch(prcode)
							{
							case "CE1": dscrip = "Monitor X "; price = 999.00; break;
							case "CE2": dscrip = "Key Board "; price = 350.50; break;
							case "CE3": dscrip = "Mouse pro "; price = 200.75; break;
							case "CE4": dscrip = "FlashDrive"; price = 500.00; break;
							case "CE5": dscrip = "Hard Disk "; price = 500.00; break;
							default: System.out.println("Invalid!"); continue;
							}  
								
					System.out.print("Enter Quantity:    \t\t\t\t");
					quantt = scsc.nextDouble();
						
					amount4 = price * quantt;
					trans4 = "\n   " + prcode + "     " + 
					dscrip + "      $ " + 
					(oo.format(price)) + "     " + 
					(no.format(quantt)) + "\t\t   $ " + 
					(oo.format(amount4));
					
					System.out.println("Amount:            \t\t\t\t$ " + (oo.format(amount4)));
					System.out.print("Add more product (yes/no):      ");
					add = scsc.next();
					System.out.print("\n");
					
						if (add.equalsIgnoreCase("yes"))trans++;
						else if(add.equalsIgnoreCase("no"))trans = 6;
						else
							{
							System.out.println("Invalid!");
							}continue here;
					//==================== End of case 4 ======================	
					
					//==================== case 5 =============================	
					case 5:
					System.out.print("Enter Product Code:\t\t\t\t");
					prcode = scsc.next();
				
						switch(prcode)
							{
							case "CE1": dscrip = "Monitor X "; price = 999.00; break;
							case "CE2": dscrip = "Key Board "; price = 350.50; break;
							case "CE3": dscrip = "Mouse pro "; price = 200.75; break;
							case "CE4": dscrip = "FlashDrive"; price = 500.00; break;
							case "CE5": dscrip = "Hard Disk "; price = 500.00; break;
							default: System.out.println("Invalid!"); continue;
							}
								
					System.out.print("Enter Quantity:    \t\t\t\t");
					quantt = scsc.nextDouble();
						
					amount5 = price * quantt;
					trans5 = "\n   " + prcode + "     " + 
					dscrip + "      $ " + 
					(oo.format(price)) + "     " + 
					(no.format(quantt)) + "\t\t   $ " + 
					(oo.format(amount5));
					
					System.out.println("Amount:            \t\t\t\t$ " + (oo.format(amount5)));
					System.out.print("\n");
					System.out.print("Maximum number of order reached");
					System.out.print("\nPlease Enter Number One(1) to proceed...     ");
					add = scsc.next();
					System.out.print("\n");
					
						if (add.equalsIgnoreCase("one"))trans = 6;
						else if(add.equalsIgnoreCase("1"))trans = 6;
						else
							{
							System.out.println("Invalid!");
							}continue here;
					//==================== End of case 5 ======================	
				}
				//======================== End of Transaction =================
		  	}
		  	//======================== End of While loop ======================	
		  	
			//============================ Receipt ============================
	shop(); //Displaying Header
			System.out.println("__________________________________________________________________\n");
        	System.out.println("                     ORDER INFORMATION");
        	System.out.print(System.lineSeparator());
        	System.out.println("   Code    Description    UnitPrice    Quantity    Amount ");
        	transaction = trans1 + trans2 + trans3 + trans4 + trans5;
        	System.out.println(transaction);
			System.out.println("_______________________________________________________________");
        	total = amount1 + amount2 + amount3 + amount4 + amount5;
        	System.out.println("\t\t\t\t\t\t\t\t\t\t\tTotal: $ " + (oo.format(total)));
			//========================= End of Receipt ========================
			}
			
	//================================= End of yes =================================
			
	//================================= choice no ==================================
		else if(choice.equalsIgnoreCase("no"))
			{
			System.out.println("\nThanks for visiting Cyber Enigma CS");
			System.out.println("Come Again :)");
			}
			
	//================================= End of no ===============================

	//================================= Invalid =================================
		else
			{
			System.out.println("Invalid!");
			System.out.println("Thanks for visiting Cyber Enigma CS :)");
			}
	//================================= End Invalid =============================		
	System.out.print("\nNew Customer? (yes/no): ");
	String newc = scsc.next();
	System.out.print("\n\n\n\n\n\n");
	
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
//===================================== End of Program ==========================
}
//======================= End of Class ==========================================