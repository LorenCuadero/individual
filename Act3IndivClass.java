public class Act3IndivClass <Integer> {
    Integer object;
    String name;

    public Act3IndivClass(String name, Integer object) {
        this.name = name;
        this.object = object;

    }
    public Act3IndivClass(String name, String object){
        
    }
    public Integer getObject() {
        return object;
    }
    public void setObject(Integer object) {
       this.object = object;
    }
    public String toString() {
        return object.toString();
    }
    
}
