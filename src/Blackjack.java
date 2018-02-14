import java.util.*;
public class Blackjack {
//comment
    public static void main(String[] args) {
        // write your code here
        P1Random rng = new P1Random();
        Scanner scanner = new Scanner(System.in);
        int ACE = 1;
        int JACK = 10;
        int QUEEN = 10;
        int KING = 10;
        int playerHand = 0;
        int dealerHand = 0;
        int playerOption = 1;
        int myNumber = 0;
        int playerWins = 0;
        int dealerWins = 0;
        int tieGames = 0;
        int numGames = 0;
        double percentageWins = 0;

        while (playerHand == 0) {
            numGames = numGames + 1;
            myNumber = rng.nextInt(13) + 1;

            //face cards
            if (myNumber == 13) {
                myNumber = KING;
            }
            else if (myNumber == 12) {
                myNumber = QUEEN;
            }
            else if (myNumber == 11) {
                myNumber = JACK;
            }

            System.out.println("START GAME #" + numGames);

            System.out.println();
        if (myNumber == KING) {
            System.out.println("Your card is a KING!");
            System.out.println("Your hand is: " + myNumber);
            }
        else if (myNumber == QUEEN) {
            System.out.println("Your card is a QUEEN!");
            System.out.println("Your hand is: " + myNumber);
            }
        else if (myNumber == JACK) {
            System.out.println("Your card is a JACK!");
            System.out.println("Your hand is: " + myNumber);
            }
        else if (myNumber == ACE) {
            System.out.println("Your card is a ACE!");
            System.out.println("Your hand is: " + myNumber);
        }
        else {
            System.out.println("Your card is a " + myNumber + "!");
            System.out.println("Your hand is: " + myNumber);
        }
            playerHand = myNumber;

            System.out.println();

            //Menu
            while (playerHand > 0) {
                System.out.println("1. Get another card");
                System.out.println("2. Hold hand");
                System.out.println("3. Print statistics");
                System.out.println("4. Exit");

                System.out.println();

                System.out.print("Choose an option: ");
                playerOption = scanner.nextInt();

                System.out.println();

                //Player is dealt their hand
                if (playerOption == 1) {
                    myNumber = rng.nextInt(13) + 1;
                    if (myNumber == 13) {
                        myNumber = KING;
                    }
                    if (myNumber == 12) {
                        myNumber = QUEEN;
                    }
                    if (myNumber == 11) {
                        myNumber = JACK;
                    }

                    playerHand = playerHand + myNumber;

                    //Player's hand is less than 21
                    if (playerHand < 21) {
                        if (myNumber == KING) {
                            System.out.println("Your card is a KING!");
                            System.out.println("Your hand is: " + playerHand);
                            }
                        else if (myNumber == QUEEN) {
                            System.out.println("Your card is a QUEEN!");
                            System.out.println("Your hand is: " + playerHand);
                            }
                        else if (myNumber == JACK) {
                            System.out.println("Your card is a JACK!");
                            System.out.println("Your hand is: " + playerHand);
                            }
                        else if (myNumber == 1) {
                            System.out.println("Your card is a ACE!");
                            System.out.println("Your hand is: " + playerHand);
                            }
                        else {
                            System.out.println("Your card is a " + myNumber + "!");
                            System.out.println("Your hand is: " + playerHand);
                            }
                        }
                    //Player exceeds 21 and loses
                    if (playerHand > 21) {
                        if (myNumber == KING) {
                            System.out.println("Your card is a KING!");
                            System.out.println("Your hand is: " + playerHand);
                        }
                        else if (myNumber == QUEEN) {
                            System.out.println("Your card is a QUEEN!");
                            System.out.println("Your hand is: " + playerHand);
                        }
                        else if (myNumber == JACK) {
                            System.out.println("Your card is a JACK!");
                            System.out.println("Your hand is: " + playerHand);
                        }
                        else if (myNumber == 1){
                            System.out.println("Your card is a ACE!");
                            System.out.println("Your hand is: " + playerHand);
                        }
                        else {
                            System.out.println("Your card is a " + myNumber + "!");
                            System.out.println("Your hand is: " + playerHand);
                        }
                        System.out.println();
                        System.out.println("You exceeded 21! You lose.");
                        playerHand = 0;
                        dealerWins = dealerWins + 1;
                        }
                    //Player gets blackjack
                    if (playerHand == 21) {
                        if (myNumber == KING) {
                            System.out.println("Your card is a KING!");
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println();
                        }
                        else if (myNumber == QUEEN) {
                            System.out.println("Your card is a QUEEN!");
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println();
                        }
                        else if (myNumber == JACK) {
                            System.out.println("Your card is a JACK!");
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println();
                        }
                        else if (myNumber == 1){
                            System.out.println("Your card is a ACE!");
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println();
                        }
                        else {
                            System.out.println("Your card is a " + myNumber + "!");
                            System.out.println("Your hand is: " + playerHand);
                            System.out.println();
                        }
                        System.out.println("BLACKJACK! You win!");
                        playerHand = 0;
                        playerWins = playerWins + 1;
                        }
                    System.out.println();
                }
                //Dealer is dealt his hand
                if (playerOption == 2) {
                    dealerHand = rng.nextInt(11) + 16;
                    //Player wins
                    if (dealerHand < playerHand) {
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + playerHand);
                        System.out.println();
                        System.out.println("You win!");
                        System.out.println();
                        playerHand = 0;
                        playerWins = playerWins + 1;
                    }
                    //Dealer wins
                    else if (dealerHand == 21) {
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + playerHand);
                        System.out.println();
                        System.out.println("Dealer wins!");
                        System.out.println();
                        playerHand = 0;
                        dealerWins = dealerWins + 1;
                    }
                    //Tie
                    else if (dealerHand == playerHand) {
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + playerHand);
                        System.out.println();
                        System.out.println("It's a tie! No one wins!");
                        System.out.println();
                        playerHand = 0;
                        tieGames = tieGames + 1;
                    }
                    //Dealer wins
                    else if ((dealerHand > playerHand) && (dealerHand < 21)){
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + playerHand);
                        System.out.println();
                        System.out.println("Dealer wins!");
                        System.out.println();
                        playerHand = 0;
                        dealerWins = dealerWins + 1;
                    }
                    //Dealer exceeds 21 and player wins
                    else if (dealerHand > 21) {
                        System.out.println("Dealer's hand: " + dealerHand);
                        System.out.println("Your hand is: " + playerHand);
                        System.out.println();
                        System.out.println("You win!");
                        System.out.println();
                        playerHand = 0;
                        playerWins = playerWins + 1;
                    }
                }
                //Print statistics
                if (playerOption == 3) {
                    numGames = numGames - 1;
                    System.out.println("Number of Player wins: " + playerWins);
                    System.out.println("Number of Dealer wins: " + dealerWins);
                    System.out.println("Number of tie games: " + tieGames);
                    System.out.println("Total # of games played is: " + numGames);
                    percentageWins = ((double) playerWins / (playerWins + dealerWins + tieGames)) * 100.0;
                    System.out.print("Percentage of Player wins: ");
                    System.out.format("%.1f", percentageWins);
                    System.out.println("%");
                    playerOption = 1;
                    System.out.println();
                }
                //Exit game
                if (playerOption == 4) {
                    System.exit(0);
                }
                //Invalid inputs
                if ((playerOption > 4) || (playerOption < 1)) {
                    System.out.println("Invalid input!");
                    System.out.println("Please enter an integer value between 1 and 4.");
                    playerOption = 1;
                    System.out.println();
                }
            }

                }
            }
        }


