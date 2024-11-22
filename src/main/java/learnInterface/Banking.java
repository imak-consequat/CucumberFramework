package learnInterface;

public interface Banking {
/**
 * 
 * @param name
 * @param sal1
 * @param sal2
 * @return
 */
	public double savingsAccount(String name, double income1, double income2 );
	/**
	 * 
	 * @param name
	 * @param income1
	 * @param income2
	 * @return
	 */
	public double currentAccount(String name, double income1, double income2 );
}
