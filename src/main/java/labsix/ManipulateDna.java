package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/** This program takes a string of dna and prints the compliment of that dna.
 *
 *
 */
public class ManipulateDna {
  /** This program will prompt the user to type a string of dna
   * Then it will print the complement of that dna, appropriately labeled.
   *
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Colten Buzard " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen dna string
    String input = scanner.nextLine();
    final String dna = input.toUpperCase();
    System.out.println("Okay, I am going to manipulate the DNA string \"" + dna + "\".\n");

    // Step Two: Compute the complement of the dna String
    String dnacomp = dna;

    /* Have to change each letter to a different variable so that it doesn't change it twice.
    T = X
    A = Y
    C = Z
    G = W

A-T
C-G
In this step I'm taking each letter, then giving it a psuedo letter so that it
 doesn't get replaced again.
    */
    dnacomp = dnacomp.replace('T','X');
    dnacomp = dnacomp.replace('A','Y');
    dnacomp = dnacomp.replace('C','Z');
    dnacomp = dnacomp.replace('G','W');
    // Converting each pseudo letter to it's compliment
    dnacomp = dnacomp.replace('X','A');
    dnacomp = dnacomp.replace('Y','T');
    dnacomp = dnacomp.replace('Z','G');
    dnacomp = dnacomp.replace('W','C');

    // Printing the compliment
    System.out.println("Enter a string containing only C, G, T, and A: " + dna);
    System.out.println("Complement of ACTG is " + dnacomp);

    // Step Three: Insert a randomly chosen dna letter into the dna String
    String allowed = "CGTA";
    Random ran = new Random();
    int randomNum = ran.nextInt(4);
    char randomletter = allowed.charAt(randomNum);
    System.out.println("Inserting " + randomletter + " at position 0 gives "
        + randomletter + dna);

    // Step Four: Delete a dna letter from a randomly chosen position in the dna string
    int randompos = ran.nextInt(dna.length());
    String dnadelete = ("" + dna.substring(0, randompos)
        + dna.substring(randompos + 1, dna.length()));
    
    System.out.println("Deleting from position " + (randompos + 1) + " gives " + dnadelete);
    // Step Five: Change a random position in the dna String to a randomly chosen dna letter
    // randomNum2 chooses a random number from dna; In dnasub I'll remove this 
    int randomNum2 = ran.nextInt(dna.length());
    // randomNum3 will be used to create randomletter2
    int randomNum3 = ran.nextInt(dna.length());
    char randomletter2 = dna.charAt(randomNum3);

    String dnasub = ("" + dna.substring(0, randomNum2) + randomletter2
        + dna.substring(randomNum2 + 1, dna.length()));

    System.out.println("Changing position " + (randomNum2 + 1) + " gives " + dnasub);
    // Step Six: Display a final thankyou message
    System.out.println("\nThanks for using the ManipulateDna program.\nHave an awesome day.");
  }

}
