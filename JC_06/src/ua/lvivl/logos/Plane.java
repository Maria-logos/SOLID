package ua.lvivl.logos;

public abstract class Plane {
	public Plane(double length, double height, double width) {
		super();
		this.length = length;
		this.height = height;
		this.width = width;
	}
	private double length;
	private double height;
	private double width;
	public void EngineStart()
	{
		System.out.println("enging starting, left:" + (Math.random()*68 + 20) + " seconds" ); ;
	}
	public void EngineTakeOff()
	{
		System.out.println("Plane is taking off, plane will fly "  + Math.random()*1000 + " km");
	}
	public void isLanding()
	{
		System.out.println("Plane is landing...");
	}
	double getLength() {
		return length;
	}
	void setLength(double length) {
		this.length = length;
	}
	double getHeight() {
		return height;
	}
	void setHeight(double height) {
		this.height = height;
	}
	double getWidth() {
		return width;
	}
	void setWidth(double width) {
		this.width = width;
	}
}
