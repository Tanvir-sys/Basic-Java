package Currency_converter;

public class palindromeString {
    private String s;
    public String rev=null;
    public String orgnStr=s;
    public void stringreverse(String s){
        this.s=s;
        
        for(int i=s.length();i>=0;i--){
            rev=rev+s.charAt(i);
        }
       System.out.println(rev);
       if(orgnStr==rev){ System.out.println("Palindrome");}else {System.out.println("not Palindrome");}

    }


    public static void main(String[] args) {
        palindromeString p= new palindromeString();
        p.stringreverse("ATTA");


    }

    
    
}
