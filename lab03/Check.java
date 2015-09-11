//Sam Bencheghib
//Friday, September 11, 2015
//lob03
//
//  Program purpose: To obtain original cost of restaurant bill
//                   To obtain the percentage tip buyers wish to pay
//                   To find out the number of ways the bill will be split
//                   To determine how much each person in the group needs to spend in order to pay the check


import java.util.Scanner; //import the scanner class in order to use it in the program

//Define a class
public class Check {
    
//Add a main method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner ( System.in ); //Declare an instance of the Scanner object
    
    
//Prompt the user for the original cost of the check

        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble(); //Accept user input
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): "); //Tip percentage that user wishes to pay
        double tipPercent = myScanner.nextDouble();
        tipPercent /=100; //We want to convert the percentage into a decimal value


//Prompt the user for the number of people that went out to dinner

        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        
//Print out the output. Output the amount that each member of the group needs to spend in order to pay the check
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollars amount of cost
            dimes, pennies; //for string digits
        totalCost=checkCost*(1+tipPercent); //this gives the total cost of bill
        costPerPerson=totalCost/numPeople; //this gives cost per person
        dollars=(int)costPerPerson;
        dimes=(int) (costPerPerson*10)%10;
        pennies=(int) (costPerPerson*100)%10;
        System.out.println("Each person in the group owes $" +dollars+'.'+dimes+pennies); //will print the string in parenthesis
        
        
        
        
        
        
    } //end of main method
    
    
} //end of class
