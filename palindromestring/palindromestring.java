package palindromestring;

public class palindromestring {
    public static void main(String[] args) {
        String str = "KATAK";
        String rev = "";


        for(int i = str.length()- 1; i >= 0 ; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not a palindrome");
        }
    }
}
