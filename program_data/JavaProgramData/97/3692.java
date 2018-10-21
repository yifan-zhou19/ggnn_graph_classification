package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int D;
		int E;
		int I;
		int a;
		int b;
		int c;
		int d;
		int e;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		A = n / 100;
		a = n % 100;
		B = a / 50;
		b = a % 50;
		C = b / 20;
		c = b % 20;
		D = c / 10;
		d = c % 10;
		E = d / 5;
		e = d % 5;
		I = e;
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",A,B,C,D,E,I);
		return 0;
	}
}

