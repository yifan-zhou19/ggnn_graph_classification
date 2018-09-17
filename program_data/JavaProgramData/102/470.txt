package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int l;
		int m = 0;
		int p = 0;
		double[] sz = new double[40];
		double e;
		double[] a = new double[40];
		double[] b = new double[40];
		char[][] zfc = new char[40][10];
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
				zfc[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Double.parseDouble(tempVar3);
			}
			if (zfc[i][0] == 'm')
			{
				a[m] = sz[i];
				m++;
			}
			else if (zfc[i][0] == 'f')
			{
				b[p] = sz[i];
				p++;
			}
		}
			for (k = 1;k <= m;k++)
			{
				for (l = 0;l < m - k;l++)
				{
					if (a[l] > a[l + 1])
					{
						e = a[l + 1];
						a[l + 1] = a[l];
						a[l] = e;
					}
				}
			}
			for (k = 1;k <= p;k++)
			{
				for (l = 0;l < p - k;l++)
				{
					if (b[l] < b[l + 1])
					{
						e = b[l + 1];
						b[l + 1] = b[l];
						b[l] = e;
					}
				}
			}
		for (l = 0;l < m;l++)
		{
			System.out.printf("%.2lf ",a[l]);
		}
		System.out.printf("%.2lf",b[0]);
		for (l = 1;l < p;l++)
		{
			System.out.printf(" %.2lf",b[l]);
		}
		return 0;
	}
}

