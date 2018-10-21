package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][2];
		double p0;
		double p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < 2; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				p0 = (double)a[0][1] / a[0][0];
			}
		}

		for (i = 1; i < n; i++)
		{
				p = (double)a[i][1] / a[i][0];
				if ((p - p0) > 0.05)
				{
					System.out.print("better\n");
				}
				else if ((p0 - p) > 0.05)
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

