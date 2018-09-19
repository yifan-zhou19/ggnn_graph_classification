package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 10)
		{
			System.out.printf("%d\n",n);
		}
		if (n >= 10 && n < 100)
		{
			a = n % 10;
			b = (n - a) / 10;
			System.out.printf("%d%d\n",a,b);
		}
		if (n >= 100 && n < 1000)
		{
			a = n % 10;
			b = (n - a) / 10 % 10;
			c = (n - b * 10 - a) / 100;
			System.out.printf("%d%d%d\n",a,b,c);
		}
		if (n >= 1000 && n < 10000)
		{
			a = n % 10;
			b = (n - a) / 10 % 10;
			c = (n - b * 10 - a) / 100 % 10;
			d = (n - c * 100 - b * 10 - a) / 1000;
			System.out.printf("%d%d%d%d\n",a,b,c,d);
		}
		if (n == 10000)
		{
			System.out.print("00001\n");
		}
		return 0;
	}
}

