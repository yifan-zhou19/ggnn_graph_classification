package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double[][] a = new double[20][2];
		double[] m = new double[20];
		double max;
		int i;
		int j;
		int n;
		int p;
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
					a[i][j] = Double.parseDouble(tempVar2);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			double[] b = new double[20];
			for (j = i + 1;j < n;j++)
			{
				double t1 = Math.pow(a[i][0] - a[j][0],2);
				double t2 = Math.pow(a[i][1] - a[j][1],2);
				 b[j - i - 1] = Math.pow(t1 + t2,0.5);
			}
			m[i] = b[0];
			for (p = 0;p < n - i - 1;p++)
			{
				if (m[i] < b[p])
				{
					m[i] = b[p];
				}
			}
		}
		max = m[0];
		for (i = 0;i < n - 1;i++)
		{
			if (max < m[i])
			{
				max = m[i];
			}
		}
		System.out.printf("%.4lf\n",max);
	}


}

