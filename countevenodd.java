public class countevenodd{
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 8,6, 7, 23,56,78,99,44,1234556,23456,22229};
        int counteven  = 0;
        int countodd = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                counteven ++;
            }
            else{
                countodd++;
            }
        }
        System.out.println(" The even number counts are: "+ counteven);
        System.out.println("The odd number count are: "+ countodd);
    }
}