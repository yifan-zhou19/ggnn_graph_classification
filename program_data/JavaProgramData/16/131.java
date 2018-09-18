package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a / 1000;
		c = (a - b * 1000) / 100;
		d = (a - b * 1000 - c * 100) / 10;
		e = a - b * 1000 - c * 100 - d * 10;
		if (1000 <= a != 0 && a <= 10000)
		{
		  System.out.printf("%d%d%d%d",e,d,c,b);
		}
		else
		{
			if (100 <= a != 0 && a < 1000)
			{
				System.out.printf("%d%d%d",e,d,c);
			}
			else
			{
				if (10 <= a != 0 && a < 100)
				{
					System.out.printf("%d%d",e,d);
				}
				else
				{
					System.out.printf("%d",e);
				}
			}
		}

		return 0;
	}
}

