//Sam Bencheghib
//September 19, 2015
//lab04
//
//Program purpose: To develop a random number generator that will select a card at random (from a deck of 52 card),
//                 and make sure that each number represents one card, and the suits are grouped (eg. cards 1-13
//                 represent diamonds).



//Define a class
public class CardGenerator {
    
//Add main method
    public static void main(String[] args) {
        
        
        
//Create a variable for the random card selected
        int randomCard = (int)(Math.random()*52) + 1;   //By multiplying math class by 52, tells program to select a card from 1-52

//Create a variable for the switch statement in order for the program to print the correct card
        String cardName = "";   //Name of card will go in between the "..."
 
        
        
//Use switch statement to generate each card
        switch (randomCard) {       //Use the switch statement to assign each 52 cards a different identity
            case 1:
                cardName = "Ace";
                break;              //Use this pattern for every card until the 52nd card
            case 2: 
                cardName = "2";
                break;
            case 3: 
                cardName = "3";
                break;
            case 4:
                cardName = "4";
                break;
            case 5:
                cardName = "5";
                break;
            case 6:
                cardName = "6";
                break;
            case 7:
                cardName = "7";
                break;
            case 8:
                cardName = "8";
                break;
            case 9:
                cardName = "9";
                break;
            case 10:
                cardName = "10";
                break;
            case 11:
                cardName = "Jack";
                break;
            case 12:
                cardName = "Queen";
                break;
            case 13:
                cardName = "King";      //This is the end of the diamond suit
                break;
            case 14:
                cardName = "Ace";
                break;
            case 15:
                cardName = "2";
                break;
            case 16:
                cardName = "3";
                break;
            case 17:
                cardName = "4";
                break;
            case 18:
                cardName = "5";
                break;
            case 19:
                cardName = "6";
                break;
            case 20:
                cardName = "7";
                break;
            case 21:
                cardName = "8";
                break;
            case 22:
                cardName = "9";
                break;
            case 23:
                cardName = "10";
                break;
            case 24:
                cardName = "Jack";
                break;
            case 25:
                cardName = "Queen";
                break;
            case 26:
                cardName = "King";
                break;                  //End of the heart suit
            case 27:
                cardName = "Ace";
                break;
            case 28:
                cardName = "2";
                break;
            case 29:
                cardName = "3";
                break;
            case 30:
                cardName = "4";
                break;
            case 31:
                cardName = "5";
                break;
            case 32:
                cardName = "6";
                break;
            case 33:
                cardName = "7";
                break;
            case 34:
                cardName = "8";
                break;
            case 35:
                cardName = "9";
                break;
            case 36:
                cardName = "10";
                break;
            case 37:
                cardName = "Jack";
                break;
            case 38:
                cardName = "Queen";
                break;
            case 39:
                cardName = "King";      //End of the Spades suit
                break;
            case 40:
                cardName = "Ace";
                break;
            case 41:
                cardName = "2";
                break;
            case 42:
                cardName = "3";
                break;
            case 43:
                cardName = "4";
                break;
            case 44:
                cardName = "5";
                break;
            case 45:
                cardName = "6";
                break;
            case 46:
                cardName = "7";
                break;
            case 47:
                cardName = "8";
                break;
            case 48:
                cardName = "9";
                break;
            case 49:
                cardName = "10";
                break;
            case 50:
                cardName = "Jack";
                break;
            case 51:
                cardName = "Queen";
                break;
            case 52:
                cardName = "King";
                break;                  //End of Clubs suit
        }   //End of switch statement



//Use if statement to assign each cardName to a suit
        if (randomCard<=13){
            System.out.println("You picked the " + cardName + " of diamonds");     //Will print this line for cards 1-13
        }
        else if (randomCard >=14 && randomCard <=26){
            System.out.println("You picked the " + cardName + " of hearts");       //Will print this line for cards 14-26
        }
        else if (randomCard >=27 && randomCard <=39){
            System.out.println("You picked the " + cardName + " of spades");       //Will print this line for cards 27-39
        }
        else if (randomCard >=40 && randomCard <=52){
            System.out.println("You picked the " + cardName + " of clubs");        //Will print this line for cards 40-52
        }
        
        
        
        
        
    }   //End of main method


}   //End of class
