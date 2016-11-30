import java.util.Random;
//http://www.algolist.net/Algorithms/Sorting/Quicksort
public class Quick {
    public static void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

    static int partition(int arr[], int left, int right)
    {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
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
        quickSort(arr1, 0, arr1.length-1);
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
        quickSort(arr2, 0, arr2.length-1);
        for(int i = 0; i < SIZE_OF_ARR; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}
