public class Data_Types {
    public static void main(String[] args){
        int a = 10; // Integer data type
        long b = 100000L; // Long data type
        short c = 5; // Short data type
        byte d = 127; // Byte data type

        float e = 5.75f; // Float data type
        double f = 19.99; // Double data type
        char g = 'A'; // Character data type
        boolean h = true; // Boolean data type


        System.out.println("Integer: " + a);
        System.out.println("Long: " + b);
        System.out.println("Short: " + c);
        System.out.println("Byte: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Character: " + g);
        System.out.println("Boolean: " + h);
    
        
    }
}

// int : 4 bytes
// long : 8 bytes
// short : 2 bytes 
// byte : 1 byte
// float : 4 bytes
// double : 8 bytes
// char : 2 bytes
// boolean : 1 (but JVM can use 4 bytes for alignment)
// The size of the boolean type is not precisely defined in the Java Language Specification, but it is typically 1 byte in practice.

// RANGE OF DATA TYPES
// int: -2,147,483,648 to 2,147,483,647     i.e. (-2^31 to 2^31-1)
// long: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807    i.e. (-2^63 to 2^63-1)
// short: -32,768 to 32,767     i.e. (-2^15 to 2^15-1)
// byte: -128 to 127     i.e. (-2^7 to 2^7-1)
// float: 1.4E-45 to 3.4028235E38
// double: 4.9E-324 to 1.7976931348623157E308        
// char: 0 to 65,535 (Unicode characters)        
// boolean: true or false (not a numeric type, so no range)    
// The range of each data type is determined by its size in bytes and how many bits are used to represent the value.
// The Java Virtual Machine (JVM) may use different sizes for boolean values, but it is generally treated as a single bit in logical operations.



// NOTE: THEY ARE PRIMITIVE DATA TYPES.