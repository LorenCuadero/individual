import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListMain {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    ArrayList<String> lang = new ArrayList<>();

    boolean mainLoop = true;

    int choice;
    System.out.println("\n              Welcome to LC's Snack Bar Ordering System");
    System.out.println("____________________________________________________________________________\n");
    System.out.println("What is your name? ");
    String name = input.nextLine();
    System.out.println("Hi, " + name.toUpperCase() + "!");
    System.out.println("____________________________________________________________________________\n");

    while (true) {
      System.out.println("Menu: \n ");
      lang.add("1.) Coffee \n ");
      lang.add("2.) Juice \n ");
      lang.add("3.) Cakes \n ");
      lang.add("4.) Bread \n ");
      lang.add("5.) Munchkin \n ");
      lang.add("6.) Exit \n ");
      lang.add("7.) View Updates \n");
      lang.add("8.) Remove All \n");
      for (int i = 0; i < 8; i++) {

        System.out.println(lang.get(i));
      }
      System.out.print("\nEnter Your Order [Ex. 1] :  ");

      choice = input.nextInt();

      switch (choice) {

        case 1:
          System.out.println("\nOrder: " + lang.get(0));

          System.out.println("\nQuantity: ");
          int adNuml = input.nextInt();
          int price = 50 * adNuml;
          System.out.println("----------------------------------------------------------------------------");

          System.out.println(name.toUpperCase()
              + "'s Order: \n----------------------------------------------------------------------------\n"
              + lang.get(0) + "\nQuantity: " + adNuml + "\nBill: P " + price
              + "\n----------------------------------------------------------------------------\n");
          break;

        case 2:
          System.out.println("\nOrder: " + lang.get(1));

          System.out.println("\nQuantity: ");
          int adding = input.nextInt();
          int price1 = 60 * adding;
          System.out.println("----------------------------------------------------------------------------");

          System.out.println(name.toUpperCase()
              + "'s Order: \n----------------------------------------------------------------------------\n"
              + lang.get(1) + "\nQuantity: " + adding + "\nBill: P" + price1
              + "\n----------------------------------------------------------------------------\n");
          break;
        case 3:
          System.out.println("\nOrder: " + lang.get(2));

          System.out.println("\nQuantity: ");
          int adding1 = input.nextInt();
          int price11 = 99 * adding1;
          System.out.println("----------------------------------------------------------------------------");

          System.out.println(name.toUpperCase()
              + "'s Order: \n----------------------------------------------------------------------------\n"
              + lang.get(2) + "\nQuantity: " + adding1 + "\nBill: P" + price11
              + "\n----------------------------------------------------------------------------\n");
          break;

        case 4:
          System.out.println("\nOrder: " + lang.get(3));

          System.out.println("\nQuantity: ");
          int adding11 = input.nextInt();
          int price111 = 48 * adding11;
          System.out.println("----------------------------------------------------------------------------");

          System.out.println(name.toUpperCase()
              + "'s Order: \n----------------------------------------------------------------------------\n"
              + lang.get(3) + "\nQuantity: " + adding11 + "\nBill: P" + price111
              + "\n----------------------------------------------------------------------------\n");
          break;

        case 5:
          System.out.println("\nOrder: " + lang.get(4));

          System.out.println("\nQuantity: ");
          int adding112 = input.nextInt();
          int price1112 = 48 * adding112;
          System.out.println("----------------------------------------------------------------------------");

          System.out.println(name.toUpperCase()
              + "'s Order: \n----------------------------------------------------------------------------\n"
              + lang.get(3) + "\nQuantity: " + adding112 + "\nBill: P" + price1112
              + "\n----------------------------------------------------------------------------\n");
          break;

        case 6:
          System.out
              .println("Exiting Program...\nThank you for your for coming, " + name.toUpperCase() + "! Come again!");
          System.exit(0);
          break;
        case 7:
          System.out.println("\nRemoved from Menu: " + lang.set(4, "5.) Cookies \n"));
          System.out.println("\nUpdated Menu: \n" + lang);
          break;

        case 8:

          System.out.println("\nAre you sure to remove all Menu? [ --> Type 0 if No, Type 1 if Yes <-- ]");
          int men = input.nextInt();
          if (men == 1) {
            System.out.println("Removing All Menu...");
            lang.clear();
            System.out.println("Menu: " + lang);
            System.out.println("____________________________________________________________________________\n");
            System.out.println("                    LC's Snack Bar Ordering System");
            System.out.println("____________________________________________________________________________\n");

            break;
          }
          if (men > 1) {
            System.out.println("____________________________________________________________________________\n");
            System.out.println("                               Invalid Input!\n");
            System.out.println("____________________________________________________________________________\n");
            break;

          }
          if (men < 0) {
            System.out.println("____________________________________________________________________________\n");
            System.out.println("                               Invalid Input!\n");
            System.out.println("____________________________________________________________________________\n");
            break;

          }

        default:
          if (choice > 8) {
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
