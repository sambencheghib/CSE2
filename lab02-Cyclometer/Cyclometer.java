//Sam Bencheghib
//Friday, September 4, 2015
//My Bicycle Cyclometer lab02
//
//  Program purpose: measure the speed, the distance of a bicycle trip
//  it should print the number of minutes for each trip
//  it should print the number of counts for each trip
//  it should print the distance of each trip in miles
//  it should print the distance for the two trips combined
//
//  first compile the program
//      javac Cyclometer.java
//  run the program
//      java Cyclometer.java//

//  define a class
public class Cyclometer {
    
//  add a main method
    public static void main (String[] args) {

//store number of seconds and counts for each trip
        int secsTrip1=480; //seconds in trip1
        int secsTrip2=3220; //seconds in trip2
        int countsTrip1=1561; //counts in trip1
        int countsTrip2=9037; //counts in trip2

//create variables for useful constants and for storing the various distances
        double wheelDiameter=27.0, //diameter of wheel
        PI=3.14159, //Pi
        feetPerMile=5280, //how many feet in a mile
        inchesPerFoot=12, //how many inches in a foot
        secondsPerMinute=60; //how many seconds in a minute
        double distanceTrip1, distanceTrip2,totalDistance; //
        
//print out the numbers that are stored in the variables that store number of seconds and counts
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+
            countsTrip2+" counts.");
            
//compute the values for the distances
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter in inches times PI)
        distanceTrip1=inchesPerFoot*feetPerMile; // Gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1*distanceTrip2;
        
//Print out the distances
        //Print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
            

        } //end of main method

} //end of class