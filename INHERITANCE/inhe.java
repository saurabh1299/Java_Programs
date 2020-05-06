class shape
{
int length,breadth,side;

shape(int l,int b)
{
length=l;
breadth=b;
}

void square()
{
int area;
area=(side*side);
System.out.println(area);
}

void volume()
{
int volume;
volume=6*(side*side);
System.out.println(volume);
}
}


class rectangle extends shape
{
int length1,breadth1;

rectangle(int len,int bre,int l,int b)

length=l;
breadth=b;
length1=len;
breadth1=bre;


void rectangle1()
{
int area;
area=length*breadth;
System.out.println(area);
}

}

class multilevel_inheritance
{
public static void main(String args[])
{
shape view=new shape(2,4);
view.square();
view.volume();
rectangle sb=new rectangle(3,2,3,4);
sb.rectangle1();
}
}