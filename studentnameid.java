import java.util.Scanner;
class Student2{
String name;
int id;
Student2(int id1,String name1)
{
name=name1;
id=id1;
}

void printData()
{
System.out.println(name+" "+id);
}
}
public class studentnameid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id and name");
        int a = sc.nextInt();
        String x = sc.nextLine();
        System.out.println("Enter id and name");
        int a1 = sc.nextInt();
        String y = sc.nextLine();
        Student2 obj1 = new Student2(a, x);
        Student2 obj2 = new Student2(a1, y);
        obj1.printData();
        obj2.printData();
    }
}
