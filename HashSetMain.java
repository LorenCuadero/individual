import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;
public class HashSetMain{

public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    ArrayList<String> lang = new ArrayList<>();
    ArrayList<String> lang1 = new ArrayList<>();
    HashSet<Integer> has = new HashSet<>();

    boolean mainLoop = true;
    int lain = 0;
    int choice;
        System.out.println("\n                      LC'S Price Generator");
        System.out.println("____________________________________________________________________________\n");
        System.out.println("User Name: ");
        String name = input.nextLine();
        System.out.println("Welcome, " + name.toUpperCase() + ".");
        System.out.println("____________________________________________________________________________\n");

     
    while(true){
        System.out.println("\nMenu: \n ");
        lang.add("1.) Pricing \n");
        lang.add("2.) Log Out \n");
        has.add(10);
        has.add(100);
        has.add(150);
        has.add(140);
        has.add(1440);
        has.add(1560);
        has.add(130);
        has.add(130);
        has.add(130);
        
             

         for (int i=0; i<2; i++){
          
          System.out.println(lang.get(i));
         }
        System.out.print("\nEnter Your Choice [Ex. 1] :  ");

        choice = input.nextInt();
        
        
    switch(choice){
        case 1:
               
             System.out.println("\nWant to add the pricing? [ --> Type 0 if No, Type 1 if Yes <-- ]");
            int men = input.nextInt();
            if (men == 1){
                
                 do{
                     System.out.println("Current Prices: " + has);
                 System.out.println("\nReally want to add Price? [ --> Type 0 if No, Type 1 if Yes <-- ]");
                    int con = input.nextInt();
                    if(con == 1){ 
                             System.out.println("Add Price: ");
                            lain = input.nextInt();
                            has.add(lain);
                            System.out.print("You added: " + lain);
                          if(has.contains(lain)){
                                   System.out.print("\n  --> Price Already Exists\n");
                                 break;
                               } 
                                            System.out.print("Price list: " + has);

                    break;
                                
                    }         
                    if(con > 1){
                             System.out.println("____________________________________________________________________________\n");
                             System.out.println("                               Invalid Input!\n");
                             System.out.println("____________________________________________________________________________\n");

                    
                    break;
                    }    if(con < 0){
                             System.out.println("____________________________________________________________________________\n");
                             System.out.println("                               Invalid Input!\n");
                             System.out.println("____________________________________________________________________________\n");

                    
                        break;
                    }
                    
                   
  
                    } while(has.contains(lain));{
                          
                        //   if(has.contains(lain)){
                        //           System.out.print("\n  --> Price Already Exists\n");
                        //          break;
                        //       } 
                         }
                    
                    
            }
           
            if (men > 1){
             System.out.println("____________________________________________________________________________\n");
             System.out.println("                               Invalid Input!\n");
             System.out.println("____________________________________________________________________________\n");
             break;
    
            } if (men < 0){
             System.out.println("____________________________________________________________________________\n");
             System.out.println("                               Invalid Input!\n");
             System.out.println("____________________________________________________________________________\n");
             break;
    
            }
            
                


            break;
    case 2:
     System.out.println("Logging out to Program...\nUser: " + name.toUpperCase());
        System.exit(0);
    break;
   

    default :
          
            if (choice > 2){
             System.out.println("\n  --> This is not a valid Menu Option! Please Select Another <--\n");
             break;
            }
             if(choice < 1)
             {
              System.out.println("\n  --> This is not a valid Menu Option! Please Select Another <--\n");
             break;
             }
      
            
    }
      }


 }
}
  





