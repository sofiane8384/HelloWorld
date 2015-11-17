
public class TestFraction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction fraction = new Fraction(2,4);
		Fraction fraction2 = new Fraction(5,7);
		try {
			Fraction fraction3 = fraction.addition(fraction2);
			System.out.println(fraction + "+" + fraction2 + "="+ fraction3);
		} catch (FractionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
