package test;

class Test_Math extends Test_ {
	
	/*
	 * Computes the remainder operation on two arguments as prescribed by the IEEE
	 * 754 standard. The remainder value is mathematically equal to f1 - f2 × n,
	 * where n is the mathematical integer closest to the exact mathematical value
	 * of the quotient f1/f2, and if two mathematical integers are equally close to
	 * f1/f2, then n is the integer that is even. If the remainder is zero, its sign
	 * is the same as the sign of the first argument. Special cases:
	 * 
	 * If either argument is NaN, or the first argument is infinite, or the second
	 * argument is positive zero or negative zero, then the result is NaN.
	 * 
	 * If the first argument is finite and the second argument is infinite, then the
	 * result is the same as the first argument.
	 * 
	 * https://stackoverflow.com/questions/1971645/is-math-ieeeremainderx-y-equivalent-to-xy
	 * 
	 */

	public static double IEEEremainder(double x, double y) {
		if (y == 0 || Double.isNaN(x) || Double.isInfinite(y) && !Double.isInfinite(x))
			return Double.NaN;

		double modxy = x % y;

		if (modxy == 0) 
			return modxy; // may be -0

		double rem = modxy - (Math.abs(y) * Math.signum(x));

		if (Math.abs(rem) == Math.abs(modxy)) {
			double div = x / y;
			return (Math.abs(Math.round(div)) > Math.abs(div) ?  rem : modxy);
		}
		return (Math.abs(rem) < Math.abs(modxy) ? rem: modxy);
	}

	public static void main(String[] args) {
		double[] list = new double[] { 
				3, 2, -1, 
				4, 2, 0, 
				10, 3, 1, 
				11, 3, -1, 
				27, 4, -1, 
				28, 5, -2, 
				17.8, 4, 1.8000000000000007, 
				17.8, 4.1, 1.4000000000000021, 
				-16.3, 4.1, 0.09999999999999787, 
				17.8, -4.1, 1.4000000000000021, 
				-17.8, -4.1, -1.4000000000000021 
		};

		double val = 0;
		for (int i = 0; i < list.length; i += 3) {
				val = Math.IEEEremainder(list[i], list[i + 1]);
				System.out.println( list[i] + "/" + list[i + 1] + " = " + list[i + 2] + " got " + val);
				assert (val == list[i + 2]);
		}
		
		System.out.println("Test_Math OK");
	}

}