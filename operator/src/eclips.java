
import java.util.*;
 
  class Shape extends Object
{
int radius;
 public Shape(int radius)
{
super();
this.radius=radius;
}
void display()
{
System.out.println("radius"+radius);
}
}
class Square1 extends Shape
{
int len;
public Square1(int radius,int len )
{
super(radius);
this.len=len;
}
void squarearea()
{
System.out.println("area of squre="+(radius*radius*len));
}
}
class eclips
{
public static void main(String args[])
{
Shape obj=new Shape(2);
obj.display();
obj.squarearea();
}
}


