public class Activity2Class<DataType> {

  private String namesString;
  private DataType obj;

  public Activity2Class(String nameString) {
    this.namesString = nameString;
  }

  public String getName(String nameString) {
    return nameString;
  }

  public String getObj() {
    return namesString;
  }

  public Activity2Class(DataType obj) {
    this.obj = obj;
  } // constructor

  public DataType getObject() {
    return this.obj;
  }
}
