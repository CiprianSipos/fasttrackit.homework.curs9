package ro.fasttrackit.curs9.inheritance;
public class Parent {
    public String publicString;
    protected int protectedInt;
    int defaultInt;
    private String  privateString;

    public Parent(String name){
        this.publicString =name;
    }
    public void publicMethod(){
        System.out.println("Parent public method");
    }
    protected void protectedMethod(){
        System.out.println("Parent protected method");
    }
    void defaultMethod(){
        System.out.println("Parent default method");
    }
    private void privateMethod(){
        System.out.println("Parent private method");
    }
}
