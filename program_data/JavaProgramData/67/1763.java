package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		double b;
		double c;
		int p;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		double e = p;
		double f = q;
			c = 1.00 * f / e;
		for (int i = 1;i <= n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				y = Integer.parseInt(tempVar5);
			}
			double k = x;
			double m = y;
			b = 1.00 * m / k;
			if (b < c)
			{
				if (c - b < 0.05)
				{
					System.out.print("same\n");
				}
				else
				{
					System.out.print("worse\n");
				}
			}
			else if (b > c)
			{
				if (b - c > 0.05)
				{
					System.out.print("better\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		}
		return 0;
	}



}

