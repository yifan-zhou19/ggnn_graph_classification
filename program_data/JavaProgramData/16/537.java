package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int A;
		int B;
		int C;
		int D;
		int E;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 10000)
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		else if (n >= 1000 && n < 10000)
		{
			a = n / 1000;
			b = n / 100;
			c = n / 10;
			d = n % 10;
			A = d;
			B = c % 10;
			C = b % 10;
			D = a;
			System.out.print(A);
			System.out.print(B);
			System.out.print(C);
			System.out.print(D);
			System.out.print("\n");
		}
		else if (n >= 100 && n < 1000)
		{
			a = n / 100;
			b = n / 10;
			c = n % 10;
			A = c;
			B = b % 10;
			C = a;
			System.out.print(A);
			System.out.print(B);
			System.out.print(C);
			System.out.print("\n");
		}
		else if (n >= 10 && n < 100)
		{
			A = n % 10;
			B = n / 10;
			System.out.print(A);
			System.out.print(B);
			System.out.print("\n");
		}
		else
		{
			System.out.print(n);
			System.out.print("\n");
		}
	}
}

