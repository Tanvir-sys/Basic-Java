import java.util.Scanner;

public class string {

    public String str1;
    public String  str2;
     public  String rev="";

    public void string(String str, String str3){

        this.str1=str;
        this.str2=str3;
        str=str3;

        int x=str.length();
      
        

       System.out.println();
        for(int i=x-1;i>=0;i--){
         rev=rev+str.charAt(i);
            
        }
        System.out.println(rev);


       


    }
    public static void main(String[] args) {
        string s =new string ();
        
        System.out.println("Enter The word");
          s.str1 = "asdewe";
        

        
        
        

    }

}
