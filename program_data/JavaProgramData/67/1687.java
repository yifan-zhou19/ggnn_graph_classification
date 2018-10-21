package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double p;
		int[][] a = new int[100][2];
		double[] s = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			s[i] = a[i][1] * 1.0 / a[i][0];
			p = s[0];
		}
		for (i = 1;i < n;i++)
		{
			if (s[i] - p > 0.05)
			{
				System.out.print("better\n");
			}
			if (p - s[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			if (s[i] - p <= 0.05 && p - s[i] <= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

