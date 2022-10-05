import java.util.*;
public class AnotherActivity {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("0 = Leah  Cuadero" + " 1 = Lorna Cuadero" + " 2 = Lorenfe Cuadero " + " 3 = Charlie Philip Cuadero" + " 4 = Cherel Cuadero" );
    System.out.println("Please enter chosen index: ");
    String ages[] = { "Leah", "Lorna" , "Lorenfe" , "Charlie", "Cherel"};
    int selection = input.nextInt();
    try {

      if(selection < 0  || selection > 4){
        input.close();
        throw new ErrorException("Error message when the exception is created!");
      }
      System.out.println( "Value of chosen index: " + ages[selection]);
      
      } catch (ErrorException e) {
        e.errorExc();
        System.exit(0);
    }
    input.close();
  }
}

