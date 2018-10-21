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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 10)
		{
			System.out.printf("%d",n);
		}
		else if (n >= 10 && n < 100)
		{
			a = n / 10;
			b = n % 10;
			System.out.printf("%d%d",b,a);
		}
		else if (n >= 100 && n < 1000)
		{
			a = n / 100;
			b = (n - 100 * a) / 10;
			c = n % 10;
			System.out.printf("%d%d%d",c,b,a);
		}
		else if (n >= 1000 && n < 10000)
		{
			a = n / 1000;
			b = (n - 1000 * a) / 100;
			c = (n - 1000 * a - 100 * b) / 10;
			d = n % 10;
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else
		{
			a = n / 10000;
			b = (n - 10000 * a) / 1000;
			c = (n - 10000 * a - 1000 * b) / 100;
			d = (n - 10000 * a - 1000 * b - 100 * c) / 10;
			e = n % 10;
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		return 0;
	}
}

