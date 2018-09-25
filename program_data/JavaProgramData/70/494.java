package <missing>;

public class GlobalMembers
{
	public static double[] a = new double[100];
	public static double[] t = new double[100];
	public static int Main()
	{
		int i;
		int k;
		int s;
		int u = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		double l;
		double p = 0;
		for (i = 0;i < s;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t[i] = Double.parseDouble(tempVar3);
			}
		}
			while (u < s)
			{
				for (k = u + 1;k < s;k++)
				{
					l = Math.sqrt((a[k] - a[u]) * (a[k] - a[u]) + (t[k] - t[u]) * (t[k] - t[u]));
					if (l >= p)
					{
						p = l;
					}

				}
				u++;
			}
		System.out.printf("%.4lf",p);
	return 0;
	}
}

