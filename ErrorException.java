public class ErrorException extends Exception{

          public ErrorException(String message){
                    super(message);
          }
          public void errorExc(){
                    System.out.println("Error Message: There is no value on that index!");
          }
}
