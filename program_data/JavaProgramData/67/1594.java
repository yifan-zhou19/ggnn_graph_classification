package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int y;
		int i;
		double jiwei;
		double tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
		jiwei = 1.0 * y / x;
		for (i = 1;i < n;i++)
		{
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
			tmp = 1.0 * y / x;
			if (tmp - jiwei > 0.05)
			{
				System.out.print("better\n");
			}
			else if (jiwei - tmp > 0.05)
			{
				System.out.print("worse\n");
			}
				else
				{
					System.out.print("same\n");
				}
		}
		return 0;
	}
}

