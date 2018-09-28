package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int c;
		int d;
		int e;
		int f;
		c = 0;
		d = 0;
		e = 0;
		f = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 10000;i = i * 10)
		{
			b = (a % (10 * i) - a % (i)) / i;
			c = c + b * 10000 / i;
		}
		if ((c % 10) != 0)
		{
			System.out.printf("%d",c);
		}
		else
		{
			d = c / 10;
			if ((d % 10) != 0)
			{
				System.out.printf("%d",d);
			}
			else
			{
				e = d / 10;
				if ((e % 10) != 0)
				{
					System.out.printf("%d",e);
				}
				else
				{
					f = e / 10;
					if ((f % 10) != 0)
					{
						System.out.printf("%d",f);
					}
					else
					{
						System.out.printf("%d",f / 10);
					}
				}
			}
		}
	}
}

