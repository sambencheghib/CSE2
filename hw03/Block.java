//Sam Bencheghib
//Tuesday, September 15, 2015
//Block.java
//
//
//Program purpose: Prompts the user for the length, width, and height of a block in order to calculate the volume of the block and the surface area

//Import Scanner class
import java.util.Scanner;

//Define a class
public class Block {
    
//Add a main method
    public static void main(String[] args) {
        
//Create a Scanner object
        Scanner input = new Scanner(System.in);
        

//Prompt the user for the length, width, and height of a block
                System.out.print("Enter the length of the block: "); //Asking user to input length of block
        double lengthOfBlock = input.nextDouble(); //Accepts user input of length
                System.out.print("Enter the width of the block: "); //Asking user to input width of block
        double widthOfBlock = input.nextDouble(); //Accepts user input of width
                System.out.print("Enter the height of the block: "); //Asking user to input heigh of block
        double heightOfBlock = input.nextDouble(); //Accepts user input of height
        

//Print out the output. Calculate the volum and surface area of the cube
        double volume;          //Create a variable for the volume of the cube
        double surfaceArea;     //Cretae a variable for the surface area of the cube
        
        
        volume=(widthOfBlock*lengthOfBlock*heightOfBlock);                                                              //Find the volume by multiplying width by length by height
        surfaceArea=2*(widthOfBlock*lengthOfBlock)+2*(lengthOfBlock*heightOfBlock)+2*(heightOfBlock*widthOfBlock);      //Find the surface area by using formula 2ab + 2bc + 2ac
        
        
                System.out.println("The volume of the block of dimensions "+lengthOfBlock+" x "+widthOfBlock+" x "+heightOfBlock+" x is "+volume+".");  //Print statement for volume
                System.out.println("The surface area of the block is "+surfaceArea+".");                                                                //Print statement for surface area
        
        
    } //end of main method
    
    
    
} //end of class