package ExceptionHandling;

public class toStringMethod {
    private int age;
    public String name;
    public toStringMethod(int a,String n){
        age= a;
        name=n;

    }
    public String toString(){
        return "age="+age+", name ="+name;
    }
}
class UseToSTringMethod{
    public static void main(String[] args) {
        toStringMethod obj= new toStringMethod(24,"Bharti");
        System.out.println(obj);
    }

}
