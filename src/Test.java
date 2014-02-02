import applications.TricksForBitsAndNumbers;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TricksForBitsAndNumbers tfban = new TricksForBitsAndNumbers();
		boolean cti = tfban.checkTwoIntWithoutComparison(30, 30);
		System.out.println(cti);
		int round = tfban.roundANumberWithoutComparison(9.8);
		System.out.println(round);
	}

}
