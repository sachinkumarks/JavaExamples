package MethodOverLoading;

public class MethodOverLoading {

	void add(int a) {
		System.out.println(a);

	}

	void add(int a, char c) {
		System.out.println(a + " " + c);

	}

	public void add(int a, float f) {
		System.out.println(a + " " + f);

	}

	void add(long l, Double d) {
		System.out.println(l + " " + d);

	}

	void add(float f, double d) {
		System.out.println(f + " " + d);

	}

	void add(int a, short s) {
		System.out.println(a + " " + s);

	}

	class demo {
		public static void main(String[] args) {
			int a = 10;
			int b = 10;
			short s = 11;
			long l = 100l;
			char c = 'a';
			float f = 55.5f;
			double d = 233.444;
			System.out.println(a);
			System.out.println(b + b);
			System.out.println(s + c);
			System.out.println(l + f);
			System.out.println(d + f);

		}
	}

}
