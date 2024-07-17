public class DataTypes {
    
    public static void main(String[] args) {
        // Java is atyped language which means that we have to define that what type of variable we are declaring like int, char, float, double, string etc.

        // there are two types of datatypes in java
        // 1. Premitive datatypes - byte, short, char, boolean, int, long, float, double

        // 2. Non-premitive datatypes - String, Array, Class, Object, Interface 

        byte b = 8;
        System.out.println("byte: " + b);
        System.out.println("Size of byte is: 1 byte");

        char ch = 'r';
        System.out.println("character: " + ch);
        System.out.println("Size of char is: 2 bytes");


        boolean value = true;
        System.out.println("boolean: " + value);
        System.out.println("Size of boolean is: 1 byte");


        float price = 20.5f;
        System.out.println("float: " + price);
        System.out.println("Size of float is: 4 byte");


        int number = 40;
        System.out.println("integer: " + number);
        System.out.println("Size of integer is: 4 byte");


        long l = 783264723;
        System.out.println("long: " + l);
        System.out.println("Size of long is: 8 byte");


        double d = 34566.78;
        System.out.println("double: " + d);
        System.out.println("Size of double is: 8 byte");


        short s = 250;
        System.out.println("short: " + s);
        System.out.println("Size of short is: 2 byte");


    }
}
