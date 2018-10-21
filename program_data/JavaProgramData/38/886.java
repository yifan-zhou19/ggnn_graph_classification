package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int m;
		double s;
		double x;
		double y;
		double[] z = new double[100];
		double[][] a = new double[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = x = y = z[i] = 0.0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Double.parseDouble(tempVar3);
				}
				s += a[i][j];
			}
			x = s / m;
			for (j = 0;j < m;j++)
			{
				y += (a[i][j] - x) * (a[i][j] - x);
			}
			z[i] = Math.sqrt(y / m);

		}
		for (i = 0;i < n;i++)
		{
		System.out.printf("%.5lf\n",z[i]);
		}
	}



}

