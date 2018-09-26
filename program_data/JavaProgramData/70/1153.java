package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double[] a = new double[200];
		double[] b = new double[200];
		double[][] d = new double[200][200];
		double k = 0;
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
							a[i] = Double.parseDouble(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							b[i] = Double.parseDouble(tempVar3);
						}
		}
		for (i = 0;i < n - 1;i++)
		{
						for (j = i + 1;j < n;j++)
						{
										  d[i][j] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
										  if (k < d[i][j])
										  {
											 k = d[i][j];
										  }
						}
		}
		System.out.printf("%.4f\n",k);
		return 0;
	}
}

