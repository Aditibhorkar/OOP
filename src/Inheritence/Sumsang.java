package Inheritence;

public class Sumsang extends SmartPhone {

	
	boolean fingerPrintSensor;
	String androidVersion;
	
	public Sumsang(String manufacturer, String model, String os, double price,boolean fingerPrintSensor,
	String androidVersion) {
		super(manufacturer, model, os, price);
		// TODO Auto-generated constructor stub
		this.fingerPrintSensor=fingerPrintSensor;
		this.androidVersion=androidVersion;
	}

	public void useSumsangPay()
	{
		System.out.println("Using Samsumg pay");
	}
	
	public void display()
	{
		System.out.println("Manufacturer : "+manufacturer);
		System.out.println("Model :"+model);
		System.out.println("OS :"+os);
		System.out.println("Price :"+price);
		System.out.println("Finger print sensor :"+fingerPrintSensor);
		System.out.println("Version :"+androidVersion);
		System.out.println("**************************************");
	}
	
}
