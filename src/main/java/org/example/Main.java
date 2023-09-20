package org.example;

/**
 * Data Types in Java (Primitive Data Types)
 * Ref: GeeksforGeeks website - see the table showing types
 */

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Data Types - Primitive Data Types");

        System.out.println("Primitive Types: boolean, char, byte, short, int, long, float, double");

        // boolean - allows ONLY true or false as values

        boolean switchIsOn = true;

        switchIsOn = false;

        boolean isMarried = true;

        if(isMarried)   // same as: if(isMarried == true)
            System.out.println("Person is married.");
        else
            System.out.println("Person is NOT married");

        // byte - a numeric value -128 to +127

        byte b = -128;  // binary : 10000000  in Two's Compliment

        // b = b - 1;  // caution! danger of overflow/underflow (wrap around)

        b = (byte)(b-1); // a 'cast' is required to overcome integer division

        System.out.println("Byte b : " + b);

        b = 0b0000_1111; // binary literal, can use "_" to make it more readable

        System.out.println("Byte b 0b0000_1111 : " + b);

        // char - to store a single Character (stored in 2 bytes in Java (in Unicode format))

        char c = 'a';  // note single quotes for a char  (double quotes for a String)

        System.out.println("The character in variable c is: " + c);

        c = '8';

        // int - to store integer values (whole numbers) - 32 bits (4 bytes)

        int y = -2147483648;  // largest negative number

        y = y - 1; // causes Underflow - 'wraps around' to the largest positive int value (two's compliment)

        System.out.println("Underflow - Integer x: " + y);

        int x = 2147483647; // largest positive value - ~two billion - not large enough for world population

        x = x + 1;  // causes overflow (caution!) - Java does NOT warn us !!!

        System.out.println("Overflow - Integer x: " + x);

        // long integer variable - very large number (but not large enough for many cases)

        long l = 9223372036854775807L;  // maximum long value for a 64-bit (8 bytes) integer

        // floating point numbers are numbers with decimal parts e.g 34.5082, 0.05

        float f = 3.45f;

        double d = 3.45;    // default fraction value is 'double' in Java

        d = 0.0000456;

        // There are numbers (fractions) that are too small to be represented in a double, see below.

        // and there can be rounding errors near the limits.

        // Insert another zero to make the decimal smaller, and the IDE will highlight a problem

        d = 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004;

        // Is the output what you expected? Or, has it a rounding error?

        System.out.println("Value of double d :" + d);

        // Currency values should be stored as long integer types (in cent with no decimals),

        // or BigInteger objects for accuracy with very large numbers.
    }
}