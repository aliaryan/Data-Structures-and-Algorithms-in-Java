public class Main {

    public static void main(String[] args) {
        int[] arr = {16,19,15,2, 5, 3, 7};
        for (int i = 1; i < arr.length ; i++) {
            int new_element = arr[i];
            int j;
            for (j = i; j > 0 && arr[j - 1] > new_element; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j]=new_element;

        }


        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
