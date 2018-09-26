package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[100];
		int i;
		int[] b = new int[100];
		int j;
		double[] c = new double[100];
		double[] sum = new double[100];
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
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				a[0] = 1;
				b[0] = 2;
				a[j + 1] = b[j];
				b[j + 1] = a[j] + b[j];
			}
			for (j = 0;j < m;j++)
			{
				 c[j] = 1.0 * b[j] / a[j];

			}

		   for (j = 0;j < m;j++)
		   {
			   sum[i] += c[j];
		   }
		}
		   for (i = 0;i < n;i++)
		   {
		   System.out.printf("%.3lf\n",sum[i]);
		   }


		return 0;
	}
}

