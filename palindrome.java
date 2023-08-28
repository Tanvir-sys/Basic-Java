public class palindrome {

    private int  num ;

     public palindrome(int n){
        this.num=n;
        int rev=0;
        while(num!=0){
            rev=rev*10 + num%10;
            num=num/10;

        }
        System.out.println(rev);
        if(rev==num){
            System.out.println("palindrome Number");

        }else {
            System.out.print("Not Palindrome ");
        }
     }
    

public static void main(String[] args) {
    palindrome p =new palindrome(12345);

}



    
}
