package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		double[][] a = new double[100][1000];
		double[] x = new double[100];
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
			for (j = 0;j < x[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Double.parseDouble(tempVar3);
				}
			}
		}



		for (i = 0;i < n;i++)
		{
			double sum = 0;
			double s = 0;
			double m = 0;
			for (j = 0;j < x[i];j++)
			{
				sum += a[i][j];
			}
			sum = sum / x[i];
			for (j = 0;j < x[i];j++)
			{
				m = a[i][j] - sum;
				s = s + Math.pow(m,2);
			}
			m = s / x[i];
			s = Math.pow(m,0.5);
			System.out.printf("%.5lf\n",s);

		}
		return 0;
	}
}

