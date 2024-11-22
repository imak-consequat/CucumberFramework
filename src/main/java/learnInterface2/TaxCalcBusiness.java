package learnInterface2;

public class TaxCalcBusiness implements TaxCalculation{

	@Override
	public double addIncome(String name, double amount1, double amount2) {
		System.out.println("Name of the Business person : "+ name);
		double resultOfAddIncome= amount1+amount2;
			return resultOfAddIncome;
			}

	@Override
	public double reduceIncome(String name, double amount1, double amount2) {
		System.out.println("Name of the Business person : "+ name);
		double resultOfReduceIncome= amount1+amount2;
			return resultOfReduceIncome;
	}

	@Override
	public void publichValue() {
		// TODO Auto-generated method stub
		
	}

	

}
