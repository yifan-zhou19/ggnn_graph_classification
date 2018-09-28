package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int n;
		int z;
		double i;
		double j;
		double a;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			i = (1.0 * y) / x;
			for (z = 2;z <= n;z++)
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
				j = (1.0 * y) / x;
				a = j - i;
					if (a > 0.05)
					{
						System.out.print("better\n");
					}
					else
					{
						if (a < -0.05)
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

