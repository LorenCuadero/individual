import java.io.*;
import java.util.*;

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
    System.out.println(
        "____________________________________________________________________________\n");
    System.out.println("                           LC's Banking Program \n");
    System.out.println(
        "____________________________________________________________________________\n");
        
        while(true){
        System.out.println("Menu: ");
        
        act1.add("1.) Deposite \n");
        act1.add("2.) Withdraw \n");
        act1.add("3.) Check Balance \n");
        act1.add("4.) View Account Number \n");
        act1.add("5.) Logout \n");
        System.out.println(act1.toString());
        int choice = keyboard.nextInt();
        switch(choice){
        
        case 1:
                List<Record> act = new ArrayList<Record>();
                          System.out.println("How many times will you deposite? ");
                          int numObj = keyboard.nextInt();
  
        
       for(int a=0; a<numObj; a++){ 
           
           try{
        System.out.println("Index Number " + a + " - Name : ");
            keyboard.nextLine();
        name = keyboard.nextLine();
             try{
        System.out.println("Index Number " + a + " - Amount : ");
                amount = keyboard.nextDouble();
                if (amount < 0){
                    throw new ErrorException();
                }
            } catch(ErrorException e) {
                System.exit(0);            
                
            }
            Record acct1 = new Record(name, accountNum, amount);
             act.add(acct1);
        
        
        }     

            
          
        catch (Exception e) {
          break;
        
       }}

   default:
        }}
  }

}
