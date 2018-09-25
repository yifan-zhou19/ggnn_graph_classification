package <missing>;

public class GlobalMembers
{
	public static void Main()
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
		a = n % 10;
		b = (n % 100 - n % 10) / 10;
		c = (n % 1000 - n % 100) / 100;
		d = (n % 10000 - n % 1000) / 1000;
		e = (n - 1000 * d - 100 * c - 10 * b - a) / 10000;
		if (e != 0)
		{
			System.out.printf("%d%d%d%d%d",a,b,c,d,e);
		}
		else
		{
			if (d != 0)
			{
				System.out.printf("%d%d%d%d",a,b,c,d);
			}
			else
			{
				if (c != 0)
				{
					System.out.printf("%d%d%d",a,b,c);
				}
				else
				{
					if (d != 0)
					{
						System.out.printf("%d%d",a,b);
					}
					else
					{
						System.out.printf("%d",a);
					}
				}
			}
		}

	}
}

