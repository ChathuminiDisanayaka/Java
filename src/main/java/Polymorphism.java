public class Polymorphism {

    public static void main(String args[]){
       S obj = new S();
       obj.show();
       obj.show(10);

        System.out.println("Call class T");
        T obj1 = new T();
        obj1.show();
        obj1.show(20);
   }

}

class S
{
    //method overloading, early binding, static binding, compile time polymorphism
    public void show(){
        System.out.println("Hi show in A");
    }
    public void show(int i){
        System.out.println("Hi"+i);
    }
}
class T extends S //method overriding,late binding,dynamic binding, runtime polymorphism
{
    public void show(){
        System.out.println("Hi show in B");
    }
}
