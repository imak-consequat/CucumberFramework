package learnInterface;

public interface Calculator {
	/**
	 * 
	 * @param income1
	 * @param income2
	 * @return
	 */
	public double add( double income1, double income2);
	/**
	 * 
	 * @param income1
	 * @param income2
	 */
	public double multi( double income1, double income2) ;
	/**
	 * 
	 * @param income1
	 * @param income2
	 */
	public double subtract( double income1, double income2);
	/**
	 * 
	 * @param income1
	 * @param income2
	 */
	public double div( double income1, double income2);

}
