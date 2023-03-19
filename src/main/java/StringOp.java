import java.util.Locale;
import java.util.Scanner;

public class StringOp {

    public static void main(String[] args){
        String s1,s2;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter 2 strings: ");
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//
//        int l1 = s1.length();
//        int l2 = s2.length();
//        System.out.println("Length of String 1 is "+l1+"and length of String 2 "+l2);
//
//        String s3 = s1.concat(s2);
//        System.out.println("Result: "+s3);
//
//        s1= s1.toUpperCase(Locale.ROOT);
//        System.out.println(s1);

        Student s = new Student(1,"Rumesha");
        System.out.println(s);

    }
}

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }
}
