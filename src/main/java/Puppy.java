public class Puppy {
    //hacemos una variable de instancia
    String name;
    public Puppy(String name){
        //llamamos la variable y la guardamos como name
        this.name = name;
        System.out.println("passed by name: " + name);
    }

    public static void main(String[] args) {
        Puppy puppy = new Puppy("tommy");
        //imprimimos el name guardado
        System.out.println(puppy.name);
        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);
        System.out.println(t1.x + t2.x);
    }

    //constructor example
    static class MyClass {
        int x;

        // Following is the constructor
        MyClass(int i) {
            x = i;
        }
    }
}
