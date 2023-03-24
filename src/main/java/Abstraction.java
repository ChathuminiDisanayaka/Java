public class Abstraction {

    public static void main(String[] args){
         MPhone obj = new SPhone();//Cant instantiate the abstract class
         obj.call();
         obj.move();
         obj.dance();
         obj.cook();
    }
}

abstract class MPhone //abstract class
{
    public void call(){
        System.out.println("Calling");
    }

    //Abstract methods
    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class RPhone extends MPhone //when extending abstract class need to define the methods inside the abstract class, if u cant u have make this also abstract class
{
    public void move(){
        System.out.println("Moving");
    }
}

class SPhone extends RPhone // Have to define remainig undefined methods if this is the last method without abstract
{
    public void dance(){
        System.out.println("Dancing");
    }

    public void cook(){
        System.out.println("Cooking");
    }
} // this is concrete class
