import java.util.*;

class NameException extends Exception {
    public NameException(String message) {
        super(message);
    }

    public void errorExc(String message) {
        System.out.println("This input in not valid: " + message);
    }
}

public class Act3Indiv {
    // Continue with the activity from Monday. Use the same repository.
    // 1. Create a class with at least 2 properties, and also your own Exception
    // class.
    // 2. In the Main Class, there will be a number input that will ask the user how
    // many objects to create.
    // 3. Put the objects inside an array of objects created, you can use ArrayList
    // and use the class that you created as the object.
    // 4. Ask for user input for the values of the properties (ex. Name, Age for
    // Person class). All the objects created must have values.
    // 5. Think of two scenarios to prevent and implement try catch. (ex. Name
    // should be string or should not contain special characters etc.)

    // You can create or use the Main class used from Monday. Submit with the
    // repository link.

    public static void main(String[] args) {
        List<Act3IndivClass> classes = new ArrayList<Act3IndivClass>();
        // Act3IndivClass act3 = new Act3IndivClass();
        Scanner input = new Scanner(System.in);

        System.out.println("              Friends Recorder\n");
        System.out.println("____________________________________________\n");
        System.out.println("Name: ");
        String name = input.nextLine();
        System.out.println("\nHi, " + name);
        System.out.println("\n____________________________________________\n");
        System.out.println("Do you want to record your friends list? [0 = no or 1 = yes] \n");
        Integer names = input.nextInt();
        System.out.println("____________________________________________\n");

        while (true) {
            switch (input.nextLine()) {
                case "1":

                    if (classes.contains("")) {
                        System.out.println("Add a friends' name to the list: ");
                        String naming = input.nextLine();
                        System.out.println("Add a friends' age to the list: ");
                        Integer age = input.nextInt();
                        // classes.add(naming, age);
                        for (int a = 0; a < classes.size(); a++) {

                            System.out.println(a);
                        }
                        if (names < 0 || names > 1) {

                        }

                    }
                case "2":

                default:
                    try {
                        throw new NameException(null);
                    } catch (NameException e) {
                        e.errorExc(null);
                    }

            }

        }

    }
}
