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

		if (n >= 1000)
		{
			a = n / 1000;
			b = (n - 1000 * a) / 100;
			c = (n - 1000 * a - 100 * b) / 10;
			d = n % 10;
			System.out.printf("%d%d%d%d",d,c,b,a);
		}
		else
		{
			if (n >= 100)
			{
				a = n / 100;
				b = (n - a * 100) / 10;
				c = n % 10;

			   System.out.printf("%d%d%d",c,b,a);
			}
			else
			{
				if (n >= 10)
				{
				a = n / 10;
				b = n % 10;
				System.out.printf("%d%d",b,a);
				}
				else
				{
				System.out.printf("%d",n);
				}
			}
		}
		return 0;
	}

}

