package learnInterface;

public class RunnerClass extends SvAccount{
	public static void main(String[] args) {
				SvAccount exe = new SvAccount();
				System.out.println("Addition of income : "+exe.add(5000,3000));
				System.out.println("****");
				System.out.println("Subtraction of income : "+exe.subtract(5000,3000));
				System.out.println("****");
				System.out.println("Division of income : "+exe.div(5000,3000));
				System.out.println("****");
				System.out.println("Multiplication of income : "+exe.multi(500,300));
				System.out.println("****");
				exe.savingsAccount("PremKumar", 5000,2000);
				System.out.println("****");
				exe.currentAccount("ArulMurugan", 6000,2000);
				System.out.println("****");
				exe.overallbalance();
	
		
	}

}
