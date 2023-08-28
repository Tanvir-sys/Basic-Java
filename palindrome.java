public class palindrome {

    private int  num ;

     public palindrome(int n){
        this.num=n;
        int rev=0;
        int orgnnum=num;

        while(num!=0){
            rev=rev*10 + num%10;
            num=num/10;
            

        }
        if(orgnnum==rev){
            System.out.println("palindrome Number");

        }else {
            System.out.print("Not Palindrome ");
    }
 
       
     }

   
      
    

public static void main(String[] args) {
    palindrome p =new palindrome(1221);

}



    
}
