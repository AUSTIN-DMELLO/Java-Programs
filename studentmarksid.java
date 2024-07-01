import java.util.Scanner;
class Studentmarksid {
    String name;
    int marks;
    Studentmarksid(){
    name="name";
    marks=10;
    }
    Studentmarksid(int marks,String name1)
    {
    name=name1;
    marks=mark1;
    }
    
    void printData()
    {
    System.out.println(name+" "+marks);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks and name");
        int a = sc.nextInt();
        sc.nextLine();
        String x = sc.nextLine();
        System.out.println("Enter Marks and name");
        int a1 = sc.nextInt();
        sc.nextLine();
        String y = sc.nextLine();
        Studentmarksid obj1 = new Studentmarksid(a, x);
        Studentmarksid obj2 = new Studentmarksid(a1, y);
        obj1.printData();
        obj2.printData();
    }
}

