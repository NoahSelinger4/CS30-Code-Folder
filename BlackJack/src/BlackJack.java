//Name:Noah Selinger
//Project Name:BlackJack
//Date:January 20th 2025
//Project Description: Simple game of blackjack played best of 5 
import java.util.Scanner;
import java.util.ArrayList;

public class BlackJack {

    private static String playerName;
    private static int playerHand;
    private static int dealerHand;
    private static boolean playerStand;
    private static boolean dealerStand;
    private static int playerWins = 0;
    private static int dealerWins = 0;
    private static ArrayList<String> gameResults = new ArrayList<String>();
    private static Scanner playerInput = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("* Noah's Basic Blackjack Game: First to win 3 rounds wins the Game!");
        System.out.println("> Please enter your name:");
        playerName = playerInput.nextLine();

        while (playerWins < 3 && dealerWins < 3) {
            System.out.println("\n* Starting a new round. Current score: " + playerName + " " + playerWins + " - Dealer " + dealerWins);
            startGame();
            playerTurn();
            if (playerHand <= 21) {
                dealerTurn();
            }
            determineWinner();
        }

        if (playerWins == 3) {
            System.out.println("\n* Congratulations, " + playerName + "! You won the best of 5 series!");
            System.out.println("\n* Game Results: " + gameResults);
        } else {
            System.out.println("\n* Dealer wins the best of 5 series! Better luck next time, " + playerName + ".");
            System.out.println("\n* Game Results: " + gameResults);
        }
    }

    /**
     * Setup the Blackjack game.
     */
    public static void startGame() {
        playerHand = dealCards();
        dealerHand = dealCards();
        playerStand = false;
        dealerStand = false;

        System.out.println("* Dealer deals you two cards.");
        System.out.println("* The current value of your cards in your hand is " + playerHand + ".");
    }

    /**
     * Player's turn to play: choose between Hit or Stand.
     */
    public static void playerTurn() {
        while (!playerStand) {
            System.out.println("> Hit (1) or Stand (0)? Press enter to confirm");
            if (playerInput.hasNextInt()) {
                int playerChoice = playerInput.nextInt();
                if (playerChoice == 1) {
                    System.out.println("* You draw a card.");
                    playerHand += hit();
                    System.out.println("* The current value of your hand is " + playerHand + ".");
                    if (playerHand > 21) {
                        System.out.println("* Bust!");
                        return;
                    }
                } else if (playerChoice == 0) {
                    playerStand = true;
                } else {
                    System.out.println("Please only select between 1 (Hit) and 0 (Stand).\n");
                }
            } else {
                System.out.println("Invalid input. Please enter 1 (Hit) or 0 (Stand).\n");
                playerInput.next(); // Clear invalid input
            }
        }
    }

    /**
     * Dealer's turn to play.
     */
    public static void dealerTurn() {
        System.out.println("* The dealers hand is: " + dealerHand + ".");
        while (!dealerStand && dealerHand < 17) {
            System.out.println("* Dealer draws a card.");
            dealerHand += hit();
            System.out.println("* Dealer's hand is now " + dealerHand + ".");
            if (dealerHand > 21) {
                System.out.println("* Bust!");
                return;
            }
        }
        dealerStand = true;
    }

    /**
     * Decide who is the winner.  Update the Scores and add the result.
     */
    public static void determineWinner() {
        if (playerHand > 21) {
            System.out.println("* You busted. Dealer wins this round!");
            dealerWins++;
            gameResults.add("Dealer Wins");
        } else if (dealerHand > 21) {
            System.out.println("* Dealer busted. You win this round!");
            playerWins++;
            gameResults.add(playerName + " Wins");
        } else if (playerHand > dealerHand) {
            System.out.println("* Congratulations " + playerName + "! You win this round with " + playerHand + ".");
            playerWins++;
            gameResults.add(playerName + " Wins");
        } else if (playerHand < dealerHand) {
            System.out.println("* Dealer wins this round with " + dealerHand + ".");
            dealerWins++;
            gameResults.add("Dealer Wins");
        } else {
            System.out.println("* It's a tie! No points awarded this round.");
        }
    }

    /**
     * The dealer deals a random card.
     * @return random int (between 1-10)
     */
    public static int hit() {
        return (int) (Math.random() * 10 + 1);
    }

    /**
     * The dealer deals two cards.
     * @return int
     */
    public static int dealCards() {
        return hit() + hit();
    }
}


