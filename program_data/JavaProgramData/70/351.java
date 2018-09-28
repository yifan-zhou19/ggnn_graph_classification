package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		double[][] point = new double[100000][2];
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
					point[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		double max;
		max = Math.sqrt((point[0][0] - point[1][0]) * (point[0][0] - point[1][0]) + (point[0][1] - point[1][1]) * (point[0][1] - point[1][1]));
		for (i = 0;i < n - 1;i++)
		{
			for (k = 2;k < n;k++)
			{
				double z;
				z = Math.sqrt((point[i][0] - point[k][0]) * (point[i][0] - point[k][0]) + (point[i][1] - point[k][1]) * (point[i][1] - point[k][1]));
				if (z > max)
				{
					max = z;
				}
			}
		}
		System.out.printf("%.4f\n",max);
		return 0;
	}



}

