//Sam Bencheghib
//Tuesday, September 8, 2015
//hw02
//Arithmetic Calculations homework

//  Program purpose: calculate cost (in $) of items bought at Walmart's, including PA tax of 0.06%


// define a class
public class Arithmetic{
    
    
    
//  add main method
    public static void main (String[] args) {
    
    
    
//Declare the variables
//Socks
    int nSocks=3; // Number of pairs of socks
    double socksCost$=2.58; // cost per pair of socks
 
//Drinking glasses
    int nGlasses=6; // Number of drinking glasses
    double glassCost$=2.29; // cost per drinking glass
        
//Boxes of envelopes
    int nEnvelopes=1; // Number of boxes of envelopes
    double envelopeCost$=3.25; // cost per box of envelopes

//Tax
    double taxPercent$=0.06; // Percentage of tax in PA
    
    
    
//Create variables for purchases
        double totalSocksCost=nSocks*socksCost$; //total cost of socks
        double totalGlassesCost=nGlasses*glassCost$; //total cost of glasses
        double totalEnvelopesCost=nEnvelopes*envelopeCost$; //total cost of envelopes
        double totalTaxCost=(totalSocksCost+totalGlassesCost+totalEnvelopesCost)*taxPercent$; //sales tax for total cost
        double totalPurchasesCostBeforeTax=(totalSocksCost+totalGlassesCost+totalEnvelopesCost); //total cost of purchases (before tax)
        double totalPurchasesCost1=((totalPurchasesCostBeforeTax)*taxPercent$ + totalPurchasesCostBeforeTax); //multiply subtotal by tax percent
               totalPurchasesCost1=totalPurchasesCost1*100; //multiply total cost of purchases with tax by 100
        int    totalPurchasesCost2=(int)totalPurchasesCost1; //casting total cost of purchases to an int
               totalPurchasesCost1=totalPurchasesCost2/100.0; //making total cost of purchases a 2-decimal place number (truncating) 
    
// Print the statements for each kind of item
        System.out.println("Total cost for the socks was $" + totalSocksCost); //prints out total cost of socks
        System.out.println("Total cost for the drinking glasses was $" + totalGlassesCost); //prints out total cost of glasses
        System.out.println("Total cost for the boxes of envelopes was $" + totalEnvelopesCost); //prints total out cost of envelopes
        System.out.println("Sales tax for total cost of purchases was $" + totalTaxCost); //prints out sales tax of total purchases
        System.out.println("Subtotal was $" + totalPurchasesCostBeforeTax); //prints out subtotal of purchases
        System.out.println("Total amount paid for transaction, including sales tax was $" + totalPurchasesCost1); //prints out total amount paid for transaction, including sales tax
        
        
        
        
    } // end of main method
    
    
} // end of class