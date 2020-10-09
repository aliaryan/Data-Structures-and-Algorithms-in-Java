public class Main {

    public static void main(String[] args) {
        int[] arr = {16, 19, 15, 2, 5, 3, 7};
        for (int gap = arr.length / 2; gap > 0; gap=gap/2) {
            for (int i = gap; i < arr.length; i++) {
                int new_element = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > new_element; j-=gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = new_element;

            }
        }


        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}