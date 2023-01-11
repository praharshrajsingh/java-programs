class Car{
int speed = 80;
public Car()
	{
		System.out.println("Class Car");
	}
	public void vehicleType()
	{
		System.out.println("Vehicle Type: Car");
	}
}
class Maruti extends Car{
	public Maruti()
	{
		System.out.println("Class Maruti");
	}
	public void brand()
	{
		System.out.println("Brand: Maruti");
	}
	public void speed()
	{
		System.out.println("Max: 90Kmph");
	}
}
public class Maruti800 extends Maruti{

	
	public void speed()
	{
		System.out.println("parent class speed ="+super.speed);
		
		System.out.println("Max: 80Kmph");
	}
	public static void main(String args[])
	{
		Maruti800 obj=new Maruti800();
		obj.vehicleType();
		obj.brand();
		obj.speed();
	}
}
