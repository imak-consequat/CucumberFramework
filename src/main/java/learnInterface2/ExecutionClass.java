package learnInterface2;

public class ExecutionClass {

	public static void main(String[] args) {
		TaxCalcIndividual indiv = new TaxCalcIndividual();
		System.out.println("Added income of individual is : "+indiv.addIncome("Ashok", 9999.59, 0.41));
		System.out.println("Reduced  income of individual is : "+indiv.reduceIncome("Kumar", 50000.55,30000.55));
		indiv.publichValue();
		indiv.ownMethodOfIndivi();
		
		TaxCalculation tc=new  TaxCalcIndividual();
		
		tc.addIncome("kunal", 500,200);
		tc.reduceIncome("kuldeep",300,100);
		tc.publichValue();

		
		TaxCalcBusiness tbus = new TaxCalcBusiness();
		tbus.addIncome("Murugan",1000, 10000);
		tbus.reduceIncome("PalaniAndi", 0, 0);
		tbus.publichValue();
		
	}

}
