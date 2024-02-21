import java.util.*;
import java.io.*;


/*
username: admin
password: !ha2n4gm0an!
*/


public class Main{

  public static void main (String[]args){

    try{
      File myFile = new File ("secret");
      Scanner readfile = new Scanner (myFile);
      String line1 = readfile.nextLine ();
      String line2 = readfile.nextLine ();
        readfile.close ();
      Scanner sc = new Scanner (System.in);
      while (true){
        
	  System.out.print ("Enter Username: ");
	  String user = sc.nextLine ();
	    user = "username: " + user;
	  if (line1.equals (user)){
	      
	      System.out.print ("Enter Password: ");
	      String pass = sc.nextLine ();
	        pass = "password: " + pass;
	      if (line2.equals (pass)){
	          
		  System.out.println ("Access Granted ---> The Game Begins!");
		  System.out.println ();
		  System.out.println ();
		  Hangman Game = new Hangman ();
		    Game.begin ();
		    break;
		
	      }else{
		  System.out.println ("Wrong Password, try again!");
		}
		
	   }else{
	      System.out.println ("Wrong User Name, try again!");
	    }
	}
	
    }catch (FileNotFoundException e){
      System.out.println ("File 'secret' is not found");
    }
  }
}

