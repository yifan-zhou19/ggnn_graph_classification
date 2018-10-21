package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		double sum = 0;
		double sum1 = 0;
		double S;
		double a;
		double b;
		double[] sz = new double[100];

		int i = 0;
		while (i < k)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j = 0;
			while (j < n)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[j]) = Double.parseDouble(tempVar3);
				}
				sum += sz[j];
				j++;
			}
			a = (double)sum / n;

			int o = 0;
			while (o < n)
			{
				b = (sz[o] - a) * (sz[o] - a);
				sum1 += b;
				o++;
			}

			S = Math.sqrt(sum1 / n);
			System.out.printf("%.5f\n",S);

			int x = 0;
			while (x < 100)
			{
				sz[x] = 0;
				x++;
			}
	sum = 0;
	sum1 = 0;

			i++;
		}
		return 0;
	}

}

