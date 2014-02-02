package BIt;

/**
 * Common bit facts:
 * 
 * x ^ 0s = x, 
 * x & 0s = 0, 
 * x | 0s = x, 
 * x ^ 1s = ~x, 
 * x & 1s = x, 
 * x | 1s = 1s, 
 * x ^  x = 0, 
 * x & x = x,
 * x | x = x.
 * 
 * 
 * @author haozheng
 * 
 */

public class BitOperations {

	// get bit
	boolean gitBit(int num, int i) {
		return ((num & (1 << i)) != 0);
	}

	// set bit
	int setBit(int num, int i) {
		return num | (1 << i);
	}

	// clear bit
	int clearBit(int num, int i) {
		int mask = ~(1 << i);
		return num & mask;
	}

	int clearBitsMSBthroughI(int num, int i) {
		int mask = (1 << i) - 1;
		return num & mask;
	}

	int clearBitsIthrough0(int num, int i) {
		int mask = ~((1 << (i + 1)) - 1);
		return num & mask;
	}

	// update bit
	int updateBit(int num, int i, int v) {
		int mask = ~(1 << i);
		return (num & mask) | (v << i);
	}
}
