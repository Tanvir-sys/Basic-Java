public class Animal{

    private String name;
    private int age ;
    private String  color;

    public Animal(){
        System.out.println("This Is animal Class");
    }

    public Animal(String name,int age ,String color){
        this.name=name;
        this.age=age;
        this.color=color;
        System.out.println("Name:" +name);
         System.out.println("Name:" +age);
          System.out.println("Name:" +color);
    }

    public void display(){
        
    }

    public static void main(String[] args) {
       Animal animal=new Animal("Dog",4,"white");
       //animal.Animal();
    }

}