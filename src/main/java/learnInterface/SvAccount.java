package learnInterface;

public class SvAccount implements Banking , Calculator{

	@Override
	public double add(double income1, double income2) {
		System.out.println("income 1 amount is rs: "+income1);
		System.out.println("income 2 amount is rs: "+income2);
		double sum_of_income=income1 + income2;
		return sum_of_income;
	}

	@Override
	public double multi(double income1, double income2) {
		System.out.println("income 1 amount is rs: "+income1);
		System.out.println("income 2 amount is rs: "+income2);
		double multi_of_income=income1 * income2;
		return multi_of_income;
	}

	@Override
	public double subtract(double income1, double income2) {
		System.out.println("income 1 amount is rs: "+income1);
		System.out.println("income 2 amount is rs: "+income2);
		double sub_of_income=income1 - income2;
		return sub_of_income;
	}

	@Override
	public double div(double income1, double income2) {
		System.out.println("income 1 amount is rs: "+income1);
		System.out.println("income 2 amount is rs: "+income2);
		double div_of_income=income1 / income2;
		return div_of_income;
	}

	@Override
	public double savingsAccount(String name, double income1, double income2) {
		System.out.println("Name of the savings account holder is : "+ name);
		System.out.println("savings account income 1 entry is : "+ income1);
		System.out.println("Savings acount income 2 entry is : "+ income2);
		double result_of_sav=income1+income2;
		return result_of_sav;
	}

	@Override
	public double currentAccount(String name, double income1, double income2) {
		System.out.println("Name of the Current account holder is : "+ name);
		System.out.println("Current account income 1 entry is : "+ income1);
		System.out.println("Current acount income 2 entry is : "+ income2);
		double result_of_cur=income1+income2;
		return result_of_cur;
	}

	public double overallbalance() {
		SvAccount sva = new SvAccount();
		double result_of_sav; double result_of_cur;
		result_of_sav=sva.savingsAccount("ashok", 5000, 2000);
		result_of_cur=sva.currentAccount("kumar", 6000,3000);
		double o_bal=result_of_sav+result_of_cur;
		return o_bal;
		
	}
	
}
