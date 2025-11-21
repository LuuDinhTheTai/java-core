package _1_basics._1_3_datatypes;

import java.util.ArrayList;

public class Main {

    public void variableDemo() {

        // Variable declaration
        int myVariable;
        byte myByte;
        short myShort;
        char myChar;
        int myInt;
        long myLong;
        float myFloat;
        double myDouble;
        Byte myByte1;
        Short myShort1;
        Character myChar1;
        Integer myInt1;
        Long myLong1;
        Float myFloat0;
        Double myDouble1;
        String myString1;

        // Variable assignment
        myByte   = 127;
        myFloat  = 199.99F;
        myString1 = "This is a text";

        // Variable reading
        float myFloat1 = 199.99F;
        float myFloat2 = myFloat1;           // right hand side value in assignment
        float myFloat3 = myFloat2 + 123.45F;  // as part of arithmetic expression
        System.out.println(myFloat3);        // as parameter in method call.

        // var
        String myVar1 = "A string!";
        var myVar2 = "A string!";
    }
}
