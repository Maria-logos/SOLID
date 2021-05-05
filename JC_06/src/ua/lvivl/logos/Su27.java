package ua.lvivl.logos;

public class Su27 extends Plane implements SpecialFeatures {
	private double maxSpeed;
	private String color;
	public Su27(double length, double height, double width, double maxSpeed, String color) {
		super(length, height, width);
		this.setMaxSpeed(maxSpeed);
		this.setColor(color);
	}

	@Override
	public void TurboSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Turbo Speed  " +  Math.random() + this.maxSpeed + " km");
	}

	@Override
	public void StellsTechnology() {
		// TODO Auto-generated method stub
		System.out.println("Plane isn't seen during " + Math.random() + " minutes");
	}

	@Override
	public void NuclearStrike() {
		// TODO Auto-generated method stub
		System.out.println("Nuclear Strike count " +  (Math.random() + 10)) ;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
