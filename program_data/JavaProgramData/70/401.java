package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		int j;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] a = new double[100][2];
		double[][] b = new double[100][100];
		double max;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Double.parseDouble(tempVar2);
				}
			}

		}
		for (i = 0;i < n;i++)
		{
			for (k = i;k < n - 1;k++)
			{
				b[i][k] = Math.sqrt(Math.pow(a[i][0] - a[1 + k][0],2) + Math.pow(a[i][1] - a[1 + k][1],2));
			}
		}
		max = b[0][0];
		for (i = 0;i < n;i++)
		{
			for (k = i;k < n - 1;k++)
			{
				if (b[i][k] > max)
				{
				max = b[i][k];
				}
			}
		}
		System.out.printf("%.4lf\n",max);


	}


}

