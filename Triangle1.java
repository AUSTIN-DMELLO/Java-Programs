import java.lang.*;
class Point{
int x;
int y;

public Point(int x,int  y){
this.x=x;
this.y=y;
System.out.print("Point x is"+ x + "and point y is"+ y);
}
}
class Line{
Point p1;
Point p2;
double distance(){
double d=Math.sqrt(((p2.x-p1.x)*(p2.x-p1.x))+( (p2.y-p1.y)*(p2.y-p1.y)));
return d;
}
public Line(Point p1,Point p2){
 this.p1=p1;
 this.p2=p2;
 }
 }
 class Triangle{
 Line l1;
 Line l2;
 Line l3;
 double Per(Line l1,Line l2,Line l3){
 double perimeter=l1.distance()+l2.distance()+l3.distance();
 return perimeter;
 }
 
 public double Triangle(Line l1,Line l2,Line l3){
 this.l1=l1;
 this.l2=l2;
 this.l3=l3;
 }
}
class Overall{
public static void main (String args[]){
Point p1=new Point(2,3);
Point p2=new Point(4,5);
Point p3=new Point(6,2);
Line AB =new Line(A,B);
Line BC=new Line(B,C);
Line AC=new Line(A,C);
Triangle triangle= new Triangle(l1,l2,l3);
System.out.println("The perimeter of traingle is"+ Per());
}
}

