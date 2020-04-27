class A
{
    static int i = 1111;
 
    static
    {
        i = i-- - --i;
    }
 
    {
        i = i++ + ++i;
    }
}
 
class B extends A
{
    static
    {
        i = --i - i--;
    }
 
    {
        i = ++i + i++;
    }
}
 
public class MainClass
{
    public static void main(String[] args)
    {
        B b = new B();
 
        System.out.println(b.i);
        String s = "ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5; 
        
        System.out.println(s);
        int i = 10 + + 11 - - 12 + + 13 - - 14 + + 15;
        
        System.out.println(i);
    }
}