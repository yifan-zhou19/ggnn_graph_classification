package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (;k > 0;k--)
		{
			int n;
			double[] x = new double[100];
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}

			int i;
			double add_sqr = 0;
			double a = 0;
			for (i = 0;i <= n - 1;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				add_sqr += x[i] * x[i];
				a += x[i];
			}

			add_sqr /= n;
			a /= n;

			System.out.printf("%.5lf\n",Math.sqrt(add_sqr - a * a));
		}
	}
}

