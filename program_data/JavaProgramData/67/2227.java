package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a;
		int b;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		double p;
		double q;
		p = 1.0 * b / a;
		int i;
		for (i = 1;i <= n - 1;i++)
		{
			int x;
			int y;
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				x = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				y = Integer.parseInt(tempVar5);
			}
			q = 1.0 * y / x;
			if (i == n - 1)
			{
				if (q - p > 0.05)
				{
					System.out.print("better");
				}
				else if (p - q > 0.05)
				{
					System.out.print("worse");
				}
				else
				{
					System.out.print("same");
				}
			}
			else
			{
				if (q - p > 0.05)
				{
					System.out.print("better\n");
				}
				else if (p - q > 0.05)
				{
					System.out.print("worse\n");
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

