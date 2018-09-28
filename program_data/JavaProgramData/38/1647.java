package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double[][] x = new double[100][100];
		double[] s = new double[100];
		double sum = 0;
		double[] a = new double[100];
		for (i = 0; i < k; i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   n = Integer.parseInt(tempVar2);
		   }
		   sum = 0;
		   for (j = 0; j < n; j++)
		   {
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				x[i][j] = Double.parseDouble(tempVar3);
			}
			sum += x[i][j];
		   }
		   a[i] = sum / (double)(n);
		   for (j = 0; j < n; j++)
		   {
		   s[i] += (x[i][j] - a[i]) * (x[i][j] - a[i]);
		   }
		   s[i] = s[i] / (double)(n);
		   s[i] = Math.sqrt(s[i]);
		}
		 for (i = 0; i < k; i++)
		 {
		   System.out.printf("%.5lf\n",s[i]);
		 }
		return 0;
	}
}

