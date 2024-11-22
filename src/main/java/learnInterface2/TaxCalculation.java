package learnInterface2;

public interface TaxCalculation {
/**
 * 
 * @param name
 * @param amount1
 * @param amount2
 * @return
 */
	public double  addIncome(String name, double amount1, double amount2);
	/**
	 * 
	 * @param name
	 * @param amount1
	 * @param amount2
	 * @return
	 */
	public double  reduceIncome(String name, double amount1, double amount2);
	/**
	 * 
	 */
	public void  publichValue();
}
