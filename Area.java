class Area{
 void area(){
	System.out.println("Area  is 0");
}
}


class Square extends Area{
void area(int x){
	if(x==0)
	{
	super.area();
	}
	else
	{
	int area=x*x;
	System.out.println("Area of Square is"+area);
	}
}
}


class Rectangle extends Area{
 void area(int x,int y){
 	if(x==0||y==0)
 	{
 		super.area();
 	}
 	else
 	{
	int area=x*y;
	System.out.println("Area of rectangle is"+area);
}
}
}

class Main{

public static void main(String []args){

Square squ=new Square();
Rectangle rec=new Rectangle();

squ.area(0);
rec.area(3,4);

}
}