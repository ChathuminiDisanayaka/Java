//OOP 1 - Encapsulation

public class Encapsulation {

    public static void main(String args[]){

        /*
         * Encapsulation
         */
        A obj = new A();
        obj.setI(5);
        System.out.println(obj.getI());

        A e1 = new A();
        e1.setEmpId(3);
        e1.setEmpName("Navin");

        A e2 = new A();
        e2.setEmpId(4);
        e2.setEmpName("Kamal");

        System.out.println(e1.getEmpId()+e1.getEmpName());
        System.out.println(e2.getEmpId()+e2.getEmpName());

    }
}

class A{

    /**
     * Encapsulation
     */
    private int i;
    public void setI(int j){
        i=j;
    }
    public int getI(){
        return i;
    }

    private int empId;
    private String empName;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }
}
