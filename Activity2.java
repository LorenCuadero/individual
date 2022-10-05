public class Activity2 {

  public static void main(String[] args) {
    Activity2Class<Integer> iObj = new Activity2Class<Integer>(21);
    System.out.println(iObj.getObject());

    Activity2Class<String> sObj = new Activity2Class("Lorenfe Cuadero");
    System.out.println(sObj.getObj());

    System.out.println(
      "Hi, my name is " +
      sObj.getObj() +
      " and I am " +
      iObj.getObject() +
      " years old."
    );
  }
}
