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
		a = n / 10000;
		b = (n % 10000) / 1000;
		c = (n % 1000) / 100;
		d = (n % 100) / 10;
		e = n % 10;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0)
				{
					if (d == 0)
					{
						System.out.printf("%d",e);
					}
					else
					{
						System.out.printf("%d",e * 10 + d);
					}
				}
				else
				{
					System.out.printf("%d",e * 100 + d * 10 + c);
				}
			}
			else
			{
				System.out.printf("%d",e * 1000 + d * 100 + c * 10 + b);
			}
		}
		else
		{
			System.out.printf("%d",e * 10000 + d * 1000 + c * 100 + b * 10 + a);
		}

		return 0;
	}
}

