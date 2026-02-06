package facade;

public class TestFacade {

	public static void main(String[] args) {
		Car car = new Car();
		
		CarFacade carFacade = new CarFacade(car, 12345, "šara");
		System.out.println(carFacade.startTheCar());

	}

}
