package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int a;
		int n;
		int result;
		int i;
		double[] sz = new double[100];
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
				x = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y = Integer.parseInt(tempVar3);
			}
			sz[i] = 1.0 * y / x;
		}
		for (i = 1;i < n;i++)
		{
			if (20 * (sz[i] - sz[0]) < -1)
			{
				System.out.print("worse\n");
			}
			else if (20 * (sz[i] - sz[0]) > 1)
			{
				System.out.print("better\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}

		return 0;
	}

}

