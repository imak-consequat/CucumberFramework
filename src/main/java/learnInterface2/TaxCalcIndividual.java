package learnInterface2;

public class TaxCalcIndividual implements TaxCalculation{

	@Override
	public double addIncome(String name, double amount1, double amount2) {
	System.out.println("Name of the Individual : "+ name);
	double resultOfAddIncome= amount1+amount2;
		return resultOfAddIncome;
	}

	@Override
	public double reduceIncome(String name, double amount1, double amount2) {
		System.out.println("Name of the Individual : "+ name);
		double resultOfReduceIncome= amount1-amount2;
			return resultOfReduceIncome;
	}

	@Override
	public void publichValue() {
	System.out.println("Result pubslished for Individual");
	}

	
	//own methods of that class can also be included
	
	public void ownMethodOfIndivi()
	{
		System.out.println("own method created in the class of tax calc  individual ");
	}
}
