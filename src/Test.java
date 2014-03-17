import applications.NumberOfOnes;
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

		NumberOfOnes noo = new NumberOfOnes();
		System.out.println(noo.numberofones(8));

		tfban.swapWithoutTmp(3, 1);
		tfban.swapWithoutTmp2(3, 1);

		int[] sn = { 3, 1, 4, 4, 2, 1, 3 };
		System.out.println(tfban.singleNumber(sn));
	}

}
