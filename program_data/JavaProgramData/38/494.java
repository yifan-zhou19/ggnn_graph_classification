package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int u;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int m;
		double q = 0; //he
		double z = 0;
		double[] a = new double[1001];
		double[] b = new double[1001]; //jie guo
		for (i = 1;i <= n;i++)
		{
			z = 0,q = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 1;j <= m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				q = q + a[j];
			}

			for (k = 1;k <= m;k++)
			{
				z = z + (a[k] - q / m) * (a[k] - q / m);
			}

			b[i] = Math.sqrt(z / m);
		}
		for (u = 1;u <= n;u++)
		{
			System.out.printf("%.5lf\n",b[u]);
		}

	}


}

