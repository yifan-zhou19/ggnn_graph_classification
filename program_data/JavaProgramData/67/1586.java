package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
		int a;
		int b;
		double p;
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					x = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					y = Integer.parseInt(tempVar3);
				}
				p = 1.0 * y / x;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					a = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					b = Integer.parseInt(tempVar5);
				}
				q = 1.0 * b / a;
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

