package sorting;

public class practiceq {

    public static void bubble(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selection(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int current = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[current] < arr[j]) {
                    current = j;
                }
            }

            int temp = arr[current];
            arr[current] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertion(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = curr;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int arr1[] = {4, 2, 3, 5, 8, 1};
        bubble(arr1);
        print(arr1);

        int arr2[] = {3, 6, 8, 9, 1};
        insertion(arr2);
        print(arr2);

        int arr3[] = {6, 4, 2, 7, 3, 9};
        selection(arr3);
        print(arr3);
    }
}