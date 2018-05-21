package test;

class Test_Or extends Test_ {

	public static void main(String[] args) {
		
		
		int pt = 0;
		int p = 3;
		int[] a = new int[] {1,2,3, 4, 5};
		a[2] |= 6; 
		a[p++] |= 6;
		a[pt++] |= 2;
		a[pt++] |= 4; 
		assert(pt == 2 && a[0] == 3 && a[1] == 6);
		
		// double array check
		byte[][] aa = new byte[][] { {0, 0, 0}, {1,2,3}};
		pt = 0;
		aa[pt++][1] += 5;
		aa[pt++][1] += (int) (pt + 5.0);
		pt = 0;
		aa[1][pt++] += 5;
		aa[1][pt++] += 5;
		assert(aa[0][1] == 5);
		assert(aa[1][1] == 14);
		 
	
		byte[][][] aaa = new byte[][][] {{{0, 0, 0}, {1,2,3}, {4, 5, 6}}};
		pt = 0;
		p = 0;
		aaa[p++][pt++][1] += 5;
		aaa[0][pt++][1] += (int) (pt + 5.0);
		pt = 0;
		aaa[0][1][pt++] += 5;
		assert(aaa[0][0][1] == 5);
		assert(aaa[0][1][0] == 6);
		assert(aaa[0][1][1] == 9);
		 
 
		// boolean[] test
		boolean[] aok = new boolean[200];
		
		aok[100] |= true; 
 		
		pt = 0;
		aok[pt++] |= true;
		assert(pt == 1 && aok[0] == true);

		// char[] test
		
		char[] cok = new char[3];
		pt = 0; 
		cok[0] = '\2';
		cok[pt++] |= 'a'; 
		// cok[$j$=pt++] = String.fromCharCode((cok[$j$]).$c()| 97);
		assert(pt == 1 && cok[0] == 'c');

		// byte array pointer increment test - with character encoding
		byte[] bok = new byte[] {'a', 2, 3, 4, 5};
		byte b = -128;
		pt = 0;
		bok[bok[++pt]] += 0;
		bok[bok[2]++] += 0;
		
		pt = 0; 
		bok[pt++] |= '\2';
		bok[pt++] = --b;
		assert(pt == 2 && bok[0] == 'c' && bok[1] == 127);
		bok[pt++] += b++; 
		assert(pt == 3 && bok[2] == -125 &&  b == -128);
		bok[pt++] += b++;
		assert(bok[3] == -124 && b == -127);
		
		
		// byte increment test
		b = 127; 
		int i = b++;
		assert(i == 127 && b==-128);
		b = -128; 
		i = --b;
		assert(i == 127 && b==127);
		b = -128;
		i = b--;
		assert(i == -128 && b==127);
		
		b = 127;
		b++;
		assert(b==-128);		
		--b;
		assert(b==127);		
		++b;
		assert(b==-128);		
		b--;
		assert(b==127);
		
		
		// byte shift tests
		
		b = 101;
		b <<= 2;
		assert(b == -108);
		b >>= 2;
		System.out.println("((byte)101 << 2) >>2 = " + b);
		assert(b == -27);

		b = 101;
		b = (byte) (b >>> 2);
		assert(b == 25);
		b = -101;
		b = (byte) (b >>> 2);
		System.out.println("((byte)-101 >>>2 = " + b);
		assert(b == -26);
		b = -1;
		b = (byte) (b >>> 2);
		System.out.println("((byte)-1 >>>2 = " + b);
		assert(b == -1);

		// int bit shifts
		i = -1;
		i = i >>> 2;
		System.out.println("(int)-1 >>> 2 = " + i);
		assert(i == 1073741823);

		i = -1;
		i >>= 2;
		System.out.println("(int)-1 >>= 2 = " + i);
		assert(i == -1);

		i = -1;
		i >>>= 2;
		System.out.println("(int)-1 >>>= 2 = " + i);
		assert(i == 1073741823);
		
		
		// character increment test
		char c = 'a';
		c++;
		c--;
		++c;
		--c;
		assert(c == 'a');

		i = c++;
		assert(i == 'a' && c == 'b');
		i = ++c;
		assert(i == 'c' && c == 'c');
		
		int count = 0;
		boolean ok = true;

		// note that |= is bitwise |, not logical ||

		ok |= (count++ == 0);
		ok |= (count++ == 0);
		
		System.out.println(count);
		assert (count == 2);
		
		ok = false;
		count = 0;
		// note that &= is bitwise &, not logical &&
		ok &= (count++ == 0);
		ok &= (count++ == 0);
		System.out.println(count);
		assert (count == 2);

		ok = true; 
		count = 0;
		ok = ok | (count++ == 0);
		ok = ok | (count++ == 0);		
		System.out.println(count);
		assert (count == 2);

		ok = true; 
		count = 0;
		ok = ok || (count++ == 0);
		ok = ok || (count++ == 0);		
		System.out.println(count);
		assert (count == 0);

		// difference between & and &&
		
		ok = false;
		count = 0;
		ok =  ok & (count++ == 0);
		ok =  ok & (count++ == 0);
		System.out.println(count);
		assert (count == 2);

		ok = false;
		count = 0;
		ok =  ok && (count++ == 0);
		ok =  ok && (count++ == 0);
		System.out.println(count);
		assert (count == 0);
		
		// quick test for double using += directly

		double line1[] = new double[20];
		int i2 = 1;
	    line1[i2+1] += Math.sin(3);

		
		System.out.println("Test_Or OK");
	}

}