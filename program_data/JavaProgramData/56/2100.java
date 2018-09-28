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
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 10000)
		{
			a = n / 10000;
			b = (n - 10000 * a) / 1000;
			c = (n - a * 10000 - b * 1000) / 100;
			d = (n - a * 10000 - b * 1000 - c * 100) / 10;
			e = n - a * 10000 - b * 1000 - c * 100 - d * 10;
			x = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		}
		if (n > 10000)
		{
			a = n / 10000;
			b = (n - 10000 * a) / 1000;
			c = (n - a * 10000 - b * 1000) / 100;
			d = (n - a * 10000 - b * 1000 - c * 100) / 10;
			e = n - a * 10000 - b * 1000 - c * 100 - d * 10;
			x = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		}
		if (n > 1000 && n < 10000)
		{
			b = n / 1000;
			c = (n - b * 1000) / 100;
			d = (n - b * 1000 - c * 100) / 10;
			e = n - b * 1000 - c * 100 - d * 10;
			x = e * 1000 + d * 100 + c * 10 + b;
		}
		if (n > 100 && n < 1000)
		{
			c = n / 100;
			d = (n - c * 100) / 10;
			e = n - c * 100 - d * 10;
			x = e * 100 + d * 10 + c;
		}
		if (n > 10 && n < 100)
		{
			d = n / 10;
			e = n - d * 10;
			x = e * 10 + d;
		}
		if (n > 0 && n < 10)
		{
			x = n;
		}
		System.out.printf("%d",x);
	}


}

