package _1_basics;

public class Array {

    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        // create an array of integers
        anArray = new int[10];

        anArray[0] = 100; // initialize first element
        anArray[1] = 200; // initialize second element
        anArray[2] = 300; // and so forth

        System.out.println("Element 1 at index 0: " + anArray[0]);
        System.out.println("Element 2 at index 1: " + anArray[1]);
        System.out.println("Element 3 at index 2: " + anArray[2]);

        int[] anArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);

        System.out.println(anArray.length);

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.println(coffee + " ");
        }
    }
}
