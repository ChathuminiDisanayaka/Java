public class Final {

    public static void main(String[] args){
        final int i;
        i=6;
        //i++;
        System.out.println(i);

        AT obj = new AT(6);
        obj.show();
    }

}

class AT{
    private int x;//instance variable

    public AT(int x){ //local
        this.x=x; //this catch the current instance
    }

    public void show()
    {
        System.out.println("x is "+x);
    }
}
