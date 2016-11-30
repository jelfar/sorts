import java.util.Random;
//http://www.algolist.net/Algorithms/Sorting/Insertion_sort
public class Insertion {
    public static void insertionSort(int[] arr) {
        int i, j, newValue;
        for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = newValue;
        }
    }

    public static void main(String[] args) {
        final int SIZE_OF_ARR = 100;
        final int RANGE_OF_NUMBERS = 1001;
        Random rand = new Random();

        int[] arr1 = new int[SIZE_OF_ARR];
        int[] arr2 = new int[SIZE_OF_ARR];

        //arr1
        int randomInt;
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            randomInt = rand.nextInt(RANGE_OF_NUMBERS);
            arr1[i] = randomInt;
        }
    
        System.out.println();
        System.out.print("Arr1: ");
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();
        System.out.print("Arr1 Sorted: ");
        insertionSort(arr1);
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arr1[i] + " ");
        }

        //arr2
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            randomInt = rand.nextInt(RANGE_OF_NUMBERS);
            arr2[i] = randomInt;
        }
    
        System.out.println();
        System.out.print("Arr2: ");
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        System.out.print("Arr2 Sorted: ");
        insertionSort(arr2);
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
