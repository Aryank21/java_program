package javapkg;


public class AbstractShape
{
    public static void main(String[] args)
    {
      shape ss=new circle();
//        ss.display();
         ss=new rectangle() ;
         ss.display();
         ss.display();
    }
}
abstract class shape
{
    abstract void display();

}
class rectangle extends shape
{
    void display()
    {
        System.out.println("rectangle");
    }
}
class circle extends shape
{
    void display()
    {
        System.out.println("circle");
    }
}
