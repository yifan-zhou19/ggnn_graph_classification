package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 10)
		{
			System.out.printf("%d",a);
		}
		if (a >= 10 && a < 100)
		{
			int b;
			int c;
			b = a / 10;
			c = a - 10 * b;
			System.out.printf("%d",10 * c + b);
		}
		if (a >= 100 && a < 1000)
		{
			int b;
			int c;
			int d;
			b = a / 100;
			c = (a - 100 * b) / 10;
			d = a - 100 * b - 10 * c;
			System.out.printf("%d",100 * d + 10 * c + b);
		}
		if (a >= 1000 && a < 10000)
		{
			int b;
			int c;
			int d;
			int e;
			b = a / 1000;
			c = (a - 1000 * b) / 100;
			d = (a - 1000 * b - 100 * c) / 10;
			e = a - 1000 * b - 100 * c - 10 * d;
			System.out.printf("%d",1000 * e+100 * d + 10 * c + b);
		}
		if (a >= 10000 && a < 100000)
		{
			int b;
			int c;
			int d;
			int e;
			int f;
			b = a / 10000;
			c = (a - 10000 * b) / 1000;
			d = (a - 10000 * b - 1000 * c) / 100;
			e = (a - 10000 * b - 1000 * c - 100 * d) / 10;
			f = a - 10000 * b - 1000 * c - 100 * d - 10 * e;
			System.out.printf("%d",10000 * f + 1000 * e+100 * d + 10 * c + b);
		}
		return 0;
	}

}

