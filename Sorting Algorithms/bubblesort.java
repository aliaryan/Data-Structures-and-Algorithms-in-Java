public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }

            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = 0;
        if (a == b) {
            return;
        }
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}