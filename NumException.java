public class NumException extends Exception{
          public NumException(String message){
                    super(message);
          }
          public void errorExc(){
                    System.out.println("Error Message: Invalid Amount!");
          } 
          public void errorNum(int a){
                    System.out.println("Error Message: Not a number!");
          }
}
