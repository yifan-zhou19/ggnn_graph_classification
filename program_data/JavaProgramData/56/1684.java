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

			else if (n < 100)
			{
				a = n % 10;
				n = n - a;
				b = n / 10;
				System.out.printf("%d%d",a,b);
			}
			else if (n < 1000)
			{
				a = n % 10;
				n = n - a;
				b = (n % 100) / 10;
				n = n - 10 * b;
				c = n / 100;
				System.out.printf("%d%d%d",a,b,c);
			}

			else if (n < 10000)
			{
				a = n % 10;
				n = n - a;
				b = (n % 100) / 10;
				n = n - 10 * b;
				c = (n % 1000) / 100;
				n = n - 100 * c;
				d = n / 1000;
				System.out.printf("%d%d%d%d",a,b,c,d);
			}

			else
			{
				a = n % 10;
				n = n - a;
				b = (n % 100) / 10;
				n = n - 10 * b;
				c = (n % 1000) / 100;
				n = n - 100 * c;
				d = (n % 10000) / 1000;
				n = n - 1000 * d;
				e = n / 10000;
				System.out.printf("%d%d%d%d%d",a,b,c,d,e);
			}

	}
}

