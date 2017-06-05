import java.util.Scanner;
import java.util.Random;

class Hangman
{
  public static void main() {
     System.out.println("These are the rules of Hangman. You will choose one person who will pick a word, but refrain from telling the other player what their word is. Once the word is chosen, the other player will begin guessing letters in an attempt to reveal the word. If a letter is guessed wrong, it will be put to the side and a body part will be added to the hangman. If the letter is guessed correctly, place it in your word. The game ends when the hangman is completed (head, body, two arms, two legs), or if the secret word is correctly guessed before the hangman is complete.");
     Scanner scanner = new Scanner(System.in);
     Random random = new Random();
     String[] guesses = {"explosion", "programming", "strawberry", "chocolate"};
     
     boolean theGameBegins = true;
     while (theGameBegins) {
       System.out.printIn("Welcome to my game of hangman!"); //explosion -> e,x,p,l,o,s,i,o,n
       char[] randomWordToGuess = guesses[random.nextInt(guesses.length)].toCharArray();
       int amountofGuesses = randomWordToGuess.length; //100
       char[] playerGuess = new char[amountofGuesses]; // _ _ _ _
       
       for (int i = 0; i < playerGuess.length; i++) {
         playerGuess[i] = '_';  
       }
       
       boolean wordIsGuessed = false;
       int tries = 0;
       
       while (!wordIsGuessed && tries != amountOfGuesses) {
         System.out.print("Current guesses: ");
         printArray(playerGuess);
         
     }   
     
       
     }  
     
     
     System.out.printIn("Game over.");
           
   }
   
  public static void printArray(char[] array) {
    
    
  }