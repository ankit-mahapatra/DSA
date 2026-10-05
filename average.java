public class average {
    public static void main(String[] args) {
        int [ ] arr = {1, 2, 4, 4, 5, 6, 6, 5};
        int sum = 0;
        for(int i= 0; i< arr.length; i++){
        sum = sum + arr[i];
        }
        int average = sum/ arr.length;
        System.out.println(average);
    }
}
