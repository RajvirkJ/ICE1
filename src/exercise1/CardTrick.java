package exercise1;

import java.util.Scanner;
import java.util.*;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 *@author Rajvir Kaur May 26, 2023*/
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            card.setValue((int)(Math.random()*13+1));
            
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            Random random = new Random();
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point\
            
            hand[i] = card;
           // System.out.println(hand[i].getValue() + " " + hand[i].getSuit());

        }
//        for (int i=0;i<hand.length;i++){
//            System.out.println(hand[i].getValue() + " " + hand[i].getSuit());
//        }

        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
       Scanner input= new Scanner(System.in);
       System.out.println("Enter the card value:");
       int cardValue= input.nextInt();
       System.out.println("Enter the suit:");
       int suit= input.nextInt();
        String x="";
        switch (suit) {
        case 1:
        x = "Hearts";
        break;
        case 2:
        x = "Diamonds";
        break;
        case 3:
        x = "Spades";
        break;
        case 4:
        x = "Clubs";
        break;
    }
       for(int i=0; i< hand.length; i++) {
       if (cardValue == hand[i].getValue() && x.equals(hand[i].getSuit())) {
         CardTrick.printInfo();
      } 
    }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Rajvir Kaur May 2023
     */
    
    private static void printInfo() {
       // I'm done!
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Rajvir Kaur, but you can call me Rajvir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more focussed on programming");
        System.out.println("-- To get a job in IT field by the end of next year!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Going outside");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Playing with my kid");

        System.out.println();
        
    
    }
}


