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
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n / 1000;
		b = (n - 1000 * a) / 100;
		c = (n - 1000 * a - 100 * b) / 10;
		d = n % 10;
		if (n < 10)
		{
			System.out.printf("%d\n",n);
		}
		else if (n < 100)
		{
			System.out.printf("%d%d\n",d,c);
		}
		else if (n < 1000)
		{
			System.out.printf("%d%d%d\n",d,c,b);
		}
		else if (n < 10000)
		{
			System.out.printf("%d%d%d%d\n",d,c,b,a);
		}
	}
}

