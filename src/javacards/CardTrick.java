
package javacards;

import java.util.Random;
import java.util.Scanner;

/* Dharmik Patel
 student ID :Sheridan college*/

public class CardTrick {

   public static void main(String[] args) {
      Card[] magicHand = new Card[7];

      // Filling the magicHand array with random Card objects
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card(Card.SUITS[new Random().nextInt(4)], new Random().nextInt(13) + 1);
         magicHand[i] = c;
      }
      Card luckyCard = new Card();
        luckyCard.setValue(7);  // Set the card number as desired
        luckyCard.setSuit("Spades");  // Set the card suit as desired


      // Asking the user for Card value and suit, creating their card, and searching magicHand
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the value of your card (1-13): ");
      int userValue = scanner.nextInt();
      System.out.print("Enter the suit of your card (Hearts, Diamonds, Spades, Clubs): ");
      String userSuit = scanner.next();

      Card userCard = new Card(userSuit, userValue);
      boolean found = false;

      for (Card card : magicHand) {
         if (card.getValue() == userCard.getValue() && card.getSuit().equalsIgnoreCase(userCard.getSuit())) {
            found = true;
            break;
         }
      }

      // Reporting the result
      if (found) {
         System.out.println("Congratulations! Your card is in the magic hand.");
      } else {
         System.out.println("Sorry! Your card is not in the magic hand.");
      }
   }
}
