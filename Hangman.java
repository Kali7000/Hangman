import java.util.*;
import java.io.*;

public class Hangman{

  Scanner scan = new Scanner (System.in);
  int attempts = 8;
  String toGuess = "hangman";


  public void begin (){
    System.out.println ("Welcome to Hangman!");
    String word = "_______";
    while (attempts > 0){
        
	System.out.println ("Word: " + word);
	System.out.println ("Attempts remaining: " + attempts);
	System.out.print ("Guess a letter: ");
	String guess = scan.nextLine ();
	if (guessCheck (guess, toGuess)){
	    
	    String ans = "";
	    for (int i = 0; i < toGuess.length (); i++){
	        
		if (guess.equals (Character.toString (toGuess.charAt (i)))){
		    ans += guess;
		  }else{
		    ans += "_";
		  }
	    }
	    String newAns = "";
	    for (int j = 0; j < word.length (); j++){
	        
		if (word.charAt (j) == '_' && ans.charAt (j) != '_'){
		    newAns += ans.charAt (j);
		  }else{
		    newAns += word.charAt (j);
		  }
	    }
	    word = newAns;


	  }else{
	    System.out.println ("Incorrect guess!");
	  }
	System.out.println ();

	if (word.equals (toGuess)){
	    System.out.println ("Congratulations! You've guessed the word: " +
				toGuess);
	    scan.close ();
	    break;
	  }

	attempts--;
      }
    if (attempts <= 0){
	scan.close ();
	System.out.println ("Out of Attempts---> Game Over!!!");
      }
  }



  public static boolean guessCheck (String guess, String toGuess){
    for (int i = 0; i < toGuess.length (); i++){
	if (guess.equals (Character.toString (toGuess.charAt (i)))){
	    return true;
	  }
     }
    return false;
  }


}

