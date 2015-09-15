//Sam Bencheghib
//Tuesday, September 15, 2015
//Timer.java
//
//
// Program purpose: To prompt the user for the current time and dinner time and 
//                  calculates the amount of time remaining until they eat dinner
//


// Import scanner class
import java.util.Scanner;


// Define a class
public class Timer {
    
// Add a main method
    public static void main(String[] args) {
        
        
// Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        
// Prompt the user for the current time and the dinner time
                System.out.print("Enter the current time in the form HHMM: "); //Asking user to input current time
        double currentTime = input.nextDouble(); //Accept user input of current time
                System.out.print("Enter the time that you will be eating dinner in the form HHMM: "); //Asking user to input time of dinner
        double dinnerTime = input.nextDouble(); //Accept user input of dinner time
        
        
// Print out the output. Calculate time remaining until dinner
        int dinnerMinutes;              //Create a variable for the minutes of the dinner time prompted by the user
        int currentMinutes;             //Create a variable for the minutes of the current time prompted by the user
        int dinnerHours;                //Create a variable for the hours of the dinner time prompted by the user
        int currentHours;               //Create a variable for the hours of the current time prompted by the user
        int totalDinnerMinutes;         //Create a variable that will hold all minutes of the dinner time (we will convert hours to minutes)
        int totalCurrentMinutes;        //Create a variable that will hold all minutes of the current time (we will convert hours to minutes)
        int totalTimeRemaining;         //Create a variable for the time remaining from current time to dinner time
        int minutesRemaining;           //Create a variable for the minutes that remain before dinner 
        int hoursRemaining;             //Create a variable for the hours that remain before dinner
        
        dinnerHours = (int) dinnerTime/100;                             //Take dinnerTime and divide it by 100 to convert military time
        currentHours = (int) currentTime/100;                           //Do the same with currentTime (divide by 100 to convert military time)
        dinnerMinutes = (int) dinnerTime%100;                           //Divide dinnerTime by 100 with % for remainder
        currentMinutes = (int) currentTime%100;                         //Do the same with currentTime
        totalDinnerMinutes = (dinnerHours*60) + dinnerMinutes;          //Convert dinner hours to minutes and add dinner minutes (you now have dinner time entirely in minutes)
        totalCurrentMinutes = (currentHours*60) + currentMinutes;       //Convert current hours to minutes and add current minutes (you now have current time entirely in minutes)
        totalTimeRemaining = totalDinnerMinutes - totalCurrentMinutes;  //Subtract totalCurrentMinutes from totalDinnerMinutes to find time remaining before dinner
        hoursRemaining = totalTimeRemaining/60;                         //To find amount of hours remaining before dinner, divide totalTmeRemaining by 60 to re-convert back to hours
        minutesRemaining = totalTimeRemaining%60;                       //To find amount of minutes remaining before dinner, divide totalTimeRemaining by 60 with % to have remainder (less than 60 for minutes)
        
        
                System.out.println("You have "+hoursRemaining+" hours and "+minutesRemaining+" minutes until dinner"+".");      //Print your statement
        
       
        
        
        
    } //end of main method
    
    
} //end of class