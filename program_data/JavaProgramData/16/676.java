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
		if (n / 1000 != 0)
		{
			a = n / 1000;
			n = n - 1000 * a;
		b = n / 100;
		n = n - 100 * b;
		c = n / 10;
		d = n - 10 * c;

		System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else if (n / 100 != 0)
		{
		b = n / 100;
		n = n - 100 * b;
		c = n / 10;
		d = n - 10 * c;

		System.out.printf("%d%d%d",d,c,b);
		}
		else if (n / 10 != 0)
		{
		c = n / 10;
		d = n - 10 * c;

		System.out.printf("%d%d",d,c);
		}
		else
		{
			System.out.printf("%d\n",n);
		}

	}
}

