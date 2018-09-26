package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int zs;
		int yx;
		double a;
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
					zs = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					yx = Integer.parseInt(tempVar3);
				}
				a = 1.0 * yx / zs;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					zs = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					yx = Integer.parseInt(tempVar5);
				}
				if (1.0 * yx / zs - a > 0.05)
				{
					System.out.print("better\n");
				}
				else if (1.0 * yx / zs - a < -0.05)
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

