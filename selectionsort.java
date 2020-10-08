

public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7};
        for (int i = 0; i < arr.length-1; i++) {
            int smallest=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) smallest = j;
            }
            swap(arr, i, smallest);
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = 0;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}