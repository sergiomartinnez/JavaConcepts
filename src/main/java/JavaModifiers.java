public class JavaModifiers {

    //access modifiers
    public String publicstring = "visible for everyone";
    protected String protectedString = "variable visible for the package and other subclasses packages";
    String defaultstring = "this is a variable only for package";
    private String publicString = "this is a variable only for the same class";

    //non access modifiers
    //static variables does not use this.
    public static String staticString = "This is an independ variable";
    //static method is independent
    public static void staticMethod(){
        System.out.println(staticString);
    }
    //final variable for variables that will not change
    final int value = 10;
    //final method cannot be overridden by any subclasses
    public final void changeName() {
        // body of method
    }

}
//abstract class can never be instantiated. If a class is declared as abstract then the sole purpose is for the class to be extended.
abstract class AbstractExample {
    //abstract method is a method declared without any implementation
    abstract void m();   // abstract method
}
