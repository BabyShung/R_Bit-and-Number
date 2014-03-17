package applications;

public class TricksForBitsAndNumbers {

	/**
	 * check if two ints are the same, by XOR -> return 0 if bits are the same,
	 * else other numbers
	 */
	public boolean checkTwoIntWithoutComparison(int a, int b) {

		int c = a ^ b;
		if (c == 0)
			return true;
		else
			return false;
	}

	/**
	 * round a number without using any "<" ">" "=="
	 */
	public int roundANumberWithoutComparison(double a) {
		int r = (int) (a + 0.5);
		return r;
	}

	/**
	 * swap without tmp
	 */
	public void swapWithoutTmp(int a, int b) {
		System.out.println(a + " and " + b);
		a = a ^ b;
		b = b ^ a;
		a = b ^ a;
		System.out.println(a + " and " + b);
	}

	public void swapWithoutTmp2(int x, int y) {
		System.out.println(x + " and " + y);
		x -= y;
		y += x; // y gets the original value of x
		x = (y - x); // x gets the original value of y

		System.out.println(x + " and " + y);
	}

	/**
	 * Given an array of integers, every element appears twice except for one.
	 * Find that single one.
	 */
	public int singleNumber(int[] A) {
		int res = 0;
		for (int i = 0; i < A.length; i++) {
			res = res ^ A[i];
		}
		return res;
	}

}
