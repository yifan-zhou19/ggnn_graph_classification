package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int k;
		double j;
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
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		j = (double)(b * 1.000 / (a * 1.000));
		int[][] sz = new int[n - 1][2];
		for (i = 0;i <= n - 2;i++)
		{
			for (k = 0;k <= 1;k++)
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sz[i][k] = Integer.parseInt(tempVar4);
			}
			}
		}
		for (i = 0;i <= n - 2;i++)
		{
			if ((((sz[i][1] * 1.000 / (sz[i][0] * 1.000))) - j) > 0.05)
			{
			System.out.print("better\n");
			}
			else if ((((sz[i][1] * 1.000 / (sz[i][0] * 1.000))) - j) < -0.05)
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

