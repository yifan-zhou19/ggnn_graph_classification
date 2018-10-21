package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		double[] x = new double[100];
		double[] y = new double[100];
		double[][] z = new double[100][100];
		double max;
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
			 x[i] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 y[i] = Double.parseDouble(tempVar3);
		 }
		}
		for (i = 0;i < n;i++)
		{
		for (j = i + 1;j < n;j++)
		{
		 z[i][j] = Math.sqrt((x[j] - x[i]) * (x[j] - x[i]) + (y[j] - y[i]) * (y[j] - y[i]));
		}
		}
		max = z[0][1];
		for (i = 0;i < n - 1;i++)
		{
		   for (j = i + 1;j < n;j++)
		   {
			if (z[i][j + 1] > max)
			{
			max = z[i][j + 1];
			}
		   }
		}
		System.out.printf("%.4lf\n",max);
	}


}

