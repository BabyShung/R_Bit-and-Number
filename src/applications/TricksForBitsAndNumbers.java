package applications;

public class TricksForBitsAndNumbers {

	public boolean checkTwoIntWithoutComparison(int a, int b) {

		int c = a ^ b;
		if (c == 0)
			return true;
		else
			return false;
	}

	public int roundANumberWithoutComparison(double a) {
		int r = (int) (a + 0.5);
		return r;
	}

}
