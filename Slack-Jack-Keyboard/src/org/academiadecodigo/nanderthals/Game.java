
package org.academiadecodigo.nanderthals;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.util.Scanner;

public class Game implements KeyboardHandler {

    private boolean betTime;
    private GameLogic gl;
    private Keyboard keyboard;
    KeyboardEvent onePress = new KeyboardEvent();
    KeyboardEvent twoPress = new KeyboardEvent();
    KeyboardEvent threePress = new KeyboardEvent();
    KeyboardEvent fourPress = new KeyboardEvent();
    KeyboardEvent hPress = new KeyboardEvent();
    KeyboardEvent sPress = new KeyboardEvent();

    public Game() {
        gl = new GameLogic();
        keyboardInit();
    }
    public void setBetTime(boolean bool) {
        this.betTime = bool;
    }
    public boolean getBetTime() {
        return this.betTime;
    }

    public void startGame() throws InterruptedException {

        //GameLogic gl = new GameLogic(); // Initialize a GameLogic

        //Scanner userInput = new Scanner(System.in); // Initialize Scanner for user input

        gl.createPlayingDeck();

        // while player has money to play, play
        while( gl.getPlayerMoney() > 0 ) {

            /*Thread.sleep(500);
            keyboardInitBet();*/

            // Start the Round by creating and shuffling the playingDeck
            gl.startRound();
            //setBetTime(true);

            // while player bet is not valid, keep asking for a bet
            while( !gl.getValidBet() ) {
                System.out.println("You have " + gl.getPlayerMoney() + "€. How much would you like to bet?");

                // Set the player bet with user input and use the method for placing bets
                //int userBet = userInput.nextInt();
                //gl.placeBet(userBet);
            }

            /*Thread.sleep(500);
            keyboardInitPlay();*/

            //setBetTime(false);
            // Draws initial cards for player and dealer
            gl.initialPlay();

            // repeat asking the player for a Hit or Stand while the Round does not come to an end
            while( !gl.getEndRound() ) {

                System.out.println("Your hand: ");
                /*System.out.println(gl.getPlayerDeck().toString());
                System.out.println("Your hand value is: " + gl.getPlayerDeck().cardsValue());

                System.out.println("Dealer hand: " + gl.getDealerDeck().getCard(0).toString() + " and [Hidden]");
                System.out.println("Would you like to (1)Hit or (2)Stand?");

                // Get user input for a Hit or a Stand
                int response = userInput.nextInt();

                // if player chooses to Hit
                if( response == 1) {
                    // Call the hit method
                    gl.hit();
                }
                // if player chooses to Stand
                if( response == 2) {
                    // Call the stand method
                    gl.stand();
                    // and check the results
                    gl.result();
                }*/
            }
            //setBetTime(true);
            // Separator between Rounds
            System.out.println("--------------------");
        }

        // If the player runs out of money, GAME OVER
        System.out.println("Game Over! You are out of money!!!");
        // At Game Over, terminate the program
        System.exit(0);
    }

    public void keyboardInit() {
        keyboard = new Keyboard(this);

        // 1 Key for 10€ Bet
        onePress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        onePress.setKey(KeyboardEvent.KEY_1);

        // 2 Key for 25€ Bet
        twoPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        twoPress.setKey(KeyboardEvent.KEY_2);

        // 3 Key for 50€ Bet
        threePress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        threePress.setKey(KeyboardEvent.KEY_3);

        // 4 Key for 100€ Bet
        fourPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        fourPress.setKey(KeyboardEvent.KEY_4);

        // Add Keyboard Listeners
        keyboard.addEventListener(onePress);
        keyboard.addEventListener(twoPress);
        keyboard.addEventListener(threePress);
        keyboard.addEventListener(fourPress);

        // H Key for Hit
        hPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        hPress.setKey(KeyboardEvent.KEY_H);

        // S Key for Stand
        sPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        sPress.setKey(KeyboardEvent.KEY_S);

        // Add Keyboard Listeners
        keyboard.addEventListener(hPress);
        keyboard.addEventListener(sPress);
    }

    /*public void keyboardInitBet() {
        keyboard = new Keyboard(this);

        keyboard.removeEventListener(hPress);
        keyboard.removeEventListener(sPress);

        // 1 Key for 10€ Bet
        onePress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        onePress.setKey(KeyboardEvent.KEY_1);

        // 2 Key for 25€ Bet
        twoPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        twoPress.setKey(KeyboardEvent.KEY_2);

        // 3 Key for 50€ Bet
        threePress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        threePress.setKey(KeyboardEvent.KEY_3);

        // 4 Key for 100€ Bet
        fourPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        fourPress.setKey(KeyboardEvent.KEY_4);

        // Add Keyboard Listener
        keyboard.addEventListener(onePress);
        keyboard.addEventListener(twoPress);
        keyboard.addEventListener(threePress);
        keyboard.addEventListener(fourPress);

    }

    public void keyboardInitPlay() {
        keyboard.removeEventListener(onePress);
        keyboard.removeEventListener(twoPress);
        keyboard.removeEventListener(threePress);
        keyboard.removeEventListener(fourPress);

        // H Key for Hit
        hPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        hPress.setKey(KeyboardEvent.KEY_H);

        // S Key for Stand
        sPress.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        sPress.setKey(KeyboardEvent.KEY_S);

        keyboard.addEventListener(hPress);
        keyboard.addEventListener(sPress);
    }*/

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch( keyboardEvent.getKey() ) {
            case KeyboardEvent.KEY_1:
                //if( getBetTime() ) {
                gl.placeBet(10);
                //break;
                //}
                break;
            case KeyboardEvent.KEY_2:
                //if( getBetTime() ) {
                gl.placeBet(25);
                //break;
                //}
                break;
            case KeyboardEvent.KEY_3:
                //if( getBetTime() ) {
                gl.placeBet(50);
                //break;
                // }
                break;
            case KeyboardEvent.KEY_4:
                //if( getBetTime() ) {
                gl.placeBet(100);
                //break;
                //}
                break;
            case KeyboardEvent.KEY_H:
                //if( !getBetTime() ) {
                try {
                    gl.hit();
                } catch (InterruptedException e) {
                    System.out.println("H Key Exception");
                }
                //break;
                //}
                break;
            case KeyboardEvent.KEY_S:
                //if( !getBetTime() ) {
                try {
                    gl.stand();
                } catch (InterruptedException e) {
                    System.out.println("S Key Exception");
                }
                //break;
                //}
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
