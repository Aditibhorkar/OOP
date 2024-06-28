package Inheritence;

public class SmartPhone {
	
	String manufacturer;
	String model;
	String os;
	double price;
	
	
	
	public SmartPhone(String manufacturer, String model, String os, double price) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.os = os;
		this.price = price;
	}

	public void makeCall()
	{
		System.out.println("Making call");
	}
	
	public void sendMsg()
	{
		System.out.println("Message sending");
	}
	
	public void takePicture()
	{
		System.out.println("Taking picture");
	}

}
