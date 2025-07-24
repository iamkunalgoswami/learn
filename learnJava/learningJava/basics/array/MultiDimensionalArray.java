package learnJava.learningJava.basics.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /**
         * Declaring the Array
         */
        int[][] array = new int[3][3];
        int[][] array1, array2;
        array1 = new int[3][3];
        array2 = new int[3][3];
        int array3[][] = new int[3][3];

        /**
         * Initializing the Array
         * 
         * i -> for rows && j -> for column
         * i,j = 0, because the start index of any array is 0 (zero)
         * i,j < 3, because I have initialized every array of size (length to be
         * precise)
         * as 3
         * Not initializing the array3, will print the default value of an array
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = (int) (Math.random() * 10);
                array1[i][j] = (int) (Math.random() * 10);
                array2[i][j] = (int) (Math.random() * 10);
                // array3[i] = (int) (Math.random() * 10);
            }
        }
        /**
         * Printing the Array
         * 
         * i = 0, because the start index of any array is 0 (zero)
         * i < array.length, because I have initialized every array of the same size
         * We will print the default value of an array
         */
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        /**
         * Printing the Array
         * 
         * Using Enhanced for Loop
         */
        System.out.println("Printing the Array - Using Enhanced for Loop");
        for (int i[] : array1) {
            for (int js : i) {
                System.out.print(js + " ");
            }
            System.out.println();
        }

        /**
         * **************
         * Jagged Array *
         * **************
         * 
         * Initializing and Printing
         */
        System.out.println("* Jagged Array *");
        int[][] jaggedArray = new int[3][];
        for (int i = 0; i < jaggedArray.length; i++) {
            int randomValue = (int) (Math.random() * 10) + 1;
            jaggedArray[i] = new int[randomValue];
        }
        // Initializing
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) Math.random() * 10;
            }
        }
        // Printing
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
