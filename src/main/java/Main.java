//initial class
public class Main {
    //this is a class variable
    static String race;
    //main method
    public static void main(String[] args) {
        //has his own class
        class Dog {
            //These are instance variables
            String breed;
            int age;
            String color;


            //these are methods
            void barking() {
                //this is local variable
                String Loud;
            }

            void hungry() {
            }

            void sleeping() {
            }

        }
    }
    //Constructor example
    public static class Puppy1 {
        String name;
        public Puppy1() {
        }
        public Puppy1(String name) {
            // This constructor has one parameter, name.
            this.name = name;
            System.out.println("Passed Name is :" + name );
        }
    }
}
