package cifrarioVigenere;

import java.util.Scanner;

public class MainVigenere {
	  public static void main(String args[])
	    {
		  Scanner s = new Scanner(System.in);
		  System.out.println("immetti il testo che vuoi crittografare: ");
	      String testo = new String();
	      testo = s.next();
	      Scanner c = new Scanner(System.in);
	      System.out.println("la chiave che vuoi usare per crittografare: ");
	      String chiave = new String();
	      chiave = c.next();
	      String testoCifrato = Vigenere.cifra(testo, chiave);
	      s.close();
	      c.close();
	            
	          
	            System.out.println("Testo in chiaro --> " + testo);
	            System.out.println("Chiave --> " + chiave);
	            System.out.println("Testo cifrato --> " + testoCifrato );
	        
	            
	    }
}