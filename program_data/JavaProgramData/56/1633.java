package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = Math.floor(n / 10000);
		b = Math.floor((n - 10000 * a) / 1000);
		c = Math.floor((n - 10000 * a - 1000 * b) / 100);
		d = Math.floor((n - 10000 * a - 1000 * b - 100 * c) / 10);
		e = n - 10000 * a - 1000 * b - 100 * c - 10 * d;
		if (a != 0 && b != 0 && c != 0 && d != 0)
		{
			x = 10000 * e+1000 * d + 100 * c + 10 * b + a;
		}
		if (a == 0 && b != 0 && c != 0 && d != 0)
		{
			x = 1000 * e+100 * d + 10 * c + b;
		}
		if (a == 0 && b == 0 && c != 0 && d != 0)
		{
			x = 100 * e+10 * d + c;
		}
		if (a == 0 && b == 0 && c == 0 && d != 0)
		{
			x = 10 * e+1 * d;
		}
		if (a == 0 && b == 0 && c == 0 && d == 0)
		{
			x = e;
		}
		System.out.printf("%d\n",x);
	}


}

