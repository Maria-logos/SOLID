package ua.lvivl.logos;

public class Main {

	public static void main(String[] args) {
		Su27 planeSu27 = new Su27(50, 10, 20, 1500, "Green");
		planeSu27.EngineStart();
		planeSu27.EngineTakeOff();
		System.out.println("Plane is moving left for " + PlaneManagment.MoveLeft() + " km");
		System.out.println("Plane is moving right for " + PlaneManagment.MoveRight() + " km");
		System.out.println("Plane is moving up for " + PlaneManagment.MoveUp() + " km");
		System.out.println("Plane is moving down for " + PlaneManagment.MoveDown() + " km");
		planeSu27.StellsTechnology();
		planeSu27.NuclearStrike();
		planeSu27.TurboSpeed();
		planeSu27.isLanding();
	}

}
