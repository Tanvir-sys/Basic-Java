public class string {

    public String str1;
    public void string(String str){

        this.str1=str;
        int x=str.length();

        System.out.println("length of  string : " +x);
        for(int i=x;i>=0;i--){
            System.out.println(str1[i]);
            
        }

       


    }
    public static void main(String[] args) {
        string s=new string();
        s.string("gftrhgf");

    }

}
