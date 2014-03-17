package applications;

public class NumberOfOnes {

	public int numberofones(int num) {// O(m), m is the number of 1s,worst case
										// m=n
		int count = 0;
		while (num != 0) {
			num = num & (num - 1);// a little faster
			count++;
		}
		return count;
	}

	public int numberofones2(int num) {// O(n),num of bits of Integer
		int count = 0;
		while (num != 0) {
			if ((num & 1) == 1)
				count++;
			num = num >>> 1;
		}
		return count;
	}
}
