package princedeep.singh.s991631800;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 * @author Princedeep Singh
 * @date 3-Jun-2021
 */
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];
        Random random= new Random();

        for (int a = 0; a < magicHand.length; a++) {
            Card c = new Card();
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            magicHand[a]= c;//giving value of ith card of array to c
               
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of cards");
        int value= input.nextInt();
        if ( value < 1 || value >= 14)
        {
            System.out.println("Invalid!!! Please enter the value again between 1 and 13");
            value= input.nextInt();
        }
        System.out.println("Enter the suits");
        String suit = input.next();
        if(suit!="Spades"&& suit!="Hearts" && suit!="Diamonds" && suit!="Clubs")
        {
            System.out.println("Invalid!!! Please enter the suits again");
            suit= input.nextLine();
        }
        Card uCard= new Card();
        uCard.setValue(value);
        uCard.setSuit(suit);
         boolean num = false;
        for( int a = 0; a< magicHand.length; a++)
        {
            if(magicHand[a].getValue() == uCard.getValue() && magicHand[a].getSuit().equalsIgnoreCase(uCard.getSuit()))// suits can be lower or upper case
            {
                num = true;
            break;
            }
        }
            if(num == true)
                System.out.println("You have won the game");
            else
                System.out.println("Sorry you have lost the game");
    }
}
        