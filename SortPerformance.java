import java.util.Random;
public class SortPerformance {
    public static void main(String[] args) {
        //int SIZE_OF_ARR = 40000;
        //int SIZE_OF_ARR = 80000;
        //int SIZE_OF_ARR = 160000;
        int RANGE_OF_NUMBERS = 1001;
        Random rand = new Random();
        int[] arrUnsorted = new int[SIZE_OF_ARR];
        int[] arrSorted = new int[SIZE_OF_ARR];
        int[] arrReverse = new int[SIZE_OF_ARR];

        //Unsorted
        int randomInt;
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            randomInt = rand.nextInt(RANGE_OF_NUMBERS);
            arrUnsorted[i] = randomInt;
        }

        //Sorted
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            arrSorted[i] = i;
        }

        //Reverse
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            arrReverse[SIZE_OF_ARR - i - 1] = i;
        }

        /*
        System.out.print("Unsorted: ");
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arrUnsorted[i] + " ");
        }
        System.out.println();

        System.out.print("Sorted: ");
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arrSorted[i] + " ");
        }
        System.out.println();

        System.out.print("Reverse: ");
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arrReverse[i] + " ");
        }
        System.out.println();
        */

        long startTime, endTime, result; 
        //Insertion
        startTime = System.currentTimeMillis();
        Insertion.insertionSort(arrSorted);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Insertion sorted: " + result);

/*
        startTime = System.currentTimeMillis();
        Insertion.insertionSort(arrUnsorted);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Insertion unsorted: " + result);
        */


        /*
        startTime = System.currentTimeMillis();
        Insertion.insertionSort(arrReverse);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Insertion reverse: " + result);

        System.out.println();
        */

        /*
        //Selection
        startTime = System.currentTimeMillis();
        Selection.selectionSort(arrSorted);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Selection sorted: " + result);
        */

        /*
        startTime = System.currentTimeMillis();
        Selection.selectionSort(arrUnsorted);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Selection unsorted: " + result);
        */


        /*
        startTime = System.currentTimeMillis();
        Selection.selectionSort(arrReverse);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Selection reverse: " + result);

        System.out.println();
        */

        /*
        //Merge
        startTime = System.currentTimeMillis();
        Merge.mergeSort(arrSorted);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;
        
        System.out.println("Merge sorted: " + result);
        */

        /*
        startTime = System.currentTimeMillis();
        Merge.mergeSort(arrUnsorted);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Merge unsorted: " + result);
        */

        /*
        startTime = System.currentTimeMillis();
        Merge.mergeSort(arrReverse);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Merge reverse: " + result);

        System.out.println();
        */

        //Quick
        
        /*
        startTime = System.currentTimeMillis();
        Quick.quickSort(arrSorted, 0, SIZE_OF_ARR-1);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Quick sorted: " + result);

        startTime = System.currentTimeMillis();
        Quick.quickSort(arrUnsorted, 0, SIZE_OF_ARR-1);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Quick unsorted: " + result);

        startTime = System.currentTimeMillis();
        Quick.quickSort(arrReverse, 0, SIZE_OF_ARR-1);
        endTime = System.currentTimeMillis();
        result = endTime - startTime;

        System.out.println("Quick reverse: " + result);

        System.out.println();

        */
    }
}
