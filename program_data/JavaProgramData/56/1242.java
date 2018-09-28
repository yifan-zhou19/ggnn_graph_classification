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
		a = n / 10000;
		b = n / 1000;
		c = n / 100;
		d = n / 10;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",n % 10,d % 10,c % 10,b % 10,a);
		}
		else if (b != 0)
		{
		System.out.printf("%d%d%d%d",n % 10,d % 10,c % 10,b);
		}
		else if (c != 0)
		{
		System.out.printf("%d%d%d",n % 10,d % 10,c);
		}
		else if (d != 0)
		{
		System.out.printf("%d%d",n % 10,d);
		}
		else
		{
		System.out.printf("%d",n);
		}

		return 0;
	}

}

