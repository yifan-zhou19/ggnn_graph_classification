package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] bingli = new int[50][2];
		double ylx;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			for (m = 0;m < 2;m++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					bingli[i][m] = Integer.parseInt(tempVar2);
				}
			}

		}

		ylx = (double)bingli[0][1] / (double)bingli[0][0];

		for (j = 1;j < n - 1;j++)
		{
			if ((double)bingli[j][1] / (double)bingli[j][0] - ylx > 0.05)
			{
				System.out.print("better\n");
			}
			else if (ylx - (double)bingli[j][1] / (double)bingli[j][0] > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}

		if (j == n - 1)
		{
			if ((double)bingli[j][1] / (double)bingli[j][0] - ylx > 0.05)
			{
				System.out.print("better");
			}
			else if (ylx - (double)bingli[j][1] / (double)bingli[j][0] > 0.05)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}
		}
		return 0;
	}
}

