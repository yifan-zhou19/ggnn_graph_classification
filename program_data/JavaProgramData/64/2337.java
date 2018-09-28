package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int i;
		int j = 1;
		int n;
		int p;
		int q;
		int k = 0;
		int m;
		double[][] d = new double[10][10];
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
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}

		i = 0;

		if (n == 2)
		{
			p = i;
			q = j;
			max = Math.sqrt(1.0 * (x[i] - x[j]) * (x[i] - x[j]) + 1.0 * (y[i] - y[j]) * (y[i] - y[j]) + 1.0 * (z[i] - z[j]) * (z[i] - z[j]));
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[p],y[p],z[p],x[q],y[q],z[q],max);
			return 0;

		}

		for (i = 0;i < n;i++)
		{

			for (j = i + 1;j < n;j++)
			{

				d[i][j] = Math.sqrt(1.0 * (x[i] - x[j]) * (x[i] - x[j]) + 1.0 * (y[i] - y[j]) * (y[i] - y[j]) + 1.0 * (z[i] - z[j]) * (z[i] - z[j]));

			}

		}

		max = d[0][1];
		m = n * (n - 1) / 2;

		while (k < m)
		{

		for (i = 0;i < n;i++)
		{

			for (j = i + 1;j < n;j++)
			{

				if (max < d[i][j])
				{

					max = d[i][j];
					p = i;
					q = j;

				}

			}

		}

		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",x[p],y[p],z[p],x[q],y[q],z[q],max);

		d[p][q] = 0.0;
		k++;
		max = 0;

		}

		return 0;
	}

}

