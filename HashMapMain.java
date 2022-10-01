
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class HashMapMain {

    public static void main(String[] args) {

        boolean mainLoop = true;

        int choices;

        int num;

        Scanner input = new Scanner(System.in);
        char choices1;
        Map<Integer, Integer> array = new HashMap<Integer, Integer>();

        array.put(0, 5);
        array.put(1, 10);
       array.put(2, 15);
        array.put(3, 20);
       array.put(4, 25);

        while (true) {
            System.out.println("____________________________________________\n");
            System.out.println("             LC'S Age Recorder \n");

            System.out.println("____________________________________________\n");
            System.out.println("User: \n");
            String user = input.nextLine();
            System.out.println("Welcome, " + user);
            System.out.println("____________________________________________\n");



            System.out.println("Recorder Menu: ");

            System.out.print("1.) Add\n");
            System.out.print("2.) Remove\n");
            System.out.print("3.) Display\n");
            System.out.print("4.) Clear\n");
            System.out.print("5.) Logout\n");
            System.out.print("\nEnter Your Menu Choice: ");

            choices = input.nextInt();
            Iterator iter = array.entrySet().iterator();

            switch (choices) {

                case 1:
              
                    do {

                        for (int i = 0; i < 1; i++) {
                            int numb, count = 0;

                            System.out.print("Enter age you want to add:");
                            Integer a = input.nextInt();

                            for (int p = 2; p <= (a / 2); p++) {
                                if ((a % p) == 0) {
                                    count++;
                                    break;
                                }
                            }

                            if ((count == 0) && (a != 1)) {
                                System.out.println(
                                        a + " Not allowed, add another age number!");
                                System.out.print("Enter age number you want to add:");
                                a = input.nextInt();
                            } else {
                                System.out.println(a + " age is added to the list");
            System.out.println("____________________________________________\n");
                            }
                            System.out.print("Enter age you want to add:");
                            Integer b = input.nextInt();

                            for (int p = 2; p <= (b / 2); p++) {
                                if ((b % p) == 0) {
                                    count++;
                                    break;
                                }
                            }

                            if ((count == 0) && (b != 1)) {
                                System.out.println(
                                        b + " Not allowed, add another age number!");
                                System.out.print("Enter age NumberFormatException you want to add:");
                                b = input.nextInt();
                            } else {
                                System.out.println(b + " value is added to the list");
            System.out.println("____________________________________________\n");
                            }
                            array.put(a, b);

                        }

                        for (Entry<Integer, Integer> m : array.entrySet()) {
                            System.out.println(m.getKey() + " " + m.getValue());
                        }

                        System.out.println("Do You Want To Continue( Y/ N(Return exit) )");
                        choices = input.next().charAt(0);
                    } while (choices == 'Y' || choices == 'y');

                    break;

                case 2:
                        
                    System.out.println("Age Record");
            System.out.println("____________________________________________\n");
                    for (int i = 0; i < 1; i++) {

                        System.out.println("Age = " + array);
                    }

                    do {
                        System.out.print("Enter Index Ages you want to remove: ");
                        int i = input.nextInt();

                        if (i >= 0 && i < array.size()) {
                            System.out.print(" Index Number " + i + " Successfully removed!\n");
                            array.remove(i);
                            System.out.println(array);
                        } else {
                            System.out.print("Invalid Index! Pleasecheck the maximum number of Index. \n");
                        }

                        System.out.println("Do You Want To Continue(Y/N)");
                        choices1 = input.next().charAt(0);
                    } while (choices1 == 'Y' || choices1 == 'y');

                    break;

                case 3:

                    do {
                        // Display number list

                        System.out.println(array.toString());

                        System.out.println("Do You Want To Continue( Y/ N )");
                        choices1 = input.next().charAt(0);
                    } while (choices1 == 'Y' || choices1 == 'y');

                    break;

                case 4:
                    System.out.println("Age Record");
            System.out.println("____________________________________________\n");
                    for (int i = 0; i < 1; i++) {

                        System.out.println("Age = " + array);

                    }

                    do {
                        System.out.print(" To clear Age record , Type 1: ");
                        int i = input.nextInt();
                        int a = 1;

                        if (i == a) {
                            System.out.print(" Successfully REMOVED/ clear all in the record!\n");
                            array.clear();
                            System.out.println("Empty record");
                        } else {
                            System.out.print("Unable to clear the record!\n");

                        }
                        System.out.println("Type to exit..: )");

                        choices1 = input.next().charAt(0);
                    } while (choices == 'Y' || choices == 'y');
                    break;

                case 5:
                    System.out.println("Logging out from the Program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid Menu Option! Please Select Another");
                    break;

            }

        }

    }

}
