package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int zs;
		int yx;
		double x;
		double y;
		double cha;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zs = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				yx = Integer.parseInt(tempVar3);
			}
			if (i == 0)
			{
				x = 100.0 * yx / zs;
			}
			else
			{
				y = 100.0 * yx / zs;
				cha = x - y;
				if (cha > 5)
				{
					System.out.print("worse\n");
				}
				else if (cha < -5)
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

