/* M403
*
*@author Marc Andri Fuchs
*@since 2020-11-10
*@version 0.1
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Notenschnitt {
  /*
  * starts the execution
  * @param args
  */
  public static void main(String[] args) {
    Notenschnitt program = new Notenschnitt();
    program.run();
  }

  /**/
  private void run() {

    int totalMarks = 0;
    int amountOfMarks = 0;
    double total = 0;

    ArrayList<Double> marks = new ArrayList<Double>();

    Scanner sc = new Scanner(System.in);

    seperator();
    System.out.println("How many marks do you have?");
    seperator();
    totalMarks = Integer.parseInt(sc.nextLine());

    for (int i = amountOfMarks; i < totalMarks; i++) {
      seperator();
      System.out.println("You've already entered " + amountOfMarks + " out of " + totalMarks + " marks!");
      System.out.println("Enter a mark between 1 and 6!");
      double currentMark = sc.nextDouble();

      if(currentMark < 1 || currentMark > 6) {
        System.out.println("NO!");
      }
      else{
        total += currentMark;
        marks.add(currentMark);
        amountOfMarks++;
      }
    }
    System.out.println("Your average is: " + total / totalMarks);
    seperator();
    System.out.println("Your marks are:");
    seperator();
    for(int a = 0; a < marks.size(); a++) {
      int marknumber = a+1;
      System.out.println("Mark " + marknumber + ":........" + marks.get(a));
    }
    seperator();
  }

  private void seperator() {
    System.out.println("\n");
    System.out.print("+");
    for(int i = 0; i < 50; i++) {
      System.out.print("-");
    }
    System.out.print("+");
    System.out.println("\n");
  }
}
