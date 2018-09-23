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
		b = (n % 1000) / 100;
		c = (n % 100) / 10;
		d = n % 10;
		if (n < 10)
		{
			System.out.printf("%d",d);
		}
		else if (n < 100)
		{
			System.out.printf("%d%d",d,c);
		}
		else if (n < 1000)
		{
			System.out.printf("%d%d%d",d,c,b);
		}
		else if (n < 10000)
		{
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
		return 0;
	}
}

