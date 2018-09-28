package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		double h;
		int j;
		double[] x = new double[100];
		double[] S = new double[100];
		for (j = 0;j < k;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double b = 0;
			double a;
			double c = 0;
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				b += x[i];
			}
			a = b / n;
			for (i = 0;i < n;i++)
			{
				c += ((x[i] - a) * (x[i] - a));
			}
			h = c / n;
			S[j] = Math.pow(h,0.5);
		}
		for (t = 0;t < k;t++)
		{
			System.out.printf("%.5lf\n", S[t]);
		}
		return 0;
	}



}

