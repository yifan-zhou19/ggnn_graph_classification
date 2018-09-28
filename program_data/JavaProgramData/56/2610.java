package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 9999)
		{
			int a;
			int b;
			int c;
			int d;
			int e;
			a = n % 10;
			b = (n % 100 - a) / 10;
			c = (n % 1000 - 10 * b - a) / 100;
			d = (n % 10000 - 100 * c - 10 * b - a) / 1000;
			e = n / 10000;
			System.out.printf("%d%d%d%d%d\n",a,b,c,d,e);
		}
		else
		{
		if (n > 999)
		{
			int a;
			int b;
			int c;
			int d;
			a = n % 10;
			b = (n % 100 - a) / 10;
			c = (n % 1000 - 10 * b - a) / 100;
			d = n / 1000;
			System.out.printf("%d%d%d%d\n",a,b,c,d);
		}
		else
		{
		if (n > 99)
		{
			int a;
			int b;
			int c;
			a = n % 10;
			b = (n % 100 - a) / 10;
			c = n / 100;
			System.out.printf("%d%d%d\n",a,b,c);
		}
		else
		{
		if (n > 9)
		{
			int a;
			int b;
			a = n % 10;
			b = n / 10;
			System.out.printf("%d%d\n",a,b);
		}
		else
		{
			System.out.printf("%d\n",n);
		}
		}
		}
		}

		return 0;
	}
}

