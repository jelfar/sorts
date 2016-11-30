import java.util.Random;
public class Selection {
    //http://www.algolist.net/Algorithms/Sorting/Selection_sort
    public static void selectionSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
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
        selectionSort(arr1);
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
        selectionSort(arr2);
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arr2[i] + " ");
        }

    }

}
