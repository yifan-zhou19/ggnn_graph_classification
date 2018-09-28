package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		double[] sz = new double[50];
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		c = 1.0 * b / a;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b = Integer.parseInt(tempVar5);
			}
			sz[i] = 1.0 * b / a;
		}
		for (i = 0;i < n - 1;i++)
		{
			if (sz[i] - c > 0.05)
			{
				System.out.print("better\n");
			}
			else if (c - sz[i] > 0.05)
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

