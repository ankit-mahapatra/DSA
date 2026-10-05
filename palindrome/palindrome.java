package palindrome;
public class palindrome{
    public static void main(String[] args) {
        int num = 321;
        int orginal = num;
        int rev = 0;

        while(num > 0){
            int digit =  num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        if( rev == orginal){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}