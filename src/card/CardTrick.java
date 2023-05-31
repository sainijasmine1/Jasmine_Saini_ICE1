package card;

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    // Modifier: Jasmine Saini
    // Student ID: 991712194
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(random.nextInt(13) + 1); // Random value between 1 and 13
            c.setSuit(Card.SUITS[random.nextInt(4)]); // Random suit from 0 to 3
            magicHand[i] = c;
        }
        Card luckycard = new Card();
        luckyCard.setValue(6); //Set the lucky card number
        luckyCard.setSuit("hearts"); // Set the lucky card suit
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card (1-13): ");
        int userValue = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter the suit of your card (Hearts, Diamonds, Clubs, Spades): ");
        String userSuit = scanner.nextLine();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(userSuit);
        
        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Congratulations! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
