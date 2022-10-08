import java.io.*;
import java.util.*;

public class Act3Indiv {

  private static int length;

  public static void main(String[] args) throws NameException {
    // variables used to create account
    String name;
    String amounting;
    int accountNum;
    int count = 0;
    int count1 = 0;
    double amount;
    final int MAX = 999999999;

    Scanner keyboard = new Scanner(System.in);
    Random rand = new Random();
    List<Act3IndivClass> act = new ArrayList<Act3IndivClass>();
    List<String> act1 = new ArrayList<String>();

    accountNum = rand.nextInt(MAX);
    System.out.println(
        "____________________________________________________________________________\n");
    System.out.println("                           LC's Banking Program \n");
    System.out.println(
        "____________________________________________________________________________\n");
        System.out.println("Enter full name: ");
        name = keyboard.nextLine();

        try {
          length = name.length();
          for (int i = 0; i < length; i++) {
            if (!Character.isDigit(name.charAt(i)) &&
                !Character.isLetter(name.charAt(i)) &&
                !Character.isWhitespace(name.charAt(i))) {
              count++;
              throw new NameException("              -->   Invalid Amount!  <--");
            }
          }
        } catch (NameException e) {
          e.errorName();
        }
  
    do {
    
      
      System.out.println("Enter amount to deposit: ");
      amount = keyboard.nextDouble();
      try {
        if (amount < 0) {
          throw new NumException("              -->   Invalid Amount!  <--");
        }
      } catch (NumException exc) {
        exc.errorExc();
        System.exit(0);
      }
      Act3IndivClass acct1 = new Act3IndivClass(name, accountNum, amount);
      act.add(acct1);
      System.out.println(act);

    } while (true);
  }

}