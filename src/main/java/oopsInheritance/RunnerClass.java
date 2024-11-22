package oopsInheritance;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheelers toow=new TwoWheelers();

		toow.bicycle(); // specific characteristics of Two wheeler class
		toow.gearBike(); // specific characteristics of Two wheeler class
		toow.scooter(); //specific characteristics of Two wheeler class
		toow.passengerModes(); // inherited from grand parent class 'Transport'
		toow.goodsMode(); // inherited from grand parent class 'Transport'
		toow.depots(); // inherited from parent class 'Roadways'
		toow.payToll();// inherited from parent class 'Roadways'
		
	}

}
