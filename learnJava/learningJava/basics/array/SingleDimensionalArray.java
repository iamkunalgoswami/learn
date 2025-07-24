package learnJava.learningJava.basics.array;

import java.util.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        /**
         * Declaring the Array
         */
        int[] array = new int[5];
        int[] array1, array2;
        array1 = new int[5];
        array2 = new int[5];
        int array3[] = new int[5];
        /**
         * Initializing the Array
         * 
         * i = 0, because the start index of any array is 0 (zero)
         * i < 5, because I have initialized every array of size (length to be precise)
         * as 5
         * Not initializing the array3, will print the default value of an array
         */
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 10);
            array1[i] = (int) (Math.random() * 10);
            array2[i] = (int) (Math.random() * 10);
            // array3[i] = (int) (Math.random() * 10);
        }

        /**
         * Printing the Array
         * 
         * i = 0, because the start index of any array is 0 (zero)
         * i < array.length, because I have initialized every array of the same size
         * (length to be precise) i.e. as 5
         * We will print the default value of an array
         * Observe that we have used variable i twice in the same method, local variable
         * and its scope (block scope)
         */
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            System.out.print(array1[i] + " ");
            System.out.print(array2[i] + " ");
            System.out.print(array3[i] + " ");
            System.out.println();
        }
        /**
         * Printing the Array
         * 
         * Using Enhanced for Loop
         */
        System.out.println("Printing the Array - Using Enhanced for Loop");
        for (int i : array1) {
            System.out.print(i + " ");
        }
        
        System.out.println("\nPrinting the Copy of Array1 \nusing arraycopy(Object src, int srcPos,Object dest, int destPos,int length) method of System Class");
        /*
        * Copy an array
        * The below method belongs to class System
        * public static void arraycopy(Object src, int srcPos,Object dest, int destPos,int length)
        */
        int lengthOfArray1 = array.length;
        int[] copyOfArray1 = new int[lengthOfArray1];
        System.arraycopy(array1, 0, copyOfArray1, 0, lengthOfArray1);
        for (int i : copyOfArray1) {
            System.out.println(i);
        }
        System.out.println("\nPrinting the Copy of Array1 \nusing copyOfRange(copyFrom, startIndex, endIndex) method of Array Class");
        int[] copy2OfArray1 = Arrays.copyOfRange(array1,0,lengthOfArray1);
        for (int i : copy2OfArray1) {
            System.out.println(i);
        }
    }
}
