public class insertion {
    public static void main(String[] args) {

        int[] arr = new int[6];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 40;
        arr[3] = 50;
        arr[4] = 60;

        int position = 3;
        int element = 30;

        for (int i = arr.length - 1; i >= position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position - 1] = element;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}