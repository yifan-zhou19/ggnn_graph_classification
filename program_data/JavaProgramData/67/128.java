package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][2];
		int i;
		int j;
		int n;
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
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		double[] yx = new double[1000];
		for (i = 0;i < n;i++)
		{
			yx[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			yx[i] = (double)sz[i][1] / sz[i][0];
		}
		double[] bj = new double[1000];
		for (i = 0;i < n;i++)
		{
			bj[i] = 0;
		}
		for (i = 1;i < n;i++)
		{
			bj[i] = yx[i] - yx[0];
		}
		for (i = 1;i < n;i++)
		{
			if (bj[i] > 0.05)
			{
				System.out.print("better\n");
			}
			if (bj[i] < -0.05)
			{
				System.out.print("worse\n");
			}
			if ((bj[i] >= -0.05) && (bj[i] <= 0.05))
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}










}

