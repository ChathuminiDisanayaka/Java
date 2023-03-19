public class Super {
    public static void main(String[] args){

        BS obj1 = new BS();
        BS obj2 =  new BS(5);

    }
}

class AS
{
    public AS(){
        System.out.println("in Const A");
    }

    public AS(int i){
        System.out.println("in Para const A");
    }

}
class BS extends AS
{
    public BS(){
        System.out.println("in Const B");
    }
    public BS(int i){
        //super(i);
        System.out.println("in Para const B");
    }

}