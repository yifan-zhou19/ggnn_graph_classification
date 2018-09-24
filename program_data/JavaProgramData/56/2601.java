package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 100)
		{
			b = a / 10;
			c = a - (b * 10);
			a = 10 * c + b;
			System.out.printf("%d\n", a);
		}
		else if (a < 1000)
		{
			b = a / 100;
			c = (a - 100 * b) / 10;
			d = (a - 100 * b - 10 * c);
			a = 100 * d + 10 * c + b;
			System.out.printf("%d\n", a);
		}
		else if (a < 10000)
		{
			b = a / 1000;
			c = (a - 1000 * b) / 100;
			d = (a - 1000 * b - 100 * c) / 10;
			e = a - 1000 * b - 100 * c - 10 * d;
			a = 1000 * e+100 * d + 10 * c + b;
			System.out.printf("%d\n", a);
		}
		else if (a < 100000)
		{
			b = a / 10000;
			c = (a - 10000 * b) / 1000;
			d = (a - 10000 * b - 1000 * c) / 100;
			e = (a - 10000 * b - 1000 * c - 100 * d) / 10;
			f = a - 10000 * b - 1000 * c - 100 * d - 10 * e;
			a = 10000 * f + 1000 * e+100 * d + 10 * c + b;
			System.out.printf("%d\n", a);
		}

	}
}

