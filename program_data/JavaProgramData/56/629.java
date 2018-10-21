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
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead(null, 5);
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		if (x > 9999)
		{
			a = x / 10000;
			b = x / 1000 % 10;
			c = x / 100 % 10;
			d = x / 10 % 10;
			e = x % 10;
			y = 10000 * e+1000 * d + 100 * c + 10 * b + a;
			System.out.printf("%ld\n",y);
		}
		if (x > 999 && x <= 9999)
		{
			a = x / 1000;
			b = x / 100 % 10;
			c = x / 10 % 10;
			d = x % 10;
			y = 1000 * d + 100 * c + 10 * b + a;
			System.out.printf("%ld\n",y);
		}
		if (x > 99 && x <= 999)
		{
			a = x / 100;
			b = x / 10 % 10;
			c = x % 10;
			y = 100 * c + 10 * b + a;
			System.out.printf("%ld\n",y);
		}
			if (x > 9 && x <= 99)
			{
			a = x / 10;
			b = x % 10;
			y = 10 * b + a;
			System.out.printf("%ld\n",y);
			}
			if (x > 0 && x <= 9)
			{
			a = x;
			y = a;
			System.out.printf("%ld\n",y);
			}
	}
}

