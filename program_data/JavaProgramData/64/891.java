package <missing>;

public class GlobalMembers
{
	public static double juli(int i1, int i2, int i3, int i4, int i5, int i6)
	{
		double s;
		s = Math.sqrt((i4 - i1) * (i4 - i1) + (i5 - i2) * (i5 - i2) + (i6 - i3) * (i6 - i3));
		return s;
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int q = 0;
		int m;
		double temp;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] f = new int[100];
		int[] g = new int[100];
		double[] e = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				 e[q] = juli(a[i], b[i], c[i], a[j], b[j], c[j]);
				 f[q] = i;
				 g[q] = j;
				 q++;
			}
		}
		m = n * (n - 1) / 2;

		for (k = 1; k <= m; k++)
		{
			for (i = 0; i < m - k; i++)
			{
				if (e[i] < e[i + 1])
				{
					temp = e[i + 1];
					e[i + 1] = e[i];
					e[i] = temp;

					temp = f[i + 1];
					f[i + 1] = f[i];
					f[i] = temp;

					temp = g[i + 1];
					g[i + 1] = g[i];
					g[i] = temp;
				}
			}
		}

		for (i = 0; i < m; i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[f[i]], b[f[i]], c[f[i]], a[g[i]], b[g[i]], c[g[i]], e[i]);
		}



		return 0;
	}

}

