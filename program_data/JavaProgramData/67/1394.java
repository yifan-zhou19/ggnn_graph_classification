package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		int x;
		int y;
		double[] s = new double[100];
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
		s[0] = (double)y / x;
		for (i = 1;i < n;i++)
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
		s[i] = (double)y / x;
		if (s[i] - s[0] > 0.05)
		{
				System.out.print("better\n");
		}
			else
			{
				if (s[0] - s[i] > 0.05)
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

