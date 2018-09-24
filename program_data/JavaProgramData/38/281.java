package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
		double[] a = new double[150];
		double b = 0;
		double c;
		double e;
		double f;
		double g;
		double S;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			b = 0;
			f = 0;
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Double.parseDouble(tempVar3);
				}
				b = b + a[j];
			}
			c = b / n;
			for (j = 1;j <= n;j++)
			{
				e = (a[j] - c) * (a[j] - c);
				f = f + e;
			}
			g = f / n;
			S = Math.sqrt(g);
			System.out.printf("%.5lf\n",S);

		}


	}


}

