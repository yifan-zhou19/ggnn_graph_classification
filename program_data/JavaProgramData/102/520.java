package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int u;
		int t;
		int e;
		int r;
		int k;
		int l;
		int h = 0;
		int n;
		int i;
		int j;
		int m = 0;
		double[] s = new double[41];
		double[] sm = new double[41];
		double[] sf = new double[41];
		double tmp;
		double tmpp;
		char[][] z = new char[41][7];
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
				z[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s[i] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			if (z[j][0] == 'm')
			{
				 sm[m] = s[j];
				 m++;
			}
			if (z[j][0] == 'f')
			{
				sf[h] = s[j];
				h++;
			}
		}
		for (k = 1;k <= m;k++)
		{
			for (l = 0;l < m - k;l++)
			{
				if (sm[l] > sm[l + 1])
				{
					tmp = sm[l + 1];
					sm[l + 1] = sm[l];
					sm[l] = tmp;
				}
			}
		}
		for (e = 1;e <= h;e++)
		{
			for (r = 0;r < h - e;r++)
			{
				if (sf[r] < sf[r + 1])
				{
					tmpp = sf[r + 1];
					sf[r + 1] = sf[r];
					sf[r] = tmpp;
				}
			}
		}
		for (u = 0;u < m;u++)
		{
			System.out.printf("%.2lf ",sm[u]);
		}
		for (t = 0;t < h - 1;t++)
		{
			System.out.printf("%.2lf ",sf[t]);
		}
		System.out.printf("%.2lf",sf[h - 1]);
		return 0;
	}

}

