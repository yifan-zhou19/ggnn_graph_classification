package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a <= 9)
		{
			System.out.printf("%d",a);
		}
		else if (a >= 10 && a <= 99)
		{
				b = a % 10;
				c = (a - b) / 10;
				System.out.printf("%d%d",b,c);
		}
		else if (a >= 100 && a <= 999)
		{
			b = a % 10;
			c = ((a - b) / 10) % 10;
			d = (a - b - 10 * c) / 100;
			System.out.printf("%d%d%d",b,c,d);
		}
		else if (a >= 1000 && a <= 9999)
		{
			b = a % 10;
			c = ((a - b) / 10) % 10;
			d = ((a - b - 10 * c) / 100) % 10;
			e = (a - b - 10 * c - 100 * d) / 1000;
			System.out.printf("%d%d%d%d",b,c,d,e);
		}
		else if (a >= 10000 && a <= 99999)
		{
			b = a % 10;
			c = ((a - b) / 10) % 10;
			d = ((a - b - 10 * c) / 100) % 10;
			e = ((a - b - 10 * c - 100 * d) / 1000) % 10;
			f = (a - b - 10 * c - 100 * d - 1000 * e) / 10000;
			System.out.printf("%d%d%d%d%d",b,c,d,e,f);
		}
		return 0;
	}
}

