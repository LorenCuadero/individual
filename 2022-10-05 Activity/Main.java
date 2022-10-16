import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static int length;

    public static void main(String[] args) throws NameException {
        // variables used to create account
        String name;
        String amounting;
        int accountNum;
        int count = 0;
        int count1 = 0;
        double amount = 0.0;
        final int MAX = 999999999;

        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        List<String> act1 = new ArrayList<String>();

        accountNum = rand.nextInt(MAX);

        boolean mainLoop = true;

        int choice;
        System.out.println(
                "____________________________________________________________________________\n");
        System.out.println("                           LC's Depositing Program \n");
        System.out.println(
                "____________________________________________________________________________\n");

        while (true) {
            System.out.println("Menu: \n");

            act1.add("1.) Deposite \n");
            act1.add("2.) Logout \n");

            for (int x = 0; x < 2; x++) {

                System.out.println(act1.get(x));
            }
            System.out.print("\nEnter Choice [Ex. 1] :  ");

            choice = keyboard.nextInt();
            switch (choice) {

                case 1:
                    List<Record> act = new ArrayList<Record>();
                    System.out.println("How many times will you deposite? ");
                    int numObj = keyboard.nextInt();

                    for (int a = 0; a < numObj; a++) {

                        try {
                            System.out.println("Index Number " + a + " - Name : ");
                            keyboard.nextLine();
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
                            try {
                                System.out.println("Index Number " + a + " - Amount : ");
                                amount = keyboard.nextDouble();

                                if (amount < 0) {
                                    throw new ErrorException();
                                }

                                // Pattern pattern = Pattern.compile("[*-&^]");
                                // Matcher matcher = pattern.matcher(amount);
                                // if (matcher.find()) {
                                // throw new ErrorException();

                                // }
                            } catch (ErrorException e) {
                                e.errorMessage("Invalid Amount");
                            }
                            Record acct1 = new Record(name, accountNum, amount);
                            act.add(acct1);
                            System.out.println(acct1);

                        }

                        catch (Exception e) {
                            break;

                        }
                    }
                case 2:

                System.out.println(" If you did not intended to logout, there might be something wrong with your input. ");
                System.out.println(" Thank you for coming! ");
                System.exit(0);

                default:
                    if (choice > 2) {
                        System.out.println("\n  --> This is not a valid Menu Option! Please Select Another <--\n");
                        break;
                    }
                    if (choice < 1) {
                        System.out.println("\n  --> This is not a valid Menu Option! Please Select Another <--\n");
                        break;
                    }
            }
        }
}

}