public class Inheritance
{
    public static void main(String arg[])
    {
        AB obj = new AB();
        obj.num1=5;
        obj.num2=4;
        obj.sum();
        System.out.println(obj.res);

        CD obj1 = new CD();
        obj1.num1=5;
        obj1.num2=4;
        obj1.sum();
        System.out.println(obj1.res);
        obj1.dif();
        System.out.println(obj1.res);

        EF obj2 = new EF();
        obj2.num1=10;
        obj2.num2=4;
        obj2.sum();
        System.out.println(obj2.res);
        obj2.dif();
        System.out.println(obj2.res);
        obj2.mul();
        System.out.println(obj2.res);
    }
}
class AB //Parent, Super,Base
{
    int num1,num2,res=0;
    public void sum()
    {
        res = num1+num2;
    }

}

class CD extends AB //Single level inheritance //Child,sub,derive class
{
    public void dif(){
        res = num1 - num2;
    }
}

class EF extends CD //Multi level inheritance //Child,sub,derive class
{
    public void mul()
    {
        res = num1*num2;
    }
}
