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
		n = n - 10000 * a;
		b = n / 1000;
		n = n - 1000 * b;
		c = n / 100;
		n = n - 100 * c;
		d = n / 10;
		e = n - 10 * d;
		if (a != 0)
		{
			System.out.printf("%d%d%d%d%d",e,d,c,b,a);
		}
		else
		{
			if (b != 0)
			{
				System.out.printf("%d%d%d%d",e,d,c,b);
			}
			else
			{
				if (c != 0)
				{
					System.out.printf("%d%d%d",e,d,c);
				}
				else
				{
					if (d != 0)
					{
						System.out.printf("%d%d",e,d);
					}
					else
					{
						System.out.printf("%d",e);
					}
				}
			}
		}
		return 0;
	}


}

